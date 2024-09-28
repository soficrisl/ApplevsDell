/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Santiago Fernandez
 */
import java.util.concurrent.Semaphore;
public class Empresa {
    private String nombre;
    private int num_empleados;
    private int capacidad_almacenamiento;
    private Semaphore semaforo;
    
    public Empresa(String nombre,int num_empleados, int capacidad_almacenamiento){
        this.nombre=nombre;
        this.num_empleados=num_empleados;
        this.capacidad_almacenamiento=capacidad_almacenamiento;
        this.semaforo=new Semaphore(1);
     }
    public void Agregar_empleado(Empleado empleado) {
        //donde ppondre alguna logica agregar
}   
    public void Producir_componentes(){
    //donde pondre mi logica
    }
    public void Alamcenar_componentes(Componente componente){
        //donde pondre mi logica
    }
    public void sacar_Componentes(Componente componente){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_empleados() {
        return num_empleados;
    }

    public void setNum_empleados(int num_empleados) {
        this.num_empleados = num_empleados;
    }

    public int getCapacidad_almacenamiento() {
        return capacidad_almacenamiento;
    }

    public void setCapacidad_almacenamiento(int capacidad_almacenamiento) {
        this.capacidad_almacenamiento = capacidad_almacenamiento;
    }
    
}
