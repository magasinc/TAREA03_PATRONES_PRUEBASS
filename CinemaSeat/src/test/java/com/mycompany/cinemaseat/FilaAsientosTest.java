/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cinemaseat;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joseg
 */
public class FilaAsientosTest {
    

    /**
     * Test of agregar method, of class FilaAsientos.
     */


    // TC01 - Agregar asiento válido
    @Test
    void testAgregarAsientoValido() {
        FilaAsientos fila = new FilaAsientos();
        Asiento asiento = new Asiento4D();
        assertDoesNotThrow(() -> fila.agregar(asiento));
    }

    // TC02 - Agregar asiento null
    @Test
    void testAgregarAsientoNull() {
        FilaAsientos fila = new FilaAsientos();
        assertThrows(NullPointerException.class, () -> fila.agregar(null));
    }

    // TC03 - Mostrar con asientos
    @Test
    void testMostrarConAsientos() {
        FilaAsientos fila = new FilaAsientos();
        fila.agregar(new Asiento4D());
        fila.agregar(new Asiento4D());
        assertDoesNotThrow(() -> fila.mostrar());
    }

    // TC04 - Mostrar con lista vacía
    @Test
    void testMostrarListaVacia() {
        FilaAsientos fila = new FilaAsientos();
        assertDoesNotThrow(() -> fila.mostrar());
    }
    
    

}
