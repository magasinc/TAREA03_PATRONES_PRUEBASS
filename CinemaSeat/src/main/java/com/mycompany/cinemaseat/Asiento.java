/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
interface Asiento {
    // Métodos para gestionar el estado y la información del asiento.
    boolean estaDisponible();
    void setDisponible(boolean disponible);
    String getRepresentacion();
    TipoAsiento getTipo();
    double getPrecio();
    String getDescripcion();
}