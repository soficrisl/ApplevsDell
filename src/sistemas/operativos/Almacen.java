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
public class Almacen {
    private int placa_base;
    private int Cpus;
    private int tarjetas_graficas;
    private int memoria_ram;
    private int fuente_alimentacion;
    private int CompuStandard;
    private int CompuTarjeta;
    private int contadorStandardsA = 0;
    private int contadorStandardsD = 0;
    private final Semaphore semaforo;
    
    public Almacen(int placa_base, int Cpus, int tarjetas_graficas, int memoria_ram, int fuente_alimentacion,int CompuStandard,int CompuTarjeta){
     
        this.placa_base=placa_base;
        this.Cpus=Cpus;
        this.tarjetas_graficas=tarjetas_graficas;
        this.memoria_ram=memoria_ram;
        this.fuente_alimentacion=fuente_alimentacion;
        this.CompuStandard=CompuStandard;
        this.CompuTarjeta=CompuTarjeta;
        this.semaforo=new Semaphore(1);
    }
public void Almacenar(String nombre_comp,int cantidad){
    try{
        semaforo.acquire();
        switch(nombre_comp){
            case "placa base" -> {
                if (placa_base+cantidad<25){
                    placa_base+=cantidad;
                    System.out.println("mira se añadio "+ cantidad+ "a placas base");
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


 




}

