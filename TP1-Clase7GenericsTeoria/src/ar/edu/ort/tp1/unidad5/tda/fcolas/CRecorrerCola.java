package ar.edu.ort.tp1.unidad5.tda.fcolas;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Cola;
import ar.edu.ort.tp1.unidad5.tda.inodos.ColaNodos;

public class CRecorrerCola {

    public static void main(String[] args) {
        Cola<Persona> cola;

        cola = new ColaNodos<>();

        System.out.println("Encolamos algunos elementos...");
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Daniela", "Gonzalez");
        cola.add(persona1);
        cola.add(persona2);
        System.out.println("Todas las personas de la cola");
        //Agrego el centinela
        Persona centinela = new Persona("*", "*");
        cola.add(centinela);
        Persona persona;
        persona = cola.remove();
        //System.out.println(persona.toString());

        //Lo uso para recorrer toda la cola y saber donde termina
        while (!persona.getNombre().equals("*")) {
            System.out.println(persona.toString());
            cola.add(persona);
            persona = cola.remove();
        }

        System.out.println("Desencolamos todos elementos...");
        System.out.println(cola.remove());
        System.out.println(cola.remove());
    }
}