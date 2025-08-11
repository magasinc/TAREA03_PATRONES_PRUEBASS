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
import java.util.List;

/**
 *
 * @author joseg
 */
public class FuncionCineTest {
    
    public FuncionCineTest() {
    }
    

    /**
     * Test of notificarSuscriptores method, of class FuncionCine.
     */
    @Test
    void testCambiarEstadoYNotificar() {
        FuncionCine funcion = new FuncionCine();
        ClienteCine cliente = new ClienteCine("Juan");
        funcion.registrar(cliente);

        funcion.cambiarEstado("activa");

        List<String> mensajes = cliente.getMensajesRecibidos();
        assertEquals(1, mensajes.size());
        assertEquals("La función esta ahora en estado: activa", mensajes.get(0));
    }

    @Test
    void testCambiarEstadoNullYNotificar() {
        FuncionCine funcion = new FuncionCine();
        ClienteCine cliente = new ClienteCine("Ana");
        funcion.registrar(cliente);

        funcion.cambiarEstado(null);

        List<String> mensajes = cliente.getMensajesRecibidos();
        assertEquals(1, mensajes.size());
        assertEquals("La función esta ahora en estado: null", mensajes.get(0));
    }

    @Test
    void testRegistrarSuscriptorValido() {
        FuncionCine funcion = new FuncionCine();
        ClienteCine cliente = new ClienteCine("Carlos");
        assertDoesNotThrow(() -> funcion.registrar(cliente));
    }

    @Test
    void testRegistrarSuscriptorNull() {
        FuncionCine funcion = new FuncionCine();
        assertThrows(IllegalArgumentException.class, () -> funcion.registrar(null));
    }

    @Test
    void testNotificarSinSuscriptores() {
        FuncionCine funcion = new FuncionCine();        
        assertDoesNotThrow(() -> funcion.notificarSuscriptores());
    }

    @Test
    void testNotificarMultiplesSuscriptores() {
        FuncionCine funcion = new FuncionCine();
        ClienteCine c1 = new ClienteCine("Luis");
        ClienteCine c2 = new ClienteCine("Marta");

        funcion.registrar(c1);
        funcion.registrar(c2);

        funcion.cambiarEstado("Finalizada");

        assertEquals(1, c1.getMensajesRecibidos().size());
        assertEquals("La función esta ahora en estado: Finalizada", c1.getMensajesRecibidos().get(0));

        assertEquals(1, c2.getMensajesRecibidos().size());
        assertEquals("La función esta ahora en estado: Finalizada", c2.getMensajesRecibidos().get(0));
    }
}
    
