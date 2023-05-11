package ar.edu.ort.tp1.unidad5.tda.hinterfaces;

public interface Tda {

    String ERR_TAM_ILEGAL = "Tamanio maximo definido ilegal";
    String ERR_ESTRUCTURA_LLENA = "%s llena";
    String ERR_ESTRUCTURA_VACIA = "%s vacia";

    int SIN_LIMITE = -1;
    int LIMITE_MINIMO_POSIBLE = 2;

    int size();

    boolean isEmpty();

    boolean isFull();

    void checkEmptiness() throws RuntimeException;

    void checkFullness() throws RuntimeException;

}
