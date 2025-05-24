/*
Clase Producto
*/
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Rocio
 */
public class Producto {

    private String nombre;
    private double precio;
    private String descripcion;
    private int id_categoria;

    public Producto(String nombre, double precio, String descripcion, int id_categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " ----------------------- "+ precio + "€";
    }
    
}
