/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Katiuska Torres
 */
public class Empleado extends Thread {
    private String tipo_empleado;
    private int sueldo_por_hora;
    private Almacen almacen;
    private int cantidadComponentes;
    private int tiempoSleep;
    private int days_mls; 
    private Empresa business; 

    public Empleado(String tipo_empleado, int sueldo_por_hora, Almacen almacen, int cantidadComponentes, int tiempoSleep, int days_mls, Empresa business) {
        this.tipo_empleado = tipo_empleado;
        this.sueldo_por_hora = sueldo_por_hora;
        this.almacen = almacen;
        this.cantidadComponentes = cantidadComponentes;
        this.tiempoSleep = tiempoSleep;
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

    public float getSueldo_por_hora() {
        return sueldo_por_hora;
    }

    public void setSueldo_por_hora(int sueldo_por_hora) {
        this.sueldo_por_hora = sueldo_por_hora;
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

    public int getTiempoSleep() {
        return tiempoSleep;
    }

    public void setTiempoSleep(int tiempoSleep) {
        this.tiempoSleep = tiempoSleep;
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
            
                int tardar_trabajo= tiempoSleep*days_mls/1000;
                System.out.println(tardar_trabajo);
                Thread.sleep(tardar_trabajo); 
                almacen.Almacenar(tipo_empleado, cantidadComponentes);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
        }
    }




}