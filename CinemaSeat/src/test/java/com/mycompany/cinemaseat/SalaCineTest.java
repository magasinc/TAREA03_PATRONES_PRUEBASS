/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cinemaseat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aveli
 */
public class SalaCineTest {
    
    public SalaCineTest() {
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
     * Test of agregar method, of class SalaCine.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        FilaAsientos fila = null;
        SalaCine instance = new SalaCine();
        instance.agregar(fila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaDisponible method, of class SalaCine.
     */
    @Test
    public void testEstaDisponible() {
        System.out.println("estaDisponible");
        SalaCine instance = new SalaCine();
        boolean expResult = false;
        boolean result = instance.estaDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class SalaCine.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        SalaCine instance = new SalaCine();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
