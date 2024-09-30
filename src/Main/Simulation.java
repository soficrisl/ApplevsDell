/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Empresa;

/**
 *
 * @author Katiuska Torres
 */

public class Simulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Empresa apple = new Empresa("apple", 20, 10, 4, 1000); 
        apple.work();
    }
}
