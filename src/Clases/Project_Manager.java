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
    private int sueldo;
    private boolean state;  //True working, false anime 
    private int days_mls; 
    private Empresa business;
    private int faults; 
    private int salary_discounted; 
    
    public Project_Manager(Empresa business ,int sueldo){
        this.sueldo=sueldo;
        this.days_mls = business.getDays_in_mls();
        this.state = true; 
        this.business = business; 
        this.faults = 0; 
        this.salary_discounted = 0; 
    }

    
    public void change_state() {
        int counter_hours = 0; 
        int counter_half = 0;
        while (counter_hours < 16) {
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
    }
    
    @Override 
    public void run (){
        
            work(); 
        
    }
          
    
    public void work(){
        while (true) {
        setSalary_discounted(getFaults() *100); 
        change_state(); 
        if (getBusiness().getCounter_days() == 0 ) {
            try {
                Thread.sleep((days_mls/24)*8);
            } catch (InterruptedException ex) {
                Logger.getLogger(Project_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            change_state();
            try {
                Thread.sleep((days_mls/24)*8);
            } catch (InterruptedException ex) {
                Logger.getLogger(Project_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            work();
        } else {
            try {
                Thread.sleep((days_mls/24)*8);
            } catch (InterruptedException ex) {
                Logger.getLogger(Project_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            getBusiness().change_Days(0);
        }
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

    public int getFaults() {
        return faults;
    }

    public void setFaults(int faults) {
        this.faults = faults;
    }

    public int getSalary_discounted() {
        return salary_discounted;
    }

    public void setSalary_discounted(int salary_discounted) {
        this.salary_discounted += salary_discounted;
    }
    
    
    
}
