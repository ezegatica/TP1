package ar.edu.ort.tp1.unidad5.generics.aurna;

public class TestUrna {

    public static void main(String[] args) {
        // Probamos con una urna de strings, donde cargamos nombres
        Urna<String> urnaNombres = new Urna<>();
        urnaNombres.add("Athos");
        urnaNombres.add("Porthos");
        urnaNombres.add("Aramis");
        urnaNombres.add("D'Artagnan");
        mostrarContenidoUrna(urnaNombres);
        urnaNombres.mostrar();


        // Probemos con una urna de numeros enteros. Como siempre que se trabaja
        // con Generics los elementos deben ser objetos.
        Urna<Integer> urnaNumerica = new Urna<>();
        for (int i = 0; i < 10; i++) {
            // Debemos transformar el int en Integer
            urnaNumerica.add(new Integer(i));
        }
        mostrarContenidoUrna(urnaNumerica);
    }

    // El ? sirve de comodin para definir el tipo de elemento. Asi se puede
    // trabajar con cualquier tipo de dato, tambien en forma generica
    private static void mostrarContenidoUrna(Urna<?> urna) {

        for (Object nombre: urna.getElementos()) {
            System.out.println(nombre.getClass());
        }

        while (!urna.isEmpty()) {
            System.out.println(urna.remove());
        }
    }
}