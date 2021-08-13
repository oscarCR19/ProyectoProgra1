
package Modelos;


import Paquete1.Producto;
import java.util.ArrayList;


public class Carniceria {
    String nombre;
    CarniceriaTipo tipo;
    ArrayList <Producto> inventario;

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public Carniceria() {
        inventario=new ArrayList<Producto>();
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

