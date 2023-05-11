package ar.edu.ort.tp1.unidad5.generics.danidados;

/**
 * Dado que la creaci�n de la clase CajaDeZapatos apenas es algo m�s que una declaraci�n que "fija" el tipo de
 * dato gen�rico y lo reemplaza por ParDeZapatos, todos los m�todos p�blicos de la clase gen�rica quedan
 * disponibles como si directamente us�ramos Caja, aunque aquellos m�todos de Caja que devolv�an un elemento
 * gen�rico (T en la declaraci�n) ahora solamente trabajar�n con un objeto de clase ParDeZapatos.
 */
public class CajaDeZapatos extends Caja<ParDeZapatos> {
}
