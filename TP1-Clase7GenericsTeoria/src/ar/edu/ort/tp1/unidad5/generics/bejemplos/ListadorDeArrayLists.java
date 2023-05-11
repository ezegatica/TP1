package ar.edu.ort.tp1.unidad5.generics.bejemplos;

import java.util.ArrayList;

public class ListadorDeArrayLists {

    public static void main(String[] args) {
        ArrayList<Number> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(-32);
        numeros.add(14.5);

        Number number = numeros.get(0);

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("que");
        palabras.add("tal");

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Gato());
        animales.add(new Perro());

        // invocamos al método listarElementosConForEach para mostrar
        // el contenido de cada colección.
        listarElementosConForEach(numeros);
        listarElementosConForEach(palabras);

        // invocamos al método listarElementosSinUsarObject para mostrar
        // el contenido de cada colección.
        listarElementosSinUsarObject(numeros);
        listarElementosSinUsarObject(palabras);
    }

    private static void listarElementosConForEach(ArrayList<?> lista) {
        // como el método requiere una variable local para guardar
        // el elemento debemos usar Object para referirnos a él.
        for (Object objeto : lista) {
            System.out.println(objeto);
        }
    }

    private static void listarElementosSinUsarObject(ArrayList<?> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}