/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Katiuska Torres
 */
public class Dias extends Thread{ 
        
    private String nombre;

    @Override
    public void run(){
        int counter = 0; 
        while (true) {
            try{
            System.out.println("Day" +  counter);
            Thread.sleep(10000);}
            catch(InterruptedException e) {
            System.out.println("Error: " + e.getMessage());}
            counter++;
        }
}
    
}
