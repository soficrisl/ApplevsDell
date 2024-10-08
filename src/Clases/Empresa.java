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
public final class Empresa extends Thread{
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
    private Almacen storage;  
    private boolean fault; 
    private int pmcounter; 
    private final int[] cantidadTrabajadores;
    private int indiceTrabajador ;
    
    
    public Empresa(String nombre,int num_empleados, int capacidad_almacenamiento,int days_hand_in, int days_in_mls, int CSprice, int CGCprice){
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
        this.storage = new Almacen (CSprice, CGCprice); 
        this.fault = false; 
        this.pmcounter = 3; 
        this.cantidadTrabajadores= new int[6];
        this.indiceTrabajador=0;
        initialize_workers();
        
     }
    /*Sofi antes que me explotes a preguntas
    Añadi agregar trabajador osea arregle lo anterior , como amo el switch JAJAJAJAJAJ funciona con los dos arrays cuando se ñade uno especifico 
    se suma +1 en su posicion.
    Añadi inicializar initialize workers para que siempre inicialize con 1 por lo menos de cada 1
    Restableci workers para que apenas se añada un trabajador se cree un hilo para que chambee
    la verdad siento que me falta algo pero no me pegues si no me acuerdo pipipi, en si lo probe con souts y funcionaba
    a tambien cambie a empresa a final para facilidad de inicar workers
    aaa me acorde revisando, hay que ajustar las cosas para cada empresa*/
public void agregarTrabajador(String tipoTrabajador, Almacen almacen, int cantidadComponentes) {
    switch (tipoTrabajador) {
        case "ensamblador":
            cantidadTrabajadores[0]++;
            empleados[indiceTrabajador] = new Ensamblador(almacen, this);
            break;
        case "placa base":
            cantidadTrabajadores[1]++;
            empleados[indiceTrabajador] = new Empleado("placa base", almacen, cantidadComponentes, this.days_in_mls, this);
            break;
        case "memoria ram":
            cantidadTrabajadores[2]++;
            empleados[indiceTrabajador] = new Empleado("memoria ram", almacen, cantidadComponentes, this.days_in_mls, this);
            break;
        case "tarjetas graficas":
            cantidadTrabajadores[3]++;
            empleados[indiceTrabajador] = new Empleado("tarjetas graficas", almacen, cantidadComponentes, this.days_in_mls, this);
            break;
        case "fuente":
            cantidadTrabajadores[4]++;
            empleados[indiceTrabajador] = new Empleado("fuente", almacen, cantidadComponentes, this.days_in_mls, this);
            break;
        case "Cpus":
            cantidadTrabajadores[5]++;
            empleados[indiceTrabajador] = new Empleado("Cpus", almacen, cantidadComponentes, this.days_in_mls, this);
            break;
    }
    indiceTrabajador++;
}

public int[] getCantidadTrabajadores() {
    return cantidadTrabajadores;
}

public Object[] getTrabajadores() {
    return empleados;
}
public void initialize_workers() {// aqui varia las cantidaddes componentes que se añade segun nosotros , osea lo del numero de carnet luego se soluciona
    agregarTrabajador("ensamblador", this.storage, 0);
    agregarTrabajador("placa base", this.storage, 1);
    agregarTrabajador("memoria ram", this.storage, 1);
    agregarTrabajador("tarjetas graficas", this.storage, 1);
    agregarTrabajador("fuente", this.storage, 1);
    agregarTrabajador("Cpus", this.storage, 1);
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
    
    
   public void paying_workers(){
    for (int i = 0; i < getNum_empleados(); i++) {
        Object workerObject = getEmpleados()[i];
        if (i == 0) {
            addProductioncosts(50); 
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
    //trabaje todo como objetos asi fue mas facil
public void work_business() {
    while (true) {
        Thread[] threads = new Thread[getNum_empleados()];//esto es para revisar constantemente revisando el array
        for (int i = 0; i < getNum_empleados(); i++) {
            final Object workerObject = getEmpleados()[i];//y esto evita errores de concurrencia.... no lo sabia, literal fue porq un video de youtube me explico
            if (workerObject != null) { 
                threads[i] = new Thread(() -> {
                    if (workerObject instanceof Ensamblador) {
                        Ensamblador ensamblador = (Ensamblador) workerObject;
                        ensamblador.work();
                    } else if (workerObject instanceof Empleado) {
                        Empleado empleado = (Empleado) workerObject;
                        empleado.work();
                    }
                });
                threads[i].start();
            } else {
                threads[i] = null; //sofi esto es por si el objeto es null para que no se creen hilos extra ps
            }
        }
      
        getPm().work();
        getDirector().work();
        try {
            Thread.sleep(getDays_in_mls() / 24);
            paying_workers();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt(); 
            Thread.currentThread().interrupt(); 
            return; 
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

