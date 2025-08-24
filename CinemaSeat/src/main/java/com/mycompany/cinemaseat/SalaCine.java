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

public class SalaCine extends FilaAsientosRef{
    private List<FilaAsientosExtendida> filas;
    
    public SalaCine() {
        this.filas = new ArrayList<>();
    }

    public void agregar(FilaAsientosExtendida fila) {
        filas.add(fila);
    }
    

    public boolean estaDisponible() {
        for (FilaAsientosExtendida fila : filas) {
            if (fila.hayAsientosDisponibles()) {
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        System.out.println("Sala:");
        for (FilaAsientosExtendida fila : filas) {
            fila.mostrar();
        }
    }

    @Override
    public boolean hayAsientosDisponibles() {
        return disponible;
    }
}