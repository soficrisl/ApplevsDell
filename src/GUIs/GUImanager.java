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
