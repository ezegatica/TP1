package ar.edu.ort.tp1.unidad5.generics.danidados;

/**
 * Dado que la creación de la clase CajaDeZapatos apenas es algo más que una declaración que "fija" el tipo de
 * dato genérico y lo reemplaza por ParDeZapatos, todos los métodos públicos de la clase genérica quedan
 * disponibles como si directamente usáramos Caja, aunque aquellos métodos de Caja que devolvían un elemento
 * genérico (T en la declaración) ahora solamente trabajarán con un objeto de clase ParDeZapatos.
 */
public class CajaDeZapatos extends Caja<ParDeZapatos> {
}
