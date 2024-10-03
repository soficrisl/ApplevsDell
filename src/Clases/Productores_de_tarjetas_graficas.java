/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago Fernandez
 */
package Clases;



public class Productores_de_tarjetas_graficas extends Empleado {
    public Productores_de_tarjetas_graficas(Almacen almacen, int cantidadComponentes, int tiempoSleep,Empresa business) {
        super("tarjetas graficas", 200, almacen, cantidadComponentes, tiempoSleep,business.getDays_in_mls(), business);
    }
}
