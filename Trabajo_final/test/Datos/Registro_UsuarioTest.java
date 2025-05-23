/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Datos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ME
 */
public class Registro_UsuarioTest {

    /**
     * Test of registrarClienteyUsuario method, of class Registro_Usuario.
     */
    @Test
    public void testRegistrarClienteyUsuario() throws Exception {
        System.out.println("registrarClienteyUsuario");
        String dni = "";
        String nombre = "";
        String telefono = "";
        String email = "";
        String usuario = "";
        String contraseña = "";
        Registro_Usuario instance = new Registro_Usuario();
        boolean expResult = false;
        boolean result = instance.registrarClienteyUsuario(dni, nombre, telefono, email, usuario, contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
