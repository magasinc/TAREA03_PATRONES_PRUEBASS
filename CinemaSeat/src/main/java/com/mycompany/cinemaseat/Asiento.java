/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
public interface Asiento {
    double getPrecio();
    String getDescripcion();
    boolean estaDisponible();
    void setDisponible(boolean disponible);
    void mostrar();
     
}