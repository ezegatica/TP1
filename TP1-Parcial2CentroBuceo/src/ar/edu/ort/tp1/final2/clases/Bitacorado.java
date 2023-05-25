package ar.edu.ort.tp1.final2.clases;

/**
 * Indica que la entidad debe poseer una bitacora y poder informar la cantidad de eventos en la misma
 *
 */
public interface Bitacorado<T> {

	int cantidadDeEventos();
	void agregarABitacora(T t);
}
