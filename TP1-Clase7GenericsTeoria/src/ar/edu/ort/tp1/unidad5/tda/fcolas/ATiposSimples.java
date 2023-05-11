package ar.edu.ort.tp1.unidad5.tda.fcolas;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Cola;
import ar.edu.ort.tp1.unidad5.tda.inodos.ColaNodos;

public class ATiposSimples {

    public static void main(String[] args) {

        //Declaro una variable de tipo Interfaz Cola que va a contener clases de tipo String
        Cola<String> cola;
        //Instancio un clase de tipo ColaNodos que implementa la interfaz Cola y por ende es una operación segura
        //Upcasting
        cola = new ColaNodos<>();
        System.out.println("Encolamos algunos elementos...");
        cola.add("Colas");
        cola.add("en");
        System.out.println("Elemento primero en la cola: " + cola.get());//Devuelve el elemento que esta primero pero no lo retira
        //System.out.println("Tamaño de la cola: " + cola.size());//Arroja una excepcion, el tamaño de la cola no es visible
        System.out.println("Desencolamos todos elementos...");
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        // System.out.println(cola.remove());//Arroja una excepcion
        if (cola.isEmpty())//Metodo para validar si la cola esta vacia
            System.out.println("La cola esta vacia");
    }
}