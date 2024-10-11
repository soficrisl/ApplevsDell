/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Katiuska Torres
 */
public class Ensamblador extends Thread{
    private Almacen almacen;
    private Empresa business;
    private int days_mls; 
    private int contadorCompuStandard=0;
    private int f;
    private boolean started;
    
    
   public Ensamblador(Almacen almacen, Empresa business) {
        this.almacen = almacen;
        this.business = business;
        this.days_mls = business.getDays_in_mls();
        this.f = business.getNombre(); 
        this.started = false;
    }
   
   @Override
   public void run(){
    work();
   }
   
   public void start() {
        if (!started) {
            super.start();
            started = true;
        }
    }
   

   
   public void work() {
        while (true) {
                if (f == 0) {
                    int placa=almacen.getPlaca_base();
                    int cpu =almacen.getCpus();
                    int ram =almacen.getMemoria_ram();
                    int fuente =almacen.getFuente_alimentacion();
                    int graf=almacen.getTarjetas_graficas();
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                    if (placa >= 2 && cpu >= 1 &&  ram>= 4 &&  fuente>= 4) {
                        try {
                            Thread.sleep(2*days_mls);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try { 
                            almacen.getSemaforo().acquire();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            if (contadorCompuStandard >= 5 && graf >=2 ) {
                             
                                almacen.setPlaca_base(almacen.getPlaca_base() - 2);
                                almacen.setCpus(almacen.getCpus() - 1);
                                almacen.setMemoria_ram(almacen.getMemoria_ram() - 4);
                                almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 4);
                                almacen.setTarjetas_graficas(almacen.getTarjetas_graficas() - 2);
                                almacen.setCompuTarjeta(almacen.getCompuTarjeta() + 1);
                                contadorCompuStandard = 0;
                                System.out.println("papi se creo una compuuu");
                                almacen.getSemaforo().release(); 
                                continue;
                            }
                            almacen.setPlaca_base(almacen.getPlaca_base() - 2);
                            almacen.setCpus(almacen.getCpus() - 1);
                            almacen.setMemoria_ram(almacen.getMemoria_ram() - 4);
                            almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 4);
                            almacen.setCompuStandard(almacen.getCompuStandard() + 1);
                            contadorCompuStandard++;
                            System.out.println("papi se creo una compu");
                            almacen.getSemaforo().release();
                    }
                    
                } else if (f == 1) {
                    int placa=almacen.getPlaca_base();
                    int cpu =almacen.getCpus();
                    int ram =almacen.getMemoria_ram();
                    int fuente =almacen.getFuente_alimentacion();
                    int graf=almacen.getTarjetas_graficas();
                    if (placa >= 1 && cpu >= 5 && ram >= 6 && fuente >= 5 ) {
                        try {
                            Thread.sleep(2*days_mls);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        try { 
                            almacen.getSemaforo().acquire();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (contadorCompuStandard >= 3 && graf >=1) {
                                
                                almacen.setPlaca_base(almacen.getPlaca_base() - 1);
                                almacen.setCpus(almacen.getCpus() - 5);
                                almacen.setMemoria_ram(almacen.getMemoria_ram() - 6);
                                almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 5);
                                almacen.setTarjetas_graficas(almacen.getTarjetas_graficas() - 1);
                                almacen.setCompuTarjeta(almacen.getCompuTarjeta() + 1);
                                contadorCompuStandard = 0;
                                almacen.getSemaforo().release(); 
                                continue;
                    }
                        almacen.setPlaca_base(almacen.getPlaca_base() - 1);
                        almacen.setCpus(almacen.getCpus() - 5);
                        almacen.setMemoria_ram(almacen.getMemoria_ram() - 6);
                        almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 5);
                        almacen.setCompuStandard(almacen.getCompuStandard() + 1);
                        contadorCompuStandard++;
                        almacen.getSemaforo().release();
                    
                    }
                     
                }

                

                
                
        
        }
    }
}

