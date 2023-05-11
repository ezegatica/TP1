package ejercicio02;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.Cola;
import ar.edu.ort.tp1.unidad5.tda.inodos.ColaNodos;

public class Montoncito {
	private Cola<Naipe> montoncito;
	private boolean hayComodin;

	public Montoncito(int tamaño) {
		 this.montoncito = new ColaNodos<>(tamaño);
		 this.hayComodin = false;
	}
	
	public void add(Naipe n) {
		if (n.esComodin()) {
			hayComodin = true;
		}
		this.montoncito.add(n);
	}

	public boolean hasComodin() {
		return hayComodin;
	}

}
