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
public class AsientoVIPTest {
    
    public AsientoVIPTest() {
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

    @Test
    void testPrecio() {
        AsientoVIP asiento = new AsientoVIP();
        assertEquals(15.0, asiento.getPrecio(), "El precio debe ser 15.0");
    }

    @Test
    void testDescripcion() {
        AsientoVIP asiento = new AsientoVIP();
        assertEquals("Asiento VIP con mayor comodidad.",
                     asiento.getDescripcion(),
                     "La descripción no coincide");
    }

    @Test
    void testDescripcionNoEsNull() {
        AsientoVIP asiento = new AsientoVIP();
        assertNotNull(asiento.getDescripcion(), "La descripción no debería ser null");
    }

    @Test
    void testDisponibilidadInicial() {
        AsientoVIP asiento = new AsientoVIP();
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible por defecto");
    }

    @Test
    void testCambiarDisponibilidad() {
        AsientoVIP asiento = new AsientoVIP();
        asiento.setDisponible(false);
        assertFalse(asiento.estaDisponible(), "El asiento debería estar no disponible después de cambiar el estado");

        asiento.setDisponible(true);
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible después de volver a cambiar el estado");
    }

    
    
}
