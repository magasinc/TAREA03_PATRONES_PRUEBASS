package com.mycompany.cinemaseat;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author joseg
 */
public class ClienteCine implements SuscriptorNotificacion {
    private String nombre;
    private List<String> mensajesRecibidos = new ArrayList<>();

    public ClienteCine(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        mensajesRecibidos.add(mensaje);
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }

    public List<String> getMensajesRecibidos() {
        return mensajesRecibidos;
    }
}