package ar.edu.ort.tp1.pacial1.clases;

public enum TamanioDePizza {

	PERSONAL("Personal", 1f), MEDIANA("Mediana", 1.25f), FAMILIAR("Familiar", 1.5f);

	private String 	descripcion;
	private float porcentaje;

	private TamanioDePizza(String descripcion, float porcentaje) {
		this.descripcion	= descripcion;
		this.porcentaje 	= porcentaje;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

}
