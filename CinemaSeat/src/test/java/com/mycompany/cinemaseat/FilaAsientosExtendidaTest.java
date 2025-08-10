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
 * @author Aveli
 */
public class FilaAsientosExtendidaTest {

    public FilaAsientosExtendidaTest() {}

    @BeforeAll
    public static void setUpClass() {}

    @AfterAll
    public static void tearDownClass() {}

    @BeforeEach
    public void setUp() {}

    @AfterEach
    public void tearDown() {}

    @Test
    public void testInicialSinDisponibles() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        assertFalse(fila.hayAsientosDisponibles(), "Deberia empezar sin asientos disponibles");
    }

    @Test
    public void testAgregarAsientoValido() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        Asiento a = new Asiento4D(); // por defecto disponible = true
        fila.agregarAsiento(a);
        assertTrue(fila.hayAsientosDisponibles(), "Debe haber disponibilidad tras agregar un asiento disponible");
    }

    @Test
    public void testAgregarAsientoNull() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        assertThrows(NullPointerException.class, () -> fila.agregarAsiento(null),
                "Agregar null debe lanzar NullPointerException");
    }

    @Test
    public void testTodosOcupadosSinDisponibilidad() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        Asiento a1 = new Asiento4D();
        Asiento a2 = new Asiento4D();
        a1.setDisponible(false);
        a2.setDisponible(false);
        fila.agregarAsiento(a1);
        fila.agregarAsiento(a2);

        assertFalse(fila.hayAsientosDisponibles(), "Con todos en false no debe haber disponibilidad");
    }

    @Test
    public void testMixtoConDisponibilidad() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        Asiento a1 = new Asiento4D();
        Asiento a2 = new Asiento4D();
        a1.setDisponible(false);   // ocupado
        a2.setDisponible(true);    // libre
        fila.agregarAsiento(a1);
        fila.agregarAsiento(a2);

        assertTrue(fila.hayAsientosDisponibles(), "Con al menos uno libre debe haber disponibilidad");
    }

    @Test
    public void testMostrar() {
        FilaAsientosExtendida fila = new FilaAsientosExtendida();
        fila.agregarAsiento(new Asiento4D());
        fila.mostrar();
    }
}
