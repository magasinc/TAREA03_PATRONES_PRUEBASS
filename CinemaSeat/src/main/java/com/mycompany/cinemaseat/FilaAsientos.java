package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.List;

public class FilaAsientos  {
    private List<Asiento> elementos;
    public FilaAsientos() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(Asiento asiento) {
        elementos.add(asiento);
    }

    
    public void mostrar() {
        for (Asiento e : elementos) {
            e.mostrar();
        }
    }
}
