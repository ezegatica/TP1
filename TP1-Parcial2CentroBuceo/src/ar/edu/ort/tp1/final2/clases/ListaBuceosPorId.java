package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

//TODO A completar
public class ListaBuceosPorId extends ListaOrdenadaNodos<Integer, Buceo>{
	@Override
	public int compare(Buceo dato1, Buceo dato2) {
		return this.compareByKey(dato1.getId(), dato2);
	}
	
	@Override
	public int compareByKey(Integer clave, Buceo elemento) {
		return Integer.compare(clave, elemento.getId());
	}
}
