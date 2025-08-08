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
 * @author Cocki
 */
public class FabricaAsientoVIPTest {
    
    public FabricaAsientoVIPTest() {
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
     * Test of createAsiento method, of class FabricaAsientoVIP.
     */
    @Test
    void testCrearAsientoNoEsNull() {
        FabricaAsientoVIP fabrica = new FabricaAsientoVIP();
        Asiento asiento = fabrica.createAsiento();
        assertNotNull(asiento, "El asiento creado no debería ser null");
    }

    @Test
    void testCrearAsientoEsAsientoVIP() {
        FabricaAsientoVIP fabrica = new FabricaAsientoVIP();
        Asiento asiento = fabrica.createAsiento();
        assertTrue(asiento instanceof AsientoVIP, "El asiento creado debería ser de tipo AsientoVIP");
    }

    @Test
    void testCrearAsientoConValoresEsperados() {
        FabricaAsientoVIP fabrica = new FabricaAsientoVIP();
        Asiento asiento = fabrica.createAsiento();

        assertEquals(15.0, asiento.getPrecio(), "El precio del AsientoVIP debe ser 15.0");
        assertTrue(asiento.estaDisponible(), "El AsientoVIP debe estar disponible por defecto");
        assertNotNull(asiento.getDescripcion(), "La descripción no debe ser null");
    }
    
}
