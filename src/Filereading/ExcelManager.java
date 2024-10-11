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
Empresa A 
2 = ensambladores 
3 =placa base
4 =  cpu 
5 = ram 
6 = fuente 
7 = tarjetas 
Empresa B 
10 = ensambladores 
11 =placa base
12 =  cpu 
13 = ram 
14 = fuente 
15 = tarjetas 




*/
public class ExcelManager {

    public ExcelManager() {
    }
public void Write_Csv( int[] datos){
        try (PrintWriter writer = new PrintWriter(new FileWriter("test\\personas.csv"))) {
       

        // Escribir los datos del array
        writer.println(datos[0] + "\r\n" + datos[1] + "\r\n" + datos[2] + "\r\n" + datos[3] + "\r\n" + datos[4] + "\r\n" + datos[5] + "\r\n" + datos[6] + "\r\n" + datos[7] + "\r\n" + datos[8] + "\r\n" + datos[9] + "\r\n" + datos[10] + "\r\n" + datos[11] + "\r\n" + datos[12] + "\r\n" + datos[13]);
    } catch (IOException e) {
        System.err.println("Error al escribir el archivo CSV: " + e.getMessage());
    }}
    public int [] GetValues () {
        int [] base = {0}; 
        String path = "test\\personas.csv";
        File file = new File(path);
        int [] csv = new int[14];
        Scanner sc; 
        boolean flag = false; 
        try {
           sc = new Scanner(file);
           sc.useDelimiter(","); 
           while (sc.hasNext()) {
                String m = sc.next(); 
                String [] first = m.split("\r\n"); 
                String h; 
                for (int i = 0; i < first.length; i++) {
                    h = first[i];
                    int s = Integer.parseInt(h); 
                }
                
                for (int i = 0; i < first.length; i++) {
                   csv[i] = Integer.parseInt(first[i]); 
                   flag = true; 
               }
                
                
           }
           sc.close(); 
       } catch (FileNotFoundException ex) {
           Logger.getLogger(ExcelManager.class.getName()).log(Level.SEVERE, null, ex);
       }
       if (flag) {
            return csv; 
       } else {
            return base;  
       }
    }

    
    }