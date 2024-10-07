/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filereading;

import java.io.*;  
import java.util.Scanner;  
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Sofia
 */



/*
0 = duracion de dias
1 = deadline 
3 = ensambladores 
4 =placa base
5 =  cpu 
6 = ram 
7 = fuente 
8 = tarjetas 




*/
public class ExcelManager {
   private String path; 
   private int Array []; 
   private int max_workers; 

    public ExcelManager(String path, int max_workers) {
        this.path = path;
        this.max_workers = max_workers;
    }
   
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getArray() {
        return Array;
    }

    public void setArray(int[] Array) {
        this.Array = Array;
    }

    public int [] GetValues () {
        int base [] = {0}; 
        File file = new File(getPath()); 
        Scanner sc; 
       try {
           sc = new Scanner(file);
           sc.useDelimiter(","); 
           int counter = 6; 
           int sum = 0; 
           int [] array = getArray();
           
           for (int i = 2; i < 10; i++) {
               sum += array[i]; 
           }
           if (sum == getMax_workers() && array[0] > 0  && array[1] > 0) {
                while (sc.hasNext()) {
                    
               
                }
           } else {
               return base; 
           }
           

           sc.close(); 
       } catch (FileNotFoundException ex) {
           Logger.getLogger(ExcelManager.class.getName()).log(Level.SEVERE, null, ex);
       }

        return base; 
    }

    public int getMax_workers() {
        return max_workers;
    }

    public void setMax_workers(int max_workers) {
        this.max_workers = max_workers;
    }
   
   
    
    
}
