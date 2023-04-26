package ar.edu.ort.tp1.pacial1.clases;

public enum TipoDeMasa {

	A_LA_PIEDRA("A La Piedra", 1f), MEDIA_MASA("Media Masa",1.2f), DE_MOLDE("De Molde",1.3f);

	private String descripcion;
	private float porcentaje;

	private TipoDeMasa(String descripcion, float porcentaje) {
		this.descripcion 	= descripcion;
		this.porcentaje 	= porcentaje;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

}
