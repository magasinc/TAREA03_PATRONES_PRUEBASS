/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

class Asiento4D implements Asiento {
    private boolean disponible = true;

    @Override
    public boolean estaDisponible() {
        return this.disponible;
    }

    @Override
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String getRepresentacion() {
        return disponible ? "[4]" : "[X]";
    }

    @Override
    public TipoAsiento getTipo() {
        return TipoAsiento.CUATRO_D;
    }
    
    @Override
    public double getPrecio() {
        return 20.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento 4D con efectos especiales y vibracion.";
    }
}


/**
 *
 * @author mateo
 */

 /*
public class Asiento4D implements Asiento {
    private boolean disponible = true;

    @Override
    public double getPrecio() {
        return 20.0;
    }

    @Override
    public String getDescripcion() {
        return "Asiento 4D con efectos especiales y vibracion.";
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
        System.out.println("Asiento 4D - Disponible: " + disponible);
    }

    
}
 */