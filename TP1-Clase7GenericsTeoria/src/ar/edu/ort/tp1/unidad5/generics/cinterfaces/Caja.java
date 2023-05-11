package ar.edu.ort.tp1.unidad5.generics.cinterfaces;

import java.util.ArrayList;

public class Caja<E> implements GuardaCosas<E> {
    private final ArrayList<E> elementos;

    public Caja() {
        elementos = new ArrayList<E>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    //Hacemos de cuenta que la caja solo puede expandirse para guardar 5 elementos como máximo
    public boolean estaLlena() {
        return elementos.size() > 4;
    }

    public void guardar(E contenido) {
        if (contenido == null) {
            throw new RuntimeException("Debe agregarse un contenido");
        }
        if (estaLlena()) {
            throw new RuntimeException("La caja ya esta llena");
        }
        this.elementos.add(contenido);
    }

    public E extraer() {
        E elemento = null;
        if (estaVacia()) {
            throw new RuntimeException("La caja esta vacia");
        } else {
            int pos = elementos.size();
            elemento = elementos.remove(pos);
        }
        return elemento;
    }
}