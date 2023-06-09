package ar.edu.ort.tp1.unidad5.tda.inodos;

public class Nodo<T> {
    private final T dato;
    private Nodo<T> next;

    public Nodo(T dato) {
        this.dato = dato;
        this.next = null;
    }

    /**
     * @return El dato
     */
    public T getElement() {
        return dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo<T> next() {
        return next;
    }

    public void next(Nodo<T> next) {
        this.next = next;
    }

    /**
     * @return the siguiente
     */
    public boolean hasNext() {
        return next != null;
    }

}