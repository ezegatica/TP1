package ar.edu.ort.tp1.unidad5.generics.danidados;

public class Caja<T> {
    T contenido;

    public Caja() {
        contenido = null;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public boolean estaLlena() {
        return contenido != null;
    }

    void guardar(T contenido) {
        if (contenido == null) {
            throw new RuntimeException("Debe agregarse un contenido");
        }
        if (estaLlena()) {
            throw new RuntimeException("La caja ya esta llena");
        }
        this.contenido = contenido;
    }

    T extraer() {
        T contenidoAux = contenido;
        if (estaVacia()) {
            throw new RuntimeException("La caja esta vacia");
        }
        contenido = null;
        return contenidoAux;
    }
}