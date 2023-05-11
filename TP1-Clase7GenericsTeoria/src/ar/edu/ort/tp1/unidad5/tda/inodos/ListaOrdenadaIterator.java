package ar.edu.ort.tp1.unidad5.tda.inodos;

import java.util.Iterator;

class ListaOrdenadaIterator<T> implements Iterator<T> {

    private Nodo<T> current;

    public ListaOrdenadaIterator(Nodo<T> first) {
        this.current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T e = null;
        if (hasNext()) {
            e = current.getElement();
            current = current.next();
        }
        return e;
    }

}