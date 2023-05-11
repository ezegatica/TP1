package ar.edu.ort.tp1.unidad5.generics.cinterfaces;

/**
 * Las interfaces también pueden usar Generics y, de hecho, conocemos y utilizamos varias de
 * ellas. La declaración de una interfaz que haga uso de Generics es exactamente la misma
 * que la de una clase con Generics. Por ejemplo, la declaración de la interfaz GuardaCosas
 * para una hipotética clase que permita guardar cosas es la siguiente:
 */
public interface GuardaCosas<E> {
	
	public void guardar(E elemento);
	public E extraer();
	public boolean estaVacia();
	public boolean estaLlena();
}