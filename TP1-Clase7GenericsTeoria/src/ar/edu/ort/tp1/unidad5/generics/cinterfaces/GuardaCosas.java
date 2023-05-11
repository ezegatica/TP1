package ar.edu.ort.tp1.unidad5.generics.cinterfaces;

/**
 * Las interfaces tambi�n pueden usar Generics y, de hecho, conocemos y utilizamos varias de
 * ellas. La declaraci�n de una interfaz que haga uso de Generics es exactamente la misma
 * que la de una clase con Generics. Por ejemplo, la declaraci�n de la interfaz GuardaCosas
 * para una hipot�tica clase que permita guardar cosas es la siguiente:
 */
public interface GuardaCosas<E> {
	
	public void guardar(E elemento);
	public E extraer();
	public boolean estaVacia();
	public boolean estaLlena();
}