/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Katiuska Torres
 */
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Project_Manager extends Thread {
    private Semaphore semaforo;
    private int sueldo;
    private boolean state;  //True working, false anime 
    private int days_mls; 
    private Empresa business; 
    
    public Project_Manager(Empresa business ,int sueldo){
        this.sueldo=sueldo;
        this.semaforo= new Semaphore(1);
        this.days_mls = business.getDays_in_mls();
        this.state = true; 
        this.business = business; 
    }

    
    public void work(){
        int counter_hours = 0; 
        int counter_half = 0;
        while (counter_hours < 16) {
            /*
            if (state) {
                System.out.println("working");
            }else {
                System.out.println("anime");
            }*/
            try {
                Thread.sleep(days_mls / 48);
                setState(!isState()); 
                if (counter_half == 0){
                    counter_half++; 
                } else {
                    counter_hours++; 
                    counter_half--; 
                    //System.out.println("\\");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Project_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setState(true);
        if (getBusiness().getCounter_days() > 0) {
            getBusiness().setCounter_days(getBusiness().getCounter_days() -1);
        }else {
           // VER QUE HACER AQUI 
        }
        try {
            Thread.sleep((days_mls/24)*8);
        } catch (InterruptedException ex) {
            Logger.getLogger(Project_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getDays_mls() {
        return days_mls;
    }

    public void setDays_mls(int days_mls) {
        this.days_mls = days_mls;
    }

    public Empresa getBusiness() {
        return business;
    }

    public void setBusiness(Empresa business) {
        this.business = business;
    }
    
    
    
}
