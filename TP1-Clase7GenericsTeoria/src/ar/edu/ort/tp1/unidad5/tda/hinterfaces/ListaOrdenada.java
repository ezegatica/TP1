package ar.edu.ort.tp1.unidad5.tda.hinterfaces;

public interface ListaOrdenada<K, T> extends Tda, Iterable<T> {
    String MSG_INVALID_KEY = "Clave invalida";
    String MSG_INDEX_OUT_OF_RANGE = "Indice fuera de rango: El maximo es %d";
    String MSG_NULL_NODE = "El nodo es null";
    String MSG_ELEM_IS_NULL = "El elemento no puede ser Null";

    void add(T newElement);

    int compare(T dato1, T dato2);

    int compareByKey(K clave, T elemento);

    boolean exists(K key);

    T get(int pos);

    boolean remove(T elem);

    T removeAt(int pos);

    T removeByKey(K key);

    T search(K key);

}
