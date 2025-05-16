/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

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
            String sql = "SELECT nombre, precio FROM producto";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto(
                    rs.getString("nombre"),
                    rs.getDouble("precio")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
