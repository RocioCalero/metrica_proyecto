/*
 Clase Registro de usuario
 */
package Datos;

import Datos.Conexion_Base_de_Datos;
import java.sql.*;

/**
 *
 * @author Rocio
 */
public class Registro_Usuario {

    public boolean registrarClienteyUsuario(String dni, String nombre, String telefono, String email, String usuario, String contraseña) throws SQLException {
        Connection conn = Conexion_Base_de_Datos.conectar();
        if (conn == null) {
            return false;
        }
        try {
            //Insertamos el Cliente
            String sqlCliente = "INSERT INTO Cliente (dni, nombre, telefono, email)VALUES (?, ?, ?, ?)";
            try (PreparedStatement psC = conn.prepareStatement(sqlCliente)) {
                psC.setString(1, dni);
                psC.setString(2, nombre);
                psC.setString(3, telefono);
                psC.setString(4, email);
                psC.executeUpdate();
            }
            //Obtenemos el Id del usuario
            String sqlUltimoId = "select max(id) from Usuario";
            PreparedStatement UltimoId = conn.prepareStatement(sqlUltimoId);
            ResultSet rs = UltimoId.executeQuery();
            int nuevoID = 1; 
            if (rs.next()){
                nuevoID = rs.getInt(1) + 1;
            }
            //Insertamos Usuario
             String sqlUsuario = "INSERT INTO Usuario (id, usuario, contraseña, dni_cliente) VALUES (?, ?, ?, ?)";

            try (PreparedStatement psU = conn.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS)) {
                psU.setInt(1, nuevoID);
                psU.setString(2, usuario);
                psU.setString(3, contraseña);
                psU.setString(4, dni);
            }

            return true;
        } catch(SQLException e){
            System.err.println("Error al registrar: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally{
            Conexion_Base_de_Datos.desconectar(conn);
        }

    }
}
