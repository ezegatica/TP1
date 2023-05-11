package ar.edu.ort.tp1.unidad5.generics.cinterfaces;

import ar.edu.ort.tp1.unidad5.generics.danidados.ParDeZapatos;

import java.util.ArrayList;

public class TestCaja {

	public static void main(String[] args) {
		
		Caja<ParDeZapatos> unaCaja = new Caja<>();
		unaCaja.guardar(new ParDeZapatos("Negro"));

		Caja<Iterable> segundaCaja = new Caja<>();
		segundaCaja.guardar(new ArrayList());
	}
}