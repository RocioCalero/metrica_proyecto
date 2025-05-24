/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Datos;

import java.sql.Connection;
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
public class Conexion_Base_de_DatosTest {
    
    public Conexion_Base_de_DatosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of conectar method, of class Conexion_Base_de_Datos.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        Connection expResult = null;
        Connection result = Conexion_Base_de_Datos.conectar();
        assertEquals(expResult, result);
    }

    /**
     * Test of desconectar method, of class Conexion_Base_de_Datos.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        Connection conn = null;
        Conexion_Base_de_Datos.desconectar(conn);
    }
    
}
