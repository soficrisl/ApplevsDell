/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;
import Clases.Almacen;
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
    int placaBaseProgress = (int) ((apple.getStorage().getPlaca_base() / 25.0) * 100);
    int cpuProgress = (int) ((apple.getStorage().getCpus() / 20.0) * 100);
    int graphicCardProgress = (int) ((apple.getStorage().getTarjetas_graficas() / 10.0) * 100);
    int ramProgress = (int) ((apple.getStorage().getMemoria_ram() / 55.0) * 100);
    int powerSupplyProgress = (int) ((apple.getStorage().getFuente_alimentacion() / 35.0) * 100);
     int placaBaseProgress1 = (int) ((dell.getStorage().getPlaca_base() / 25.0) * 100);
    int cpuProgress1 = (int) ((dell.getStorage().getCpus() / 20.0) * 100);
    int graphicCardProgress1 = (int) ((dell.getStorage().getTarjetas_graficas() / 10.0) * 100);
    int ramProgress1 = (int) ((dell.getStorage().getMemoria_ram() / 55.0) * 100);
    int powerSupplyProgress1 = (int) ((dell.getStorage().getFuente_alimentacion() / 35.0) * 100);

    if (window.getBarcpusapple() != cpuProgress) {
        window.setbarcpusapple(cpuProgress);
    }
    if (window.getBarcpusdell() != cpuProgress1) {
        window.setbarcpusdell(cpuProgress1);
    }
    if (window.getBargraphicapple() != graphicCardProgress) {
        window.setbargraphicapple(graphicCardProgress);
    }
    if (window.getBargraphicdell() != graphicCardProgress1) {
        window.setbargraphicdell(graphicCardProgress1);
    }
    if (window.getBarmotherapple() != placaBaseProgress) {
        window.setbarmotherapple(placaBaseProgress);
    }
    if (window.getBarmotherdell() != placaBaseProgress1) {
        window.setbarmotherdell(placaBaseProgress1);
    }
    if (window.getBarpowerapple() != powerSupplyProgress) {
        window.setbarpowerapple(powerSupplyProgress);
    }
    if (window.getBarpowerdell() != powerSupplyProgress1) {
        window.setbarpowerdell(powerSupplyProgress1);
    }
    if (window.getBarramapple() != ramProgress) {
        window.setbarramapple(ramProgress);
    }
    if (window.getBarramdell() != ramProgress1) {
        window.setbarramdell(ramProgress1);
    }

           if (window.getWorkassemapple() != apple.getCantidadTrabajadores()[0]) {
               window.setworkassemapple(String.valueOf(apple.getCantidadTrabajadores()[0]));
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
           

        }}
    }
    
   
}
