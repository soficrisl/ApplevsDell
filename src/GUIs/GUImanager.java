/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import Clases.Empresa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia
 */
public class GUImanager  extends Thread{
    private BothGUI window; 
    private Empresa apple; 
    private Empresa dell; 

    public GUImanager(BothGUI window, Empresa apple, Empresa dell) {
        this.window = window;
        this.apple = apple; 
        this.dell = dell; 
    }
    
    @Override 
    public void run() {
        
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUImanager.class.getName()).log(Level.SEVERE, null, ex);
            }
           if (window.getWorkassemapple() != apple.getCantidadTrabajadores()[0]) {
               window.setworkassemapple(String.valueOf(apple.getCantidadTrabajadores()[0]));
           }
           
           if (window.getcoundown()!= apple.getCounter_days()) {
               window.setcoundown(apple.getCounter_days());
           }
            if (window.getWorkassemdell() != dell.getCantidadTrabajadores()[0]) {
               window.setworkassemdell(String.valueOf(dell.getCantidadTrabajadores()[0]));
           }
           if (window.getWorkmbapple()!= apple.getCantidadTrabajadores()[1]) {
               window.setworkmbapple(String.valueOf(apple.getCantidadTrabajadores()[1]));
           }
           if (window.getWorkmbdell()!= dell.getCantidadTrabajadores()[1]) {
               window.setworkmbdell(String.valueOf(dell.getCantidadTrabajadores()[1]));
           }
           if (window.getWorkramdell()!= dell.getCantidadTrabajadores()[2]) {
               window.setworkramdell(String.valueOf(dell.getCantidadTrabajadores()[2]));
           }
           if (window.getWorkramapple()!= apple.getCantidadTrabajadores()[2]) {
               window.setworkramapple(String.valueOf(apple.getCantidadTrabajadores()[2]));
           }
           if (window.getWorkgraphicapple()!= apple.getCantidadTrabajadores()[3]) {
               window.setworkgraphicapple(String.valueOf(apple.getCantidadTrabajadores()[3]));
           }
           if (window.getWorkgraphicdell()!= dell.getCantidadTrabajadores()[3]) {
               window.setworkgraphicdell(String.valueOf(dell.getCantidadTrabajadores()[3]));
           }
           if (window.getWorkpowerdell()!= dell.getCantidadTrabajadores()[4]) {
               window.setworkpowerdell(String.valueOf(dell.getCantidadTrabajadores()[4]));
           }
           if (window.getWorkpowerapple()!= apple.getCantidadTrabajadores()[4]) {
               window.setworkpowerapple(String.valueOf(apple.getCantidadTrabajadores()[4]));
           }
           if (window.getWorkcpuapple()!= apple.getCantidadTrabajadores()[5]) {
               window.setworkcpuapple(String.valueOf(apple.getCantidadTrabajadores()[5]));
           }
           if (window.getWorkcpudell()!= dell.getCantidadTrabajadores()[5]) {
               window.setworkcpudell(String.valueOf(dell.getCantidadTrabajadores()[5]));
           }
           if (window.getMbdell() != dell.getStorage().getPlaca_base()) {
                window.setmbdell(String.valueOf(dell.getStorage().getPlaca_base()));
                }

            if (window.getRamdell() != dell.getStorage().getMemoria_ram()) {
                window.setramdell(String.valueOf(dell.getStorage().getMemoria_ram()));
            }

            if (window.getPowerdell() != dell.getStorage().getFuente_alimentacion()) {
                window.setpowerdell(String.valueOf(dell.getStorage().getFuente_alimentacion()));
            }

            if (window.getCpudell() != dell.getStorage().getCpus()) {
                window.setcpudell(String.valueOf(dell.getStorage().getCpus()));
            }

            if (window.getGraphicdell() != dell.getStorage().getTarjetas_graficas()) {
                window.setgraphicdell(String.valueOf(dell.getStorage().getTarjetas_graficas()));
            }

            if (window.getStandardpcdell() != dell.getStorage().getCompuStandard()) {
                window.setstandardpcdell(String.valueOf(dell.getStorage().getCompuStandard()));
            }
            /*
            if (window.getPmstatedell() != dell.getStorage.getCSprice()) {
                window.setpmstatedell(String.valueOf(dell.getStorage().getCSprice()));
            }
            */
            if (window.getGraphicpcdell() != dell.getStorage().getCompuTarjeta()) {
                window.setgraphicpcdell(String.valueOf(dell.getStorage().getCompuTarjeta()));
            }

            // Apple properties
            if (window.getMbapple() != apple.getStorage().getPlaca_base()) {
                window.setmbapple(String.valueOf(apple.getStorage().getPlaca_base()));
            }

            if (window.getRamapple() != apple.getStorage().getMemoria_ram()) {
                window.setramapple(String.valueOf(apple.getStorage().getMemoria_ram()));
            }

            if (window.getPowerapple() != apple.getStorage().getFuente_alimentacion()) {
                window.setpowerapple(String.valueOf(apple.getStorage().getFuente_alimentacion()));
            }

            if (window.getCpuapple() != apple.getStorage().getCpus()) {
                window.setcpuapple(String.valueOf(apple.getStorage().getCpus()));
            }

            if (window.getGraphicapple() != apple.getStorage().getTarjetas_graficas()) {
                window.setgraphicapple(String.valueOf(apple.getStorage().getTarjetas_graficas()));
            }

            if (window.getStandardpcapple() != apple.getStorage().getCompuStandard()) {
                window.setstandardpcapple(String.valueOf(apple.getStorage().getCompuStandard()));
            }

            if (window.getGraphicpcapple() != apple.getStorage().getCompuTarjeta()) {
                window.setgraphicpcapple(String.valueOf(apple.getStorage().getCompuTarjeta()));
            }
            
            if (!apple.getDirector().isState()){
                window.setdirectorapple("account");
            }   
            if (apple.getDirector().isState()){
                   window.setdirectorapple("admin");
               }
            if (!dell.getDirector().isState()){
                    window.setdirectordell("account");
                } 
            if (dell.getDirector().isState()){
                    window.setdirectordell("admin");
                }
 
            if (window.getFoulsdell() != dell.getPm().getFaults()) {
                window.setfoulsdell(String.valueOf(dell.getPm().getFaults()));
            }
            if (window.getDiscounteddell() != dell.getPm().getFaults()) {
                window.setdiscounteddell(String.valueOf(dell.getPm().getSalary_discounted()));
            }
            
            if (window.getFoulsapple() != apple.getPm().getFaults()) {
                window.setfoulsapple(String.valueOf(apple.getPm().getFaults()));
                }
            if (window.getDiscountedapple() != apple.getPm().getFaults()) {
                window.setdiscountedapple(String.valueOf(apple.getPm().getSalary_discounted()));
            }
            if (!apple.getPm().isState()){
                    window.setpmstateapple("anime");
                }
            if (apple.getPm().isState()){
                    window.setpmstateapple("work");
                }
            
            if (!dell.getPm().isState()){
                    window.setpmstatedell("anime");
                }
            if (dell.getPm().isState()){
                    window.setpmstatedell("work");
                }     
                    }
                }
    
    
                
   
}
