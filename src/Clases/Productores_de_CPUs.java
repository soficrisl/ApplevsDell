/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author Santiago Fernandez
 */
public class Productores_de_CPUs extends Empleado {
    public Productores_de_CPUs(Almacen almacen, int cantidadComponentes, int tiempoSleep, Empresa business) {
        super("Cpus", 150, almacen, cantidadComponentes, tiempoSleep, business.getDays_in_mls(), business);
    }
}
    

