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
public class FabricaAsientoEstandarTest {
    
    public FabricaAsientoEstandarTest() {
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
     * Test of createAsiento method, of class FabricaAsientoEstandar.
     */
    @Test
    public void testCreateAsientoNoEsNull() {
        FabricaAsientoEstandar fabrica = new FabricaAsientoEstandar();
        Asiento asiento = fabrica.createAsiento();

        assertNotNull(asiento, "El asiento creado no debe ser null");
    }
    
    @Test
    public void testAtributosAsientoEstandar() {
        FabricaAsientoEstandar fabrica = new FabricaAsientoEstandar();
        Asiento asiento = fabrica.createAsiento();

        assertEquals(10.0, asiento.getPrecio(), "El precio del asiento estándar debe ser 10.0");
        assertEquals("Asiento estándar", asiento.getDescripcion(),
                "La descripción del asiento estándar no coincide");
    }

    
}
