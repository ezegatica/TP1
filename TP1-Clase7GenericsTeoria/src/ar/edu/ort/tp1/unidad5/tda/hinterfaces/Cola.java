package ar.edu.ort.tp1.unidad5.tda.hinterfaces;

public interface Cola<T> extends Tda {

	void add(T element);

	T remove();

	T get();

}