
package Modelos;

import Paquete1.producto;
import java.util.ArrayList;


public class Carniceria {
    String nombre;
    CarniceriaTipo tipo;
    ArrayList <producto> inventario;

    public ArrayList<producto> getInventario() {
        return inventario;
    }

    public Carniceria() {
        inventario=new ArrayList<producto>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarniceriaTipo getTipo() {
        return tipo;
    }

    public void setTipo(CarniceriaTipo tipo) {
        this.tipo = tipo;
    }
    
}

