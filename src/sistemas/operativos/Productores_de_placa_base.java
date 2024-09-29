/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

import sistemas.operativos.Almacen;
import sistemas.operativos.Empleado;
import sistemas.operativos.Empresa;

/**
 *
 * @author Santiago Fernandez
 */
public class Productores_de_placa_base extends Empleado {
    public Productores_de_placa_base(Almacen almacen, int cantidadComponentes, int tiempoSleep, Empresa business) {
        super("placa base", 100, almacen, cantidadComponentes, tiempoSleep, business.getDays_in_mls(), business);
    }
}
