/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cocki
 */
public abstract class FilaAsientosRef {
    protected boolean disponible =true;
    protected List<Asiento> asientos = new ArrayList<>();
    protected Asiento asiento;
     public void agregar(Asiento asiento) {
        if (asiento == null) {
            throw new NullPointerException("No se puede agregar un asiento nulo");
        }
        asientos.add(asiento);
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public abstract boolean hayAsientosDisponibles();
    public void mostrar() {
        for (Asiento e : asientos) {
            e.mostrar();
        }
    }
   
}
    

