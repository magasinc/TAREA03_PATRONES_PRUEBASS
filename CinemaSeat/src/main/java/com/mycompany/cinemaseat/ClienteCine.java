package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
public class ClienteCine implements SuscriptorNotificacion {
    private String nombre;

    public ClienteCine(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}