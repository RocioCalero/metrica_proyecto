/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entidades;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ME
 */
public class CestaTest {
    
    public CestaTest() {
    }

    /**
     * Test of agregarProducto method, of class Cesta.
     */
    @Test
    public void testAgregarProducto() {
        System.out.println("agregarProducto");
        Producto p = null;
        Cesta.agregarProducto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class Cesta.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        List<Producto> expResult = null;
        List<Producto> result = Cesta.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Cesta.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double expResult = 0.0;
        double result = Cesta.getTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciar method, of class Cesta.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        Cesta.vaciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
