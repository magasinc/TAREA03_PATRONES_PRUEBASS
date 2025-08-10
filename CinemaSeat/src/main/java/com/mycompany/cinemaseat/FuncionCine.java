/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.List;

public class FuncionCine {
    private String estado;
    private List<SuscriptorNotificacion> suscriptores;

    public FuncionCine() {
        this.estado = "activa";
        this.suscriptores = new ArrayList<>();
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarSuscriptores();
    }

    public void registrar(SuscriptorNotificacion suscriptor) {
        if (suscriptor != null) {
            suscriptores.add(suscriptor);
        } else {
            throw new IllegalArgumentException("Suscriptor no puede ser null");
        }
    }

    public void notificarSuscriptores() {
        for (SuscriptorNotificacion s : suscriptores) {
            s.notificar("La función esta ahora en estado: " + estado);
        }
    }
}
