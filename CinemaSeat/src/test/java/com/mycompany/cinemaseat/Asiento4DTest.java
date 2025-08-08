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
public class Asiento4DTest {
    
    public Asiento4DTest() {
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
     
Test of getPrecio method, of class Asiento4D.
   */

  @Test
  void testPrecio() {
      Asiento4D asiento = new Asiento4D();
      assertEquals(20.0, asiento.getPrecio(), "El precio debe ser 20.0");
  }


  @Test
  void testDescripcion() {
      Asiento4D asiento = new Asiento4D();
      assertEquals("Asiento 4D con efectos especiales y vibración.",
                     asiento.getDescripcion(),
                     "La descripción no coincide");
    }

    @Test
    void testDisponibilidadInicial() {
        Asiento4D asiento = new Asiento4D();
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible por defecto");
    }

    @Test
    void testCambiarDisponibilidad() {
        Asiento4D asiento = new Asiento4D();
        asiento.setDisponible(false);
        assertFalse(asiento.estaDisponible(), "El asiento debería estar no disponible después de cambiar el estado");

        asiento.setDisponible(true);
        assertTrue(asiento.estaDisponible(), "El asiento debería estar disponible después de volver a cambiar el estado");
    }
    @Test
    void testDescripcionNoEsNull() {
        Asiento4D asiento = new Asiento4D();
        assertNotNull(asiento.getDescripcion(), "La descripción no debería ser null");
    }

    
    
}
