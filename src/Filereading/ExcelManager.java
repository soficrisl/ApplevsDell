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
2 = ensambladores 
3 =placa base
4 =  cpu 
5 = ram 
6 = fuente 
7 = tarjetas 




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
        int [] base = {0}; 
        File file = new File(getPath()); 
        Scanner sc; 
        int [] csv = new int[8]; 
        int counter = 0; 
        int sum = 0; 
        boolean flag = false; 
       try {
           sc = new Scanner(file);
           sc.useDelimiter(","); 
           while (sc.hasNext()){
               csv[counter] = Integer.parseInt(sc.next());
           }
           
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
