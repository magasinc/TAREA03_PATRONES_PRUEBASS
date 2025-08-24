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

class SalaCine {
    private List<FilaAsientosExtendida> filas = new ArrayList<>();

    public void agregar(FilaAsientosExtendida fila) {
        filas.add(fila);
    }

    public void mostrar() {
        for (FilaAsientosExtendida fila : filas) {
            fila.mostrar();
        }
    }

    public boolean estaDisponible() {
        for (FilaAsientosExtendida fila : filas) {
            if (fila.estaDisponible()) {
                return true;
            }
        }
        return false;
    }
    
    public Asiento reservarAsientoPorTipo(TipoAsiento tipo) {
        for (FilaAsientosExtendida fila : filas) {
            Asiento asientoReservado = fila.reservarAsientoPorTipo(tipo);
            if (asientoReservado != null) {
                return asientoReservado;
            }
        }
        return null;
    }
}

/*
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

 */