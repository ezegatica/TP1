package ar.edu.ort.tp1.unidad5.tda.hinterfaces;

public interface Pila<T> extends Tda {

    void push(T element);

    T pop();

    T peek();

}