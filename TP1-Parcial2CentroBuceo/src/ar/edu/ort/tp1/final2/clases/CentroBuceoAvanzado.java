package ar.edu.ort.tp1.final2.clases;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.ListaOrdenada;
import edu.ort.tp1.u5.tda.Pila;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;
import edu.ort.tp1.u5.tda.nodos.PilaNodos;

public class CentroBuceoAvanzado {

	private static final String BUCEO_INVALIDO = "Buceo Invalido";
	private static final int CANTIDAD_BUCEOS = 10;

	private String nombre;
	private Pila<String> erroresDeReserva;
	private ListaOrdenada<Integer, Buceo> buceosDisponibles;
	private Cola<Buzo> buzosRegistrados;
	private int[][] cantidadBuceosPorMes;

	public CentroBuceoAvanzado(String nombre) {
		this.nombre = nombre;
		this.buceosDisponibles = new ListaBuceosPorId();
		this.cantidadBuceosPorMes = new int[CANTIDAD_BUCEOS][Mes.values().length];
		this.erroresDeReserva = new PilaNodos<>();
		this.buzosRegistrados = new ColaNodos<>();
	}

	/**
	 * Se registra un buceo para un determinado buzo. si ocurre un error se registra
	 * en el log de errores, pero no se aborta la ejecucion.
	 * 
	 * -El buzo no puede ser nulo.
	 * 
	 * -El buceo cuyo id se indica, debe estar en la coleccion de buceos disponibles.
	 * 
	 * -El buzo debe estar habilitado para realizar el buceo seleccionado.
	 * 
	 * -De poder registrar al buzo, se debe agregar el buceo a su bitacora y
	 * agregarlo a los buzos registrados, que deben estar almacenados de forma
	 * cronologica.
	 * 
	 * @param buzo    Que desea bucear.
	 * @param idBuceo Identificador del buceo que el buzo quiere hacer.
	 */
	public void registrarBuceo(Buzo buzo, Integer idBuceo) {
		Buceo buceo = this.buscarBuceoPorID(idBuceo);
		
		if (buzo == null) {
			this.erroresDeReserva.push("Buzo nulo");
		}
		if (buceo == null) {
			this.erroresDeReserva.push("Buceo nulo");
		}
		if (buceo != null && buzo != null && !buzo.habilitado(buceo.getProfundidad())) {
			this.erroresDeReserva.push("Buceo no habilitado por profundidad");
		} else {
			this.buzosRegistrados.add(buzo);
			buzo.agregarABitacora(buceo);
		}
	}

	public void agregarBuceo(Buceo buceo, Mes mes) {
		Buceo buceoExistente = this.buscarBuceoPorID(buceo.getId());
		
		if (buceoExistente == null) {
			this.buceosDisponibles.add(buceo);
			this.cantidadBuceosPorMes[buceo.getId() - 1][mes.ordinal()]++;
		}
		

	}

	private Buceo buscarBuceoPorID(Integer idBuceo) {
		return this.buceosDisponibles.search(idBuceo);
	}

	public void listarErroresCronologico() {
		System.out.println("------------------");
		System.out.println("Mostrando errores en forma cronologica");
		Pila<String> aux = new PilaNodos<>();
		
		while(!this.erroresDeReserva.isEmpty()) {
			aux.push(this.erroresDeReserva.pop());
		}
		
		while(!aux.isEmpty()) {
			String error = aux.pop();
			System.out.println(error);
			this.erroresDeReserva.push(error);
		}

	}


	public void mostrarCantidadDeBuceosPorBuzoRegistrado() {
		System.out.println("------------------");

		Buzo centinela = null;
		this.buzosRegistrados.add(centinela);
		Buzo aux = this.buzosRegistrados.remove();
		while (aux != centinela) {
			System.out.println(aux.toString() + " | Cantidad de eventos: " +  aux.cantidadDeEventos());
			this.buzosRegistrados.add(aux);
			aux = this.buzosRegistrados.remove();
		}

	}

	public void mostrarCantidadDeReservasPorMes() {
		System.out.println("------------------");
		System.out.println("Cantidad de buceos por Mes");
		
		for (int idxMes = 0; idxMes < Mes.values().length; idxMes++) {
			int cantidadDeBuceos = 0;
			
			for (int idxBuceo = 0; idxBuceo < buceosDisponibles.size() - 1; idxBuceo++) {
				cantidadDeBuceos += this.cantidadBuceosPorMes[idxBuceo][idxMes];
			}
			
			System.out.printf("El mes de %s tiene una cantidad de reservas de: %d \n", Mes.values()[idxMes].getNombre(), cantidadDeBuceos);
		}
	}
}
