package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {
	private String descripcion;
	private double porcentajeGanancia;
	private String patente;
	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.descripcion = descripcion;
		this.porcentajeGanancia = porcentajeGanancia;
		this.patente = patente;
	}

	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}

	public String getPatente() {
		return patente;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
