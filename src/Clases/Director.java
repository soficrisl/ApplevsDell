package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Katiuska Torres
 */
import java.time.Duration;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random; 

public class Director extends Thread{
    private int contador_dias;
    private Semaphore semaforo;
    private int sueldo;
    private Empresa business; 
    private int days_mls; 
    private boolean state; // true administrative false acountability
    
    public Director(Empresa business,int sueldo){
        this.contador_dias=contador_dias;
        this.sueldo=sueldo;
        this.semaforo= new Semaphore(1);
        this.business = business;
        this.days_mls = business.getDays_in_mls(); 
        this.state = true; 
    }
    public void Revisar_contador_dias(){
    }
    public void Enviar_computadoras(){
    }
    public void Registrar_ganancias(){
    }

    public int getContador_dias() {
        return contador_dias;
    }

    public void setContador_dias(int contador_dias) {
        this.contador_dias = contador_dias;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void accountability () {
        try {
            Thread.sleep(getDays_mls());
            Almacen storage = getBusiness().getStorage();
            int gains [] = storage.Checkout(); 
            getBusiness().setBrutegains(gains[0] + gains[1]);
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void work() {
        if (getBusiness().getCounter_days() > 0) {
            setState(true); 
            administrative(); 
        } else {
            setState(false);
            accountability(); 
            getBusiness().change_Days(1);
        }
    } 
    
    public void administrative () {
        
        Random rand = new Random();
        int choice = rand.nextInt(24); 
        boolean flag = false; 
        long min = (getDays_mls()/1)*(1/24)*(1/60);
        try {
            Thread.sleep(getDays_mls()*choice/24);
            int min_passed = 0; 
            Project_Manager pm = getBusiness().getPm(); 
                while (min_passed != 35) {
                    if (!pm.isState()) {
                        flag = true; 
                        }
                    Thread.sleep(min);
                    min_passed++; 
                    }
                
                if (flag) {
                    pm.setFaults(pm.getFaults()+1);
                    getBusiness().setFault(true); 
                }
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
        
      
    
    public Empresa getBusiness() {
        return business;
    }

    public void setBusiness(Empresa business) {
        this.business = business;
    }

    public int getDays_mls() {
        return days_mls;
    }

    public void setDays_mls(int days_mls) {
        this.days_mls = days_mls;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
    
}
