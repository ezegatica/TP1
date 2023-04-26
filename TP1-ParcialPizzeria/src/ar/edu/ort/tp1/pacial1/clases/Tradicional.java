package ar.edu.ort.tp1.pacial1.clases;

public class Tradicional extends Pizza {
	private static final String MSG_TRADICIONAL = "%-12s - %-15s - Precio de Venta: $%8.2f - %s\n";
	private TipoDeMasa tipoDeMasa;
	
	public Tradicional(String nombre, float costoBase, float porcentajeGanancia, TipoDeMasa tipoDeMasa) {
		super(nombre, costoBase, porcentajeGanancia);
		this.tipoDeMasa = tipoDeMasa;
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_TRADICIONAL, "Tradicional", this.getNombre(), this.getPrecioDeVenta(), this.tipoDeMasa.getDescripcion());
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion() * this.tipoDeMasa.getPorcentaje();
	}
}
