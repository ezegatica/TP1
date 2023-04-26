package ar.edu.ort.tp1.pacial1.clases;

public abstract class Pizza implements Mostrable {

	public static final String MSG_GANANCIA_INVALIDA = "Ganancia inv�lida";
	public static final String MSG_COSTO_INVALIDO = "Costo inv�lido";
	public static final String MSG_NOMBRE_INVALIDO = "Nombre inv�lido";
	
	private String nombre;
	private float costoDeProduccion, porcentajeGanancia;
	
	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {
		this.nombre = nombre;
		this.costoDeProduccion = costoDeProduccion;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public abstract float getPrecioDeCosto();


	public float getPrecioDeVenta() {
		return this.getPrecioDeCosto() + (this.porcentajeGanancia/100) * this.getPrecioDeCosto();
	}


	public boolean modeloCorrecto(String modelo) {
		return modelo == this.nombre;
	}

	public float getCostoDeProduccion() {
		return costoDeProduccion;
	}
	
	public float getPorcentajeGanancia() {
		return this.porcentajeGanancia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
