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
public class AsientoEstandarTest {
    
    public AsientoEstandarTest() {
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
        AsientoEstandar asiento = new AsientoEstandar();
        assertEquals(8.0, asiento.getPrecio(), "El precio debe ser 8.0");
    }

    @Test
    void testDescripcion() {
        AsientoEstandar asiento = new AsientoEstandar();
        assertEquals("Asiento estándar con experiencia clásica.",
                     asiento.getDescripcion(),
                     "La descripción no coincide");
    }

    @Test
    void testDescripcionNoEsNull() {
        AsientoEstandar asiento = new AsientoEstandar();
        assertNotNull(asiento.getDescripcion(), "La descripción no debería ser null");
    }

    @Test
    void testDisponibilidadInicial() {
        AsientoEstandar asiento = new AsientoEstandar();
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible por defecto");
    }

    @Test
    void testCambiarDisponibilidad() {
        AsientoEstandar asiento = new AsientoEstandar();
        asiento.setDisponible(false);
        assertFalse(asiento.estaDisponible(), "El asiento debería estar no disponible después de cambiar el estado");

        asiento.setDisponible(true);
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible después de volver a cambiar el estado");
    }

    @Test
    void testObjetoNoEsNull() {
        AsientoEstandar asiento = new AsientoEstandar();
        assertNotNull(asiento, "El objeto AsientoEstandar no debería ser null");
    }
    
}
