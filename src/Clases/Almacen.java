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
import java.util.Random; 
        
public class Almacen {
    private int placa_base;
    private int Cpus;
    private int tarjetas_graficas;
    private int memoria_ram;
    private int fuente_alimentacion;
    private int CompuStandard;
    private int CompuTarjeta;
    private final Semaphore semaforo;
    private int CSprice; 
    private int CGCprice; 
    
    public Almacen(int CSprice, int CGCprice){
        this.placa_base=0;
        this.Cpus=0;
        this.tarjetas_graficas=0;
        this.memoria_ram=0;
        this.fuente_alimentacion=0;
        this.CompuStandard=0;
        this.CompuTarjeta=0;
        this.semaforo=new Semaphore(1);
        this.CSprice = CSprice; 
        this.CGCprice = CGCprice; 
             
    }

    
public void Almacenar(String nombre_comp,int cantidad){
    try{
        semaforo.acquire();
        switch(nombre_comp){
            case "placa base" -> {
                if (placa_base+cantidad<25){
                    placa_base+=cantidad;
                    System.out.println("mira se añadio "+ cantidad+ "  placas base");
                }else{
                    System.out.println("Mira el almacen esta lleno no se puede hacer nada");
                }
            }
                
            case "Cpus" -> {
                if (Cpus+cantidad<20){
                    Cpus+=cantidad;
                    System.out.println("mira se añadio " + cantidad+" Cpus");
                    
                }else{System.out.println("mira no se pudo añadir");
                }
            }
                
            case "tarjetas graficas" -> {
                if (tarjetas_graficas+cantidad<10){
                    tarjetas_graficas+=cantidad;
                    System.out.println("mira se añadio "+ cantidad+" tarjetas graficas");
                    
                }else{System.out.println("mira no se pudo añadir");
                }
            }
                
            case "memoria ram" -> {
                if (memoria_ram+cantidad<55){
                    memoria_ram+=cantidad;
                    System.out.println("mira se añadio "+ cantidad+" Memoria RAM");
                    
                }else{System.out.println("mira no se pudo añadir");
                }
            }
                
            case "fuente" -> {
                if (fuente_alimentacion+cantidad<35){
                    fuente_alimentacion+=cantidad;
                    System.out.println("mira se añadio "+ cantidad+" Fuentes de alimentacion");
                    
                }else{System.out.println("mira no se pudo añadir");
                }
            }
            default -> System.out.println("metiste mal el nombre de la componente");
           
                }
            semaforo.release();
            }catch (InterruptedException e){
                System.out.println("Algo fallo");
            }
    
}

    public int [] Checkout() {
        int gain [] = new int[2]; 
        try {
            semaforo.acquire();
            int gainCS = getCompuStandard()*getCSprice();
            int gainCGC = getCompuTarjeta()*getCGCprice(); 
            gain[0] = gainCS; 
            gain[1] = gainCGC; 
            setCompuStandard(0); 
            setCompuTarjeta(0); 
            semaforo.release();
          
        } catch (InterruptedException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gain; 
    }
    

    public int getCompuStandard() {
        return CompuStandard;
    }

    public void setCompuStandard(int CompuStandard) {
        this.CompuStandard = CompuStandard;
    }

    public int getCompuTarjeta() {
        return CompuTarjeta;
    }

    public void setCompuTarjeta(int CompuTarjeta) {
        this.CompuTarjeta = CompuTarjeta;
    }

    public int getCSprice() {
        return CSprice;
    }

    public void setCSprice(int CSprice) {
        this.CSprice = CSprice;
    }

    public int getCGCprice() {
        return CGCprice;
    }

    public void setCGCprice(int CGCprice) {
        this.CGCprice = CGCprice;
    }

    public int getPlaca_base() {
        return placa_base;
    }

    public void setPlaca_base(int placa_base) {
        this.placa_base = placa_base;
    }

    public int getCpus() {
        return Cpus;
    }

    public void setCpus(int Cpus) {
        this.Cpus = Cpus;
    }

    public int getTarjetas_graficas() {
        return tarjetas_graficas;
    }

    public void setTarjetas_graficas(int tarjetas_graficas) {
        this.tarjetas_graficas = tarjetas_graficas;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public int getFuente_alimentacion() {
        return fuente_alimentacion;
    }

    public void setFuente_alimentacion(int fuente_alimentacion) {
        this.fuente_alimentacion = fuente_alimentacion;
    }
    
    
    public Semaphore getSemaforo() {
        return semaforo;
    }
 


 

}

