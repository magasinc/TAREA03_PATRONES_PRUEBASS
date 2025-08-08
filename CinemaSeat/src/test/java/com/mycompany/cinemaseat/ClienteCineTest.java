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
public class ClienteCineTest {
    
    public ClienteCineTest() {
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
    void testObjetoNoEsNull() {
        ClienteCine cliente = new ClienteCine("Mateo");
        assertNotNull(cliente, "El objeto ClienteCine no debería ser null");
    }
    
    @Test
    void testNombreNoEsNumero() {
        ClienteCine cliente = new ClienteCine("Mateo");
        
        // Valida que el nombre no sea solo dígitos
        assertFalse(clienteNombreEsNumero(cliente), 
                    "El nombre no debe ser un número");
    }

    // Método auxiliar para verificar si el nombre es numérico
    private boolean clienteNombreEsNumero(ClienteCine cliente) {
        return clienteNombre(cliente).matches("\\d+");
    }
    
    private String clienteNombre(ClienteCine cliente) {
        try {
            var field = ClienteCine.class.getDeclaredField("nombre");
            field.setAccessible(true);
            return (String) field.get(cliente);
        } catch (Exception e) {
            fail("No se pudo acceder al nombre del cliente");
            return null;
        }
    }
    
}
