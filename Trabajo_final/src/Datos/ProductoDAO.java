/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import entidades.Categoria;
import entidades.Producto;
import java.util.*;
import java.sql.*;

/**
 *
 * @author ME
 */
public class ProductoDAO {

    public static ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        try (Connection con = Conexion_Base_de_Datos.conectar()) {
            String sql = "SELECT * FROM producto ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto(
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getString("descripcion"),
                        rs.getInt("id_categoria")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static ArrayList<Producto> obtenerProductosCategoria(int id_categoria) {
        ArrayList<Producto> lista = new ArrayList<>();
        try (Connection con = Conexion_Base_de_Datos.conectar()) {
            PreparedStatement ps = con.prepareStatement("select * from producto where id_categoria = ?");
            ps.setInt(1, id_categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                Producto p = new Producto (
                      rs.getString("nombre"),
                      rs.getDouble("precio"),
                      rs.getString("descripcion"),
                      rs.getInt("id_categoria")
                );
               lista.add(p);
                System.out.println(p);
            }
        } catch (SQLException e) {
            System.err.println("ObtenerProductosCategorias" + e.getMessage());
        }
        return lista;
    }

    public static ArrayList<Producto> obtenerProductosDescripcion() {
        ArrayList<Producto> lista = new ArrayList<>();
        try (Connection con = Conexion_Base_de_Datos.conectar()) {
            String sql = "SELECT nombre, precio, descripcion FROM producto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto(
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getString("descripcion"),
                        rs.getInt("id_categoria")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
