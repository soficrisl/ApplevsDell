/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Fernandez
 */
public class Empresa extends Thread{
    private String nombre;
    private int num_empleados;
    private int capacidad_almacenamiento;
    private final Semaphore semaforo;
    private int days_to_hand_in; 
    private int days_in_mls; 
    private Object[] empleados;
    private Project_Manager pm; 
    private Director director; 
    private int counter_days; 
    private int brutegains; 
    private int productioncosts; 
    private int totalstate;
    private Almacen storage;  
    private int [] workertype; // 0 = ensambladores 1 = fuentes de alimentacion 2 = cpus 3 = ram 4 = base 5= tarjetas 
    private boolean fault; 
    private int pmcounter; 
    
    
    
    public Empresa(String nombre,int num_empleados, int capacidad_almacenamiento,int days_hand_in, int days_in_mls, int CSprice, int CGCprice, int type[]){
        this.nombre=nombre;
        this.num_empleados=num_empleados;
        this.capacidad_almacenamiento=capacidad_almacenamiento;
        this.days_to_hand_in = days_hand_in; 
        this.days_in_mls = days_in_mls; 
        this.empleados = new Object[num_empleados];
        this.semaforo=new Semaphore(1);
        this.counter_days = days_hand_in;
        this.pm = new Project_Manager(this, 40); 
        this.director = new Director(this, 60); 
        this.brutegains = 0;
        this.productioncosts =0; 
        this.totalstate = 0; 
        this.storage = new Almacen (CSprice, CGCprice); 
        this.workertype = type; 
        this.fault = false; 
        this.pmcounter = 3; 
        
     }
public void Agregar_ensamblador() {
    if (this.empleados == null) {
        this.empleados = new Empleado[1];
        this.empleados[0] = new Ensamblador(this.storage, this);
        System.out.println("Ensamblador agregado con éxito");
    } else {
        System.out.println("El ensamblador ya ha sido agregado");
    }
}

public void Agregar_empleado(String tipo_empleado, int cantidadComponentes) {
    if (this.empleados != null && this.empleados.length < this.num_empleados) {
        Empleado[] nuevosEmpleados = new Empleado[this.empleados.length + 1];
        System.arraycopy(this.empleados, 0, nuevosEmpleados, 0, this.empleados.length);
        this.empleados = nuevosEmpleados;
        this.empleados[this.empleados.length - 1] = new Empleado(tipo_empleado, this.storage, cantidadComponentes, this.days_in_mls, this);
        this.num_empleados--;
        System.out.println("Empleado agregado con éxito");
    } else {
        System.out.println("No se puede agregar más empleados");
    }
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
    
    
    

    public void initialize_workers() {
        //Inicializamos el numero minimo de trabajadores, al cargar los archivos se debe verificar que ninguno sea 0. 
        int counter = getNum_empleados() - 1; 
        for (int i = 0; i < 6; i++) {
            int array [] = getWorkertype(); 
            int j = array[i]; 
            while (j> 0) {
                switch(i) {
                    case 0 -> {
                        //Crear cada trabajador y ponerlo en el array
                    }
                    case 1 -> {
                        
                    }
                    case 2 -> {
                        
                    }
                    case 3 -> {
                        
                    }
                    case 4 -> {
                        
                    }
                    case 5 -> {
                        
                    }
                }
                
            }
            
        }
        
        
    }
    
   public void paying_workers(){
    for (int i = 0; i < getNum_empleados(); i++) {
        Object workerObject = getEmpleados()[i];
        if (i == 0) {
            addProductioncosts(50); // Costo de producción del ensamblador
        } else {
            Empleado worker = (Empleado) workerObject;
            switch(worker.getTipo_empleado()){
                case "placa base" -> {
                    addProductioncosts(20); 
                }
                case "Cpus" -> {
                    addProductioncosts(26); 
                }
                case "tarjetas graficas" -> {
                    addProductioncosts(34); 
                }
                case "memoria ram" -> {
                    addProductioncosts(40); 
                }
                case "fuente" -> {
                    addProductioncosts(16); 
                }
                default -> System.out.println("metiste mal el nombre del empleado");   
            }
        }
    }
    
    //Paying the director 
    addProductioncosts(60); 
    //Paying the project manager; 
    if (isFault()) {
        if (getPmcounter()!=1) {
            setPmcounter(0); 
        }else {
            addProductioncosts(20);
            setPmcounter(1);
        }
    } else {
       addProductioncosts(40);  
    }
}
    
public void work_business() {
    while (true) {
        Thread[] threads = new Thread[getNum_empleados()];
        for (int i = 0; i < getNum_empleados(); i++) {
            Object workerObject = getEmpleados()[i];
            if (i == 0) {
                Ensamblador ensamblador = (Ensamblador) workerObject;
                threads[i] = new Thread(() -> ensamblador.work());
                threads[i].start();
            } else {
                Empleado worker = (Empleado) workerObject;
                threads[i] = new Thread(() -> worker.work());
                threads[i].start();
            }
        }
      
        getPm().work();
        getDirector().work();
        try {
            Thread.sleep(getDays_in_mls() / 24);
            paying_workers();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt(); // Re-interrupt the current thread
            Thread.currentThread().interrupt(); // Re-interrupt the current thread
            return; // Salir del método
        }
    }
}
    public void change_Days(int i) {
        try {
            semaforo.acquire();
            if (i== 0) {
                setCounter_days(getCounter_days() -1); 
            }else {
                setCounter_days(getDays_to_hand_in());
            }
            semaforo.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
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

    public Object[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Object[] empleados) {
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

    public int getBrutegains() {
        return brutegains;
    }

    public void setBrutegains(int brutegains) {
        this.brutegains = brutegains;
    }

    public int getProductioncosts() {
        return productioncosts;
    }

    public void setProductioncosts(int productioncosts) {
        this.productioncosts = productioncosts;
    }
    
    public void addProductioncosts(int productioncosts) {
        this.productioncosts += productioncosts;
    }
    

    public Almacen getStorage() {
        return storage;
    }

    public void setStorage(Almacen storage) {
        this.storage = storage;
    }

    public int[] getWorkertype() {
        return workertype;
    }

    public void setWorkertype(int[] workertype) {
        this.workertype = workertype;
    }

    public boolean isFault() {
        return fault;
    }

    public void setFault(boolean fault) {
        this.fault = fault;
    }

    public int getPmcounter() {
        return pmcounter;
    }

    public void setPmcounter(int i) {
        if (i == 0) {
           this.pmcounter -= 1;
        } else {
            this.pmcounter = 3; 
        }
        
    }
    
    
   
    
    
}

