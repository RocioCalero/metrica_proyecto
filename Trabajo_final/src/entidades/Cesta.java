/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author usuarioDAW
 */
public class Cesta {
    public static List<Producto> cesta = new ArrayList<>();
    public static void agregarProducto(Producto p){
        cesta.add(p);
    }

    public static List<Producto> getProductos() {
        return cesta;
    }
    
    public static double getTotal(){
        double total = 0;
        for (Producto p : cesta) {
            total += p.getPrecio();
        }
        return total;
    }
    
    public static void vaciar(){
        cesta.clear();
    }

    public static void add(Producto prod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
