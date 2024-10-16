/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import GUIs.GUImanager;
import GUIs.GUImanager;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Fernandez y sofi Leon 
 */



/*
Capacidad array
0 - placa base 
1 - cpu
2- Ram
3- fuente 
4- tarjetas
*/

/*
Array cantidad de trabajadores 
0 - placa base 
1 - cpu
2- Ram
3- fuente 
4- tarjetas
5- ensambladores

*/


public final class Empresa extends Thread{
    private int nombre; 
    private int num_empleados; 
    private int [] capacidad_almacenamiento; 
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
    private int [] day_w; 
    private int [] beginning;
    
   
    
    public Empresa(int nombre,int num_empleados, int [] capacidad_almacenamiento,int days_hand_in, int days_in_mls, int CSprice, int CGCprice, int[] worker_cuantity, int[]day_worker){
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
        this.cantidadTrabajadores= new int [6]; 
        this.beginning = worker_cuantity; 
        this.indiceTrabajador=0;
        this.day_w = day_worker; 
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
public void agregarTrabajador(String tipoTrabajador, Almacen almacen) {
    boolean flag = false; 
    int counter = 0; 
    boolean found = false; 
    try{
    while (!flag) {
        if (empleados[counter] == null) {
            indiceTrabajador = counter;          
            found = true; 
            flag = true;
            
        }
        counter++; 
    }
    
    if (flag) {
        switch (tipoTrabajador) {
        case "ensamblador":
            cantidadTrabajadores[0]++;
            Ensamblador nuevo =new Ensamblador(almacen, this);
            empleados[indiceTrabajador] = nuevo;
            nuevo.start();
            break;
        case "placa base":
            cantidadTrabajadores[1]++;
            Empleado nuevo2 = new Empleado("placa base", almacen, capacidad_almacenamiento[0], this.days_in_mls, this, day_w[0]);
            empleados[indiceTrabajador] = nuevo2;
            nuevo2.start();
            break;
        case "memoria ram":
            cantidadTrabajadores[2]++;
            Empleado nuevo3 = new Empleado("memoria ram", almacen,capacidad_almacenamiento[2], this.days_in_mls, this, day_w[2]);
            empleados[indiceTrabajador]  = nuevo3; 
            nuevo3.start();
            
            break;
        case "tarjetas graficas":
            cantidadTrabajadores[3]++;
            Empleado nuevo4 =new Empleado("tarjetas graficas", almacen, capacidad_almacenamiento[4], this.days_in_mls, this, day_w[4]);
            empleados[indiceTrabajador] = nuevo4;
            nuevo4.start();
            break;
        case "fuente":
            cantidadTrabajadores[4]++;
            Empleado nuevo5 = new Empleado("fuente", almacen, capacidad_almacenamiento[3], this.days_in_mls, this, day_w[3]);
            empleados[indiceTrabajador] = nuevo5;
            nuevo5.start();
            break;
        case "Cpus":
            cantidadTrabajadores[5]++;
            Empleado nuevo6 = new Empleado("Cpus", almacen, capacidad_almacenamiento[1], this.days_in_mls, this, day_w[1]);
            empleados[indiceTrabajador] = nuevo6;
            nuevo6.start();
            break;
        }
    } else {
        System.out.println("No se puede agregar mas");
    }}catch(Exception e){
    JOptionPane.showMessageDialog(null, "No se pueden agregar mas");}
    
    }

public String EliminarTrabajador(String tipoTrabajador, Almacen almacen) {
    String completado = "Se elimino el trabajador"; 
    String error = "No puedes eliminar cuando hay un solo trabajador de este tipo"; 
    boolean flag = false; 
    boolean deleted = false; 
    int counter = 0; 
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    switch (tipoTrabajador) {
        case "ensamblador":
            if (cantidadTrabajadores[0] != 1) {
                cantidadTrabajadores[0] --;
                while (!deleted) {
                    if ((empleados[counter] instanceof Ensamblador)) {
                       Ensamblador n = (Ensamblador) empleados[counter]; 
                       n.interrupt();
                       empleados[counter] = null; 
                       deleted = true; 
                        System.out.println("se borro");
                    }
                    counter++; 
                }
            } else {
                flag = true; 
            }
            break; 
        case "placa base":
             if (cantidadTrabajadores[1] != 1) {
                cantidadTrabajadores[1] --;
                Empleado n; 
                while (!deleted && counter< getNum_empleados()) {
                    if (!(empleados[counter] instanceof Ensamblador)) {
                        n = (Empleado) empleados[counter]; 
                        if (n != null) {
                            if (n.getTipo_empleado().equals("placa base")) {
                            empleados[counter] = null; 
                            n.interrupt();
                            deleted = true; 
                            
                        }
                        }
                    }
                    counter++; 
                }
            } else {
                flag = true; 
            }
             break;
        case "memoria ram":
            if (cantidadTrabajadores[2] != 1) {
                cantidadTrabajadores[2]--;
                Empleado n; 
                while (!deleted && counter< getNum_empleados()) {
                    if (!(empleados[counter] instanceof Ensamblador)) {
                        n = (Empleado) empleados[counter]; 
                        if (n!= null) {
                            if (n.getTipo_empleado().equals("memoria ram")) {
                            empleados[counter] = null;
                            n.interrupt();
                            deleted = true; 
                        }
                        }
                         
                    } counter++;
                } 
            }else {
                flag = true; 
            }
            break;
        case "tarjetas graficas":
            if (cantidadTrabajadores[3] != 1) {
                cantidadTrabajadores[3]--;
                Empleado n; 
                while (!deleted && counter< getNum_empleados()) {
                    if (!(empleados[counter] instanceof Ensamblador)) {
                        n = (Empleado) empleados[counter]; 
                        if (n != null) {
                            if (n.getTipo_empleado().equals("tarjetas graficas")) {
                            empleados[counter] = null; 
                            n.interrupt();
                            deleted = true; 
                        }
                        }
                        
                    }counter++; 
                }
            } else {
                flag = true; 
            }
                break;
        case "fuente":
            if (cantidadTrabajadores[4] != 1) {
                cantidadTrabajadores[4]--;
                Empleado n; 
                while (!deleted && counter< getNum_empleados()) {
                    if (!(empleados[counter] instanceof Ensamblador)) {
                        n = (Empleado) empleados[counter]; 
                        if (n != null) {
                            if (n.getTipo_empleado().equals("fuente")) {
                            empleados[counter] = null; 
                            n.interrupt();
                            deleted = true; 
                        }
                        }
                         
                    }counter++;
                }
            } else {
             flag = true; 
            }
            break;
        case "Cpus":
            if (cantidadTrabajadores[5] != 1) {
                cantidadTrabajadores[5]--;
                Empleado n; 
                while (!deleted && counter< getNum_empleados()) {
                    if (!(empleados[counter] instanceof Ensamblador)) {
                        n = (Empleado) empleados[counter]; 
                        if (n != null) {
                            if (n.getTipo_empleado().equals("Cpus")) {
                            empleados[counter] = null;
                            n.interrupt();
                            deleted = true; 
                        }
                        }
                        
                    }counter++; 
                }
            } else {
                flag = true; 
            }
            break;       
    }
    if (flag) {
        return error; 
    } else {
        return completado; 
    }
}

public int[] getCantidadTrabajadores() {
    return cantidadTrabajadores;
}

public Object[] getTrabajadores() {
    return empleados;
}
public void initialize_workers() {// 
    if (beginning.length == 1) {
        agregarTrabajador("ensamblador", this.storage); 
        agregarTrabajador("placa base", this.storage);
        agregarTrabajador("memoria ram", this.storage);
        agregarTrabajador("tarjetas graficas", this.storage);
        agregarTrabajador("Cpus", this.storage);
 
    } else {
        for (int i = 0; i < beginning.length; i++) {
            if (i == 0) {
                for (int j = 0; j < beginning[i]; j++) {
                    agregarTrabajador("placa base", this.storage);
                }
            } else if (i == 1) {
                for (int j = 0; j < beginning[i]; j++) {
                    agregarTrabajador("Cpus", this.storage);
                }
            } else if (i==2) {
                for (int j = 0; j < beginning[i]; j++) {
                    agregarTrabajador("memoria ram", this.storage);
                }
            } else if (i==3) {
                for (int j = 0; j < beginning[i]; j++) {
                    agregarTrabajador("fuente", this.storage);
                } 
            } else if (i==4) {
                for (int j = 0; j < beginning[i]; j++) {
                   agregarTrabajador("tarjetas graficas", this.storage);
                }         
            } else if (i==5) {
                for (int j = 0; j < beginning[i]; j++) {
                   agregarTrabajador("ensamblador", this.storage); 
                }  
            }
        }
       
    }
    
    
}
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getNum_empleados() {
        return num_empleados;
    }

    public void setNum_empleados(int num_empleados) {
        this.num_empleados = num_empleados;
    }

  
   public void paying_workers(){
    for (int i = 0; i < getCantidadTrabajadores().length; i++) 
        //Ensamblador
        if (i == 0) {
            addProductioncosts(50 * getCantidadTrabajadores()[0]); 
        //placa base 
        } else if (i == 1) {
             addProductioncosts(20 * getCantidadTrabajadores()[1]); 
         //Memoria Ram
        } else if (i ==2) {
             addProductioncosts(40 * getCantidadTrabajadores()[2]); 
        //tarjetas graficas
        } else if (i ==3) {
             addProductioncosts(34 * getCantidadTrabajadores()[3]); 
         //Fuentes de alimentación
        } else if (i == 4) {
            addProductioncosts(16 *  getCantidadTrabajadores()[4] );
         //CPus
        } else if (i == 5) {
            addProductioncosts(26 *  getCantidadTrabajadores()[5] ); 
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
   
  @Override
  public void run (){
      work_business(); 
  }
   
  
  public void create_thread(){
      
      
      
  }
   
    //trabaje todo como objetos asi fue mas facil
public void work_business() {
       
        for (int i = 0; i < getNum_empleados(); i++) {
            final Object workerObject = getEmpleados()[i];//y esto evita errores de concurrencia.... no lo sabia, literal fue porq un video de youtube me explico
            if (workerObject != null) { 
                if (workerObject instanceof Ensamblador) {
                        Ensamblador ensamblador = (Ensamblador) workerObject;
                        if (!ensamblador.isAlive()) {
                            ensamblador.start();
                            System.out.println("Ensam trabajando");
                            }
                } else if (workerObject instanceof Empleado) {
                        Empleado empleado = (Empleado) workerObject;
                        System.out.println("trabjador trabajando");
                        
                        empleado.start();
                    }
              
            } else {
                 //sofi esto es por si el objeto es null para que no se creen hilos extra ps
            }
        }
        
        getPm().start();
        getDirector().start();
    while (true) {
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

