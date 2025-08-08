/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
public class AsientoVIP implements Asiento {
    private boolean disponible = true;

    @Override
    public double getPrecio() {
        return 15.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento VIP con mayor comodidad.";
    }

    @Override
    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public void mostrar() {
        System.out.println("Asiento VIP - Disponible: " + disponible);
    }

    
}
