package ar.edu.ort.tp1.unidad5.generics.danidados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestCaja1 {

    public static void main(String[] args) {

        ParDeZapatos zapatos = new ParDeZapatos("Negros");
        //cada vez que se crea un objeto de una clase que usa Generics se puede emplear el diamante vac�o (<>),
        //pues el tipo del dato se infier de la declaraci�n de la variable
        Caja<ParDeZapatos> cajaDeZapatos = new Caja<>();
        cajaDeZapatos.guardar(zapatos);

        // pongo en null la variable zapatos para asegurarme de que solo "quedan" en la caja.
        zapatos = null;

        // Los saco de la caja
        zapatos = cajaDeZapatos.extraer();
        System.out.println("De la caja obtuve... " + zapatos);

        // vuelvo a guardarlos y agrego la caja de zapatos a mi coleccion
        cajaDeZapatos.guardar(zapatos);

        //Que pasa si ahora quiero guardar varias cajas de zapatos en otro Generic como un ArrayList?
        //La declaraci�n e instanciaci�n correcta de la colecci�n ser�a:
        ArrayList<Caja<ParDeZapatos>> miColeccionDeZapatos = new ArrayList<>();
        miColeccionDeZapatos.add(cajaDeZapatos);
    }
}