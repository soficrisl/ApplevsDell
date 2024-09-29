/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Katiuska Torres
 */
import java.time.Duration;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Director extends Thread{
    private int contador_dias;
    private Semaphore semaforo;
    private int sueldo;
    Empresa business; 
    private int days_mls; 
    
    public Director(Empresa business,int sueldo){
        this.contador_dias=contador_dias;
        this.sueldo=sueldo;
        this.semaforo= new Semaphore(1);
        this.business = business;
        this.days_mls = business.getDays_in_mls(); 
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
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void work() {
        if (business.getCounter_days() > 0) {
        } else {
            accountability(); 
            business.setCounter_days(getBusiness().getDays_to_hand_in());
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
    
    
    
    
}