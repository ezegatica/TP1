package ar.edu.ort.tp1.unidad5.tda.inodos;

public class NodoLista<T> extends Nodo<T> {

    private NodoLista<T> previous;

    public NodoLista(T dato) {
        super(dato);
        this.previous = null;
    }

    public NodoLista<T> previous() {
        return previous;
    }

    public void previous(NodoLista<T> previous) {
        this.previous = previous;
    }

    /**
     * @return valor booleano indicando si hay un nodo anterior (si no es el
     * primero de la lista)
     */
    public boolean hasPrevious() {
        return previous != null;
    }

}