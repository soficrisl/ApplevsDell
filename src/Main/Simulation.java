/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Almacen;
import Clases.Empleado;
import Clases.Empresa;
import Clases.Ensamblador;


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
       
  
    int[] workertype = {0,1, 2, 3, 4, 5};
    Almacen almacen = new Almacen(100, 200);
    Empresa business = new Empresa("Apple", 6, 1000, 30, 2000, 100, 200, workertype);
     
    Ensamblador employee1 = new Ensamblador(almacen, business);
    Empleado employee2 = new Empleado("memoria ram", almacen, 2, business.getDays_in_mls(), business);
    Empleado employee3 = new Empleado("fuente", almacen, 3, business.getDays_in_mls(), business);
    Empleado employee4 = new Empleado("tarjetas graficas", almacen, 1, business.getDays_in_mls(), business);
    Empleado employee5 = new Empleado("Cpus", almacen, 2, business.getDays_in_mls(), business);
    Empleado employee6 = new Empleado("placa base", almacen, 2, business.getDays_in_mls(), business);

    // Agregar empleados a la empresa
    business.getEmpleados()[0] = employee1;
    business.getEmpleados()[1] = employee2;
    business.getEmpleados()[2] = employee3;
    business.getEmpleados()[3] = employee4;
    business.getEmpleados()[4] = employee5;
    business.getEmpleados()[5] = employee6;
    business.work_business();

       

    }
}
