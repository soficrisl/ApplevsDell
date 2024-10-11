/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import Clases.Empresa;
import Filereading.ExcelManager;

/**
 *
 * @author Sofia
 */
public class GUIfunctions {
    
    public static void openSim(int array[]){ 
        int [] apple;
        int [] dell; 
        int [] simulation = {2000, 20}; ;
        if (array.length == 1) {   
            ExcelManager manager = new ExcelManager(); 
            int [] obtain = manager.GetValues();
            if (obtain.length == 1) {
                apple = new int [1]; 
                dell = new int [1]; 
            } else { 
                apple = new int [6];
                dell = new int [6];
                for (int i = 0; i < 2; i++) {
                    simulation[i] = obtain[i]; 
                }
                for (int i = 2; i < 8; i++) {
                    apple[i-2] = obtain[i]; 
                }
                for (int i = 8; i < 14; i++) {
                    dell[i-8] = obtain[i]; 
                }
            }
        } else {
            apple = new int [6];
            dell = new int [6];
            for (int i = 0; i < 2; i++) {
                    simulation[i] = array[i]; 
                }
                for (int i = 2; i < 8; i++) {
                    apple[i-2] = array[i]; 
                }
                for (int i = 8; i < 14; i++) {
                    dell[i-8] = array[i]; 
                }      
        }
        //Empresa Apple    
        int [] productsapple = {1,1,1,5,1}; 
        int [] daysapple = {4,4,1,1,2}; 
        System.out.println(simulation[1]);
        System.out.println(simulation[0]);
        Empresa applebusinness = new Empresa(0,18,productsapple, simulation[1], simulation[0], 100, 150, apple, daysapple);
        
        //Empresa  Dell
        int [] productsdell = {1,1,2,3,1}; 
        int [] daysdell = {3,3,1,1,3}; 
        Empresa dellbusinness = new Empresa(1,15,productsdell, simulation[1], simulation[0], 80, 120, dell, daysdell); 

                //Valores de apple --------------------------------------
        BothGUI gui = new BothGUI(applebusinness, dellbusinness);  
        gui.setVisible(true);
        applebusinness.start();
        dellbusinness.start(); 
        GUImanager observer = new GUImanager(gui, applebusinness, dellbusinness); 
        observer.start(); 
        
    }
    public static void closeSim(int array []){  {
         ExcelManager manager = new ExcelManager(); 
         manager.Write_Csv(array);
         System.exit(0);
    }
        
    }
    
}
