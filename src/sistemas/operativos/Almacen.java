/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Katiuska Torres
 */
public class Almacen {
    private int capacidad_maxima;
    private String tipo;
    public Almacen(String tipo,int capacidad_maxima){
        this.capacidad_maxima=capacidad_maxima;
    }
    
    public void almacenar(Componente componente){
    //logica de almacenar
    }
    public void Sacar_componentes(Componente componente){
    //logica sacar componentes
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}

