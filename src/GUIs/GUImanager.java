/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import Clases.Empresa;

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
           if (window.getWorkmbapple() != apple.getCantidadTrabajadores()[0]) {
               
           }
        }
    }
    
   
}
