package imgEjercicio01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int velocidadTotal = 0;
		double promedioVelocidad = 0.0;
		ArrayList<Persona> lista = new ArrayList<>();
		Persona i1 = new Informatico("Pepe");
        Persona i2 = new Informatico("Juan");
        Persona i3 = new Informatico("Lola");
        Persona d1 = new Deportista("David");
        Persona d2 = new Deportista("Azul");
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(d1);
        lista.add(d2);

        for (Persona persona: lista) {
        	System.out.printf("%s corre.%n", persona.getNombre());
            velocidadTotal += persona.correr();
        }
        
        promedioVelocidad = (double) velocidadTotal / lista.size();
        
        System.out.printf("La velocidad promedio de las %d personas es de: %.1f km/h", lista.size(), promedioVelocidad);

	}

}
