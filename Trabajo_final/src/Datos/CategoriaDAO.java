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

    Connection conn = null;

    public static List<Categoria> Categoria() {
        Connection conn = null;
        List<Categoria> categoria = new ArrayList();
        try {
            conn = Conexion_Base_de_Datos.conectar();
            PreparedStatement pst = conn.prepareStatement("select id, nombre from categoria");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria(
                    rs.getInt("id"),
                    rs.getString("nombre")
                );
                categoria.add(c);
            }
        } catch (SQLException e) {
        }
        return categoria;
    }

   

}
