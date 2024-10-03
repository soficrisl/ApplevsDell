/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



/**
 *
 * @author Katiuska Torres
 */
public class Ensamblador extends Thread{
    private Almacen almacen;
    private Empresa business;
    private int days_mls; 
    private int contadorCompuStandard=0;
     
   public Ensamblador(Almacen almacen, Empresa business) {
        this.almacen = almacen;
        this.business = business;
        this.days_mls = business.getDays_in_mls();
    }
   @Override
   public void run(){
   work();}
    public void work() {
        while (true) {
            try {
                

                if (business.getNombre().equals("Apple")) {
                    
                    if (almacen.getPlaca_base() >= 2 && almacen.getCpus() >= 1 && almacen.getMemoria_ram() >= 4 && almacen.getFuente_alimentacion() >= 4) {
                            Thread.sleep(2*days_mls);
                            almacen.getSemaforo().acquire(); 
                            if (contadorCompuStandard >= 5 && almacen.getTarjetas_graficas() >=2 ) {
                                
                                almacen.setPlaca_base(almacen.getPlaca_base() - 2);
                                almacen.setCpus(almacen.getCpus() - 1);
                                almacen.setMemoria_ram(almacen.getMemoria_ram() - 4);
                                almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 4);
                                almacen.setTarjetas_graficas(almacen.getTarjetas_graficas() - 2);
                                almacen.setCompuTarjeta(almacen.getCompuTarjeta() + 1);
                                contadorCompuStandard = 0;
                                almacen.getSemaforo().release(); 
                                Thread.sleep(2*days_mls);
                                almacen.getSemaforo().acquire();
                            }
                            almacen.setPlaca_base(almacen.getPlaca_base() - 2);
                            almacen.setCpus(almacen.getCpus() - 1);
                            almacen.setMemoria_ram(almacen.getMemoria_ram() - 4);
                            almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 4);
                            almacen.setCompuStandard(almacen.getCompuStandard() + 1);
                            contadorCompuStandard++;
                            
                    }
                    
                } else if (business.getNombre().equals("Dell")) {
                    
                    if (almacen.getPlaca_base() >= 1 && almacen.getCpus() >= 5 && almacen.getMemoria_ram() >= 6 && almacen.getFuente_alimentacion() >= 5 ) {
                        Thread.sleep(2*days_mls);
                        
                        almacen.getSemaforo().acquire(); 
                        if (contadorCompuStandard >= 3 && almacen.getTarjetas_graficas() >=1) {
                                
                                almacen.setPlaca_base(almacen.getPlaca_base() - 1);
                                almacen.setCpus(almacen.getCpus() - 5);
                                almacen.setMemoria_ram(almacen.getMemoria_ram() - 6);
                                almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 5);
                                almacen.setTarjetas_graficas(almacen.getTarjetas_graficas() - 1);
                                almacen.setCompuTarjeta(almacen.getCompuTarjeta() + 1);
                                contadorCompuStandard = 0;
                                almacen.getSemaforo().release(); 
                                Thread.sleep(2*days_mls);
                                almacen.getSemaforo().acquire();
                    }
                        almacen.setPlaca_base(almacen.getPlaca_base() - 1);
                        almacen.setCpus(almacen.getCpus() - 5);
                        almacen.setMemoria_ram(almacen.getMemoria_ram() - 6);
                        almacen.setFuente_alimentacion(almacen.getFuente_alimentacion() - 5);
                        almacen.setCompuStandard(almacen.getCompuStandard() + 1);
                        contadorCompuStandard++;
                        
                    
                    }
                    
                }

                almacen.getSemaforo().release(); 

                
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

