



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases;
/**
 *
 * @author Santiago Fernandez
 */
public class Empleado extends Thread {

    private String tipo_empleado;
    private Almacen almacen;
    private int cantidadComponentes;
    private int days_mls; 
    private Empresa business; 
    

    public Empleado(String tipo_empleado, Almacen almacen, int cantidadComponentes, int days_mls, Empresa business) {
        this.tipo_empleado = tipo_empleado;
        this.almacen = almacen;
        this.cantidadComponentes = cantidadComponentes;
        this.business = business;
        this.days_mls = business.getDays_in_mls();
        
    }
    public void cobrarSueldo() {
        // Logica de sueldo
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public int getCantidadComponentes() {
        return cantidadComponentes;
    }

    public void setCantidadComponentes(int cantidadComponentes) {
        this.cantidadComponentes = cantidadComponentes;
    }

    public int getDays_mls() {
        return days_mls;
    }

    public void setDays_mls(int days_mls) {
        this.days_mls = days_mls;
    }

    public Empresa getBusiness() {
        return business;
    }

    public void setBusiness(Empresa business) {
        this.business = business;
    }

    @Override
    public void run() {
        work();
    }

   public void work() {
        while (true) {
            try {
                int tiempoSleep = getTiempoSleepEmpleado(tipo_empleado);
                int tardar_trabajo= tiempoSleep*days_mls/1000;
                Thread.sleep(tardar_trabajo); 
                almacen.Almacenar(tipo_empleado, cantidadComponentes);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
        }
    }

private int getTiempoSleepEmpleado(String tipo_empleado) {
    switch (tipo_empleado) {
        case "placa base":
            return 2000; 
        case "memoria ram":
            return 3000; 
        case "fuente":
            return 4000;
        case "tarjetas graficas":
            return 7000;
        case "CPUs":
            return 6000;
        default:
            return 10000; 
    }
}


}