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

public class SalaCine {
    private List<FilaAsientos> filas;

    public SalaCine() {
        this.filas = new ArrayList<>();
    }

    public void agregar(FilaAsientos fila) {
        filas.add(fila);
    }

    public boolean estaDisponible() {
        for (FilaAsientos fila : filas) {
            if (fila.hayAsientosDisponibles()) {
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        System.out.println("Sala:");
        for (FilaAsientos fila : filas) {
            fila.mostrar();
        }
    }
}