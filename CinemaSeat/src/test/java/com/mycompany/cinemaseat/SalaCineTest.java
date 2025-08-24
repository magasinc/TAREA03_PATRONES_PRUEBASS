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
public class SalaCineTest {
    
    public SalaCineTest() {}
    
    @BeforeAll
    public static void setUpClass() {}
    
    @AfterAll
    public static void tearDownClass() {}
    
    @BeforeEach
    public void setUp() {}
    
    @AfterEach
    public void tearDown() {}

    @Test
    void testSalaInicialSinDisponibilidad() {
        SalaCine sala = new SalaCine();
        assertFalse(sala.estaDisponible(), "Al inicio no deberia haber disponibilidad");
    }

    @Test
    void testAgregarFilaNormalNoAfectaDisponibilidad() {
        SalaCine sala = new SalaCine();
        FilaAsientos filaNormal = new FilaAsientos();
        // aunque la fila normal tenga asientos, SalaCine ignora su disponibilidad
        filaNormal.agregar(new Asiento4D());
        sala.agregar(filaNormal);

        assertFalse(sala.estaDisponible(), "Con solo filas normales no debe marcar disponible");
    }

    @Test
    void testFilaExtendidaConAsientoLibre() {
        SalaCine sala = new SalaCine();
        FilaAsientosExtendida filaExt = new FilaAsientosExtendida();
        filaExt.agregar(new Asiento4D());
        sala.agregar(filaExt);

        assertTrue(sala.estaDisponible(), "Debe haber disponibilidad por la fila extendida");
    }

    @Test
    void testFilaExtendidaTodosOcupados() {
        SalaCine sala = new SalaCine();
        FilaAsientosExtendida filaExt = new FilaAsientosExtendida();

        Asiento a1 = new Asiento4D();
        Asiento a2 = new Asiento4D();
        a1.setDisponible(false);
        a2.setDisponible(false);

        filaExt.agregar(a1);
        filaExt.agregar(a2);
        sala.agregar(filaExt);

        assertFalse(sala.estaDisponible(), "Con todos ocupados no debe haber disponibilidad");
    }

    @Test
    void testMixtoVariasFilasExtendidas() {
        SalaCine sala = new SalaCine();

        FilaAsientosExtendida filaSinLibres = new FilaAsientosExtendida();
        Asiento x1 = new Asiento4D(); x1.setDisponible(false);
        Asiento x2 = new Asiento4D(); x2.setDisponible(false);
        filaSinLibres.agregarAsiento(x1);
        filaSinLibres.agregarAsiento(x2);

        FilaAsientosExtendida filaConLibre = new FilaAsientosExtendida();
        Asiento y1 = new Asiento4D(); y1.setDisponible(true);
        filaConLibre.agregarAsiento(y1);

        sala.agregar(filaSinLibres);
        sala.agregar(filaConLibre);

        assertTrue(sala.estaDisponible(), "Debe marcar disponible si al menos una fila extendida tiene libres");
    }

    @Test
    void testMostrar() {
        SalaCine sala = new SalaCine();

        // Mezcla de filas
        FilaAsientos filaNormal = new FilaAsientos();
        filaNormal.agregar(new Asiento4D());

        FilaAsientosExtendida filaExt = new FilaAsientosExtendida();
        filaExt.agregarAsiento(new Asiento4D());

        sala.agregar(filaNormal);
        sala.agregar(filaExt);

        sala.mostrar();
    }
}
