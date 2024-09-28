/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Katiuska Torres
 */
import java.util.concurrent.Semaphore;
public class Director {
    private int contador_dias;
    private Semaphore semaforo;
    private int sueldo;
    
    public Director(int contador_dias,int sueldo){
        this.contador_dias=contador_dias;
        this.sueldo=sueldo;
        this.semaforo= new Semaphore(1);
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
    
    
}
