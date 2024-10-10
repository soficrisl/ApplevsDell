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
      ExcelManager x = new ExcelManager(); 
      int[] array = x.GetValues(); 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
       

    }
}
