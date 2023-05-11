package ejercicio01;

import ar.edu.ort.tp1.unidad5.tda.hinterfaces.*;
import ar.edu.ort.tp1.unidad5.tda.inodos.*;

public class TuboDePelotas {
	private  Pila<PelotaDeTenis> pelotas;
	private static final int CANT_PELOTAS = 3;
	public TuboDePelotas() {
		this.pelotas = new PilaNodos<>(CANT_PELOTAS);
		this.llenarTubosDePelotas();
	}
	
	private void llenarTubosDePelotas() {
		for (int i = 0; i < CANT_PELOTAS; i++) {
			this.pelotas.push(new PelotaDeTenis());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder r = new StringBuilder();
		r.append("TuboDePelotas= {\n");
		while(!this.pelotas.isEmpty()) {
			r.append(String.format("  %s \n", this.pelotas.pop().toString()));
		}
		r.append("}");
		return r.toString();
	}
		
    public PelotaDeTenis sacarPelota() {
        PelotaDeTenis pelota = pelotas.pop();
        return pelota;
    }

    public void guardarPelota(PelotaDeTenis pelota) {
        pelotas.push(pelota);
    }
}
