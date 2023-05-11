package ar.edu.ort.tp1.unidad5.tda.epilas;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Pila;
import ar.edu.ort.tp1.unidad5.tda.inodos.PilaNodos;

public class ATiposSimples {

    public static void main(String[] args) {

        //Declaro una variable de tipo Interfaz Pila que va a contener clases de tipo String
        Pila<String> pila;
        //Instancio un clase de tipo PilaNodos que implementa la interfaz Pila y por ende es una operaci�n segura
        //Upcasting
        pila = new PilaNodos<>();

        System.out.println("Apilamos algunos elementos...");
        pila.push("Pilas");
        pila.push("en");
        pila.push("Java");
        System.out.println("Elemento en la cima: " + pila.peek());//Devuelve el elemento que esta en la cima pero no lo retira
        //System.out.println("Tama�o de la pila: " + pila.size());//Arroja una excepcion, el tama�o de la pila no es visible
        System.out.println("Desapilamos todos elementos...");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());

        try {
            System.out.println(pila.pop());//Arroja una excepcion
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

        if (pila.isEmpty())//Metodo para validar si la pila esta vacia
            System.out.println("La pila esta vacia");
    }
}