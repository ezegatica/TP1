package ar.edu.ort.tp1.unidad5.generics.aurna;

import java.util.ArrayList;

public class UrnaElectoral<E> {
    private ArrayList<E> elementos;

    public UrnaElectoral() {
        this.elementos = new ArrayList<>();
    }

    public E remove() {
        E element = null;

        if (!elementos.isEmpty()) {
            // Logica para remover un elemento al azar
        }

        return element;
    }
}
