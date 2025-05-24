/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Datos;

import entidades.Producto;
import java.util.ArrayList;
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
public class ProductoDAOTest {

    /**
     * Test of obtenerProductos method, of class ProductoDAO.
     */
    @Test
    public void testObtenerProductos() {
        System.out.println("obtenerProductos");
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = ProductoDAO.obtenerProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProductosCategoria method, of class ProductoDAO.
     */
    @Test
    public void testObtenerProductosCategoria() {
        System.out.println("obtenerProductosCategoria");
        int id_categoria = 0;
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = ProductoDAO.obtenerProductosCategoria(id_categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProductosDescripcion method, of class ProductoDAO.
     */
    @Test
    public void testObtenerProductosDescripcion() {
        System.out.println("obtenerProductosDescripcion");
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = ProductoDAO.obtenerProductosDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
