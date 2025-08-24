package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.List;

public class FilaAsientos  extends FilaAsientosRef{
    
    public boolean disponible=true;
    private List<Asiento> elementos;
    public FilaAsientos() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(Asiento asiento) {
        if (asiento == null) {
            throw new NullPointerException("No se puede agregar un asiento nulo");
        }
        elementos.add(asiento);
    }

    
    public void mostrar() {
        for (Asiento e : elementos) {
            e.getDescripcion();
        }
    }

    @Override
    public boolean hayAsientosDisponibles() {
        return disponible; 
    }

    
}
