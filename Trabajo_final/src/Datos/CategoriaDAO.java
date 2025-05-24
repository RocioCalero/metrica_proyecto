/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import entidades.Categoria;
import java.sql.*;
import java.util.*;

/**
 *
 * @author usuarioDAW
 */
public class CategoriaDAO {
    public static Map<String, Integer> obtenerCategorias() {
        Map<String, Integer> categorias = new HashMap<>();
        try{
            Connection con = Conexion_Base_de_Datos.conectar();
            String sql = "select * from categoria";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               categorias.put(rs.getString("nombre"), rs.getInt("id"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return categorias;
    }

   

}
