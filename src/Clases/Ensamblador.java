/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



/**
 *
 * @author Katiuska Torres
 */
public class Ensamblador {
    private Almacen Almacen;
    private String Empresa;
    private int sueldo_por_hora;
    private int horas_de_trabajo;
     
    public Ensamblador( int sueldo_por_hora, int horas_de_trabajo,String Empresa,Almacen Almacen) {
        this.sueldo_por_hora=sueldo_por_hora;
        this.horas_de_trabajo=horas_de_trabajo;
    }
    
    public void Trabajar() {
        System.out.println("Trabajo");
    }
  
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}

