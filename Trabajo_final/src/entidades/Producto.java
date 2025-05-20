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
    private Categoria categoria;

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Categoria getCategoria() {
        return categoria;
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
