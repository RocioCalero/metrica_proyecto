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

    public static void add(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nombre;
    private double precio;
    private String descripcion;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
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
}
