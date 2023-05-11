package ejercicio02;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Cola;
import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Pila;
import ar.edu.ort.tp1.unidad5.tda.inodos.ColaNodos;
import ar.edu.ort.tp1.unidad5.tda.inodos.PilaNodos;

public class Baraja {
	private Pila<Naipe> naipes;
	private Pila<Naipe> sacados;
	private static final int CANT_POR_PALO = 12;
	private static final int CANT_COMODINES = 2;
	public Baraja() {
		Palo[] palos = Palo.values();
		int tamaño = palos.length * CANT_POR_PALO + CANT_COMODINES;
		this.naipes = new PilaNodos<>(tamaño);
		this.sacados = new PilaNodos<>(tamaño);
		for (Palo palo : palos) {
            for (int i = 1; i <= CANT_POR_PALO; i++) {
                naipes.push(new NaipePalo(i, palo));
            }
        }
		for (int i = 0; i < CANT_COMODINES; i++) {
            naipes.push(new NaipeComodin());
        }
	}
	
	public Montoncito sacar(int n){
		Montoncito m = new Montoncito(n);
		for (int i = 0; i < n; i++) {
            Naipe naipe = naipes.pop();
            sacados.push(naipe);
            m.add(naipe);
        }
		return m;
	}
	
	public void mezclar() {
		// No tengo ni la menor idea
	}
}
