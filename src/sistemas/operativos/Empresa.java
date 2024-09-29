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
public class Empresa extends Thread{
    private String nombre;
    private int num_empleados;
    private int capacidad_almacenamiento;
    private Semaphore semaforo;
    private int days_to_hand_in; 
    private int days_in_mls; 
    private Empleado empleados[];
    private Project_Manager pm; 
    private Director director; 
    private int counter_days; 
    
    public Empresa(String nombre,int num_empleados, int capacidad_almacenamiento,int days_hand_in, int days_in_mls){
        this.nombre=nombre;
        this.num_empleados=num_empleados;
        this.capacidad_almacenamiento=capacidad_almacenamiento;
        this.semaforo=new Semaphore(1);
        this.days_to_hand_in = days_hand_in; 
        this.days_in_mls = days_in_mls; 
        this.empleados = new Empleado [num_empleados]; 
        this.pm = new Project_Manager(this, 50); 
        this.director = new Director(this, 50); 
        this.counter_days = days_hand_in;
        
     }
    public void Agregar_empleado(Empleado empleado) {
        //donde ppondre alguna logica agregar
}   
    public void Producir_componentes(){
    //donde pondre mi logica
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
    
 public void work() {
    System.out.println("Contador dias:" + days_to_hand_in);
    int mimi = 0; 
    for (Empleado empleado : empleados) {
            if (empleado != null) {
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        empleado.work();
                    }
                };
                thread.start();
            }
        }
    while (mimi < 25) {
        System.out.println("Contador dias:" + counter_days);
        director.work();
        pm.work(); 
        
        mimi++; 
    }
}
    

    public int getDays_to_hand_in() {
        return days_to_hand_in;
    }

    public void setDays_to_hand_in(int days_to_hand_in) {
        this.days_to_hand_in = days_to_hand_in;
    }

    public int getDays_in_mls() {
        return days_in_mls;
    }

    public void setDays_in_mls(int days_in_mls) {
        this.days_in_mls = days_in_mls;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Project_Manager getPm() {
        return pm;
    }

    public void setPm(Project_Manager pm) {
        this.pm = pm;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getCounter_days() {
        return counter_days;
    }

    public void setCounter_days(int counter_days) {
        this.counter_days = counter_days;
    }
    
   
    
    
}