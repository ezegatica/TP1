package ar.edu.ort.tp1.final2.clases;

public enum Mes {
	ENERO("Enero"), FEBRERO("Febrero"), MARZO("Marzo"), ABRIL("Abril"), MAYO("Mayo"), JUNIO("Junio"), JULIO("Julio"),
	AGOSTO("Agosto"), SEPTIEMBRE("Septiembre"), OCTUBRE("Octubre"), NOVIEMBRE("Noviembre"), DICIEMBRE("Diciembre");

	private Mes(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public boolean nombreMes(String nombreMes) {
		return this.nombre.equals(nombreMes);
	}
}
