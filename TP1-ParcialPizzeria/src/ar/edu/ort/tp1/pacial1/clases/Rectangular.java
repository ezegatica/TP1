package ar.edu.ort.tp1.pacial1.clases;

public class Rectangular extends Pizza {

	private static final String MSG_RECTANGULAR = "%-12s - %-15s - Precio de Venta: $%8.2f - %d porciones - %s\n";
	private static final float PRECIO_POR_PORCION = 45f;
	private long largo, ancho;
	private AdicionalQueso adicionalQueso;

	public Rectangular(String nombre, float costoBase, float porcentajeGanancia, long largo, long ancho, AdicionalQueso adicionalQueso) {
		super(nombre, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.adicionalQueso = adicionalQueso;
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_RECTANGULAR, "Rectangular", this.getNombre(), this.getPrecioDeVenta(), this.getCantidadPorciones(), this.adicionalQueso.getDescripcion());
	}

	@Override
	public float getPrecioDeCosto() {
		return (this.getCostoDeProduccion() + (this.getCantidadPorciones()) * PRECIO_POR_PORCION) * this.adicionalQueso.getMultiplicadorQueso();
	}
	
	private long getCantidadPorciones() {
		return this.largo * this.ancho;
	}
}
