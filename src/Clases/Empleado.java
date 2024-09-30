package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Katiuska Torres
 */
public class Empleado extends Thread {
        private String tipo_empleado;
        private int sueldo_por_hora;
        private int horas_de_trabajo;
    
    public Empleado(String tipo_empleado , int sueldo_por_hora){
        this.tipo_empleado=tipo_empleado;
        this.sueldo_por_hora=sueldo_por_hora;
        this.horas_de_trabajo=0;
    }

    
    public void Trabajar(){
    //Logica Trabajo
    }
    public void cobrarSueldo(){
    //Logica de sueldo
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

    public int getHoras_de_trabajo() {
        return horas_de_trabajo;
    }

    public void setHoras_de_trabajo(int horas_de_trabajo) {
        this.horas_de_trabajo = horas_de_trabajo;
    }
    public class Productores_de_placa_base extends Empleado {
    public Productores_de_placa_base(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Productor placa base", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}
    public class Productores_de_CPUs extends Empleado {
    public Productores_de_CPUs(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Productor CPUs", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}
     public class Productores_de_Memoria_RAM extends Empleado {
    public Productores_de_Memoria_RAM(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Productor Memoria RAM", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}
          public class Productores_de_Fuente_de_alimentación extends Empleado {
    public Productores_de_Fuente_de_alimentación(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Productor Fuente de alimentacion", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}
          public class Productores_de_tarjetas_gráficas extends Empleado {
    public Productores_de_tarjetas_gráficas(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Productor de tarjetas graficas", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}
  public class Ensambladores extends Empleado {
    public Ensambladores(String tipo_empleado, int sueldo_por_hora, int horas_de_trabajo) {
        super("Ensamblador", sueldo_por_hora);
    }
    @Override
    public void Trabajar() {
        System.out.println("Trabajo");
    }
    @Override
    public void cobrarSueldo() {
        System.out.println("Trabajo");
    }
}              
}
