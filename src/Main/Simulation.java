/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Almacen;
import Clases.Empleado;
import Clases.Empresa;
import Clases.Ensamblador;
import Filereading.ExcelManager;


/**
 *
 * @author Santiago Fernandez
 */

public class Simulation {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args)  {
        int [] apple  = {0};
        int [] dell  = {0};
      int [] productsapple = {1,1,1,5,1}; 
        int [] daysapple = {4,4,1,1,2}; 
        Empresa applebusinness = new Empresa(0,18,productsapple, 4, 10000, 100, 150, apple, daysapple);
        
        //Empresa  Dell
        int [] productsdell = {1,1,2,3,1}; 
        int [] daysdell = {3,3,1,1,3}; 
        Empresa dellbusinness = new Empresa(1,18,productsdell, 4, 10000, 80, 120, dell, daysdell);
        
        while (true) {
            applebusinness.work_business(); 
            dellbusinness.work_business(); 
        }
       

    }
}
