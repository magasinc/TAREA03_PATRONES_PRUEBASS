/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author joseg
 */
abstract class FabricaAsiento4D implements FabricaAsiento {
    @Override
    public Asiento createAsiento() {
        return new Asiento4D();
    }
}

