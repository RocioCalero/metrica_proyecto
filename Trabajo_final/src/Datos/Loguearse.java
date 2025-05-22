/*
 Clase Loguearse
*/
package Datos;

import Datos.Conexion_Base_de_Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Rocio
 */
public class Loguearse {
   public boolean IniciarSesion(String usuario, String contraseña) {
        Connection conn = Conexion_Base_de_Datos.conectar();
        if (conn == null) {
            return false;
        }
        String sql = "Select * from Usuario where usuario = ? and contraseña = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            return true;
        } catch(SQLException e){
            System.err.println("Error al iniciar sesión: " + e.getMessage());
            return false;
        }
    }
}
