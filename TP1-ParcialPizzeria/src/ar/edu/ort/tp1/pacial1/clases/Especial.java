package ar.edu.ort.tp1.pacial1.clases;

public class Especial extends Pizza {
	private static final String MSG_ESPECIAL = "%-12s - %-15s - Precio de Venta: $%8.2f - %d fainas - %s\n";
	private static final float PRECIO_UNITARIO_FAINA = 70f;
	private int cantidadFainas;
	private TamanioDePizza tamanioDePizza;

	public Especial(String nombre, float costoBase, float porcentajeGanancia, int cantidadFainas, TamanioDePizza tamanioDePizza) {
		super(nombre, costoBase, porcentajeGanancia);
		this.cantidadFainas = cantidadFainas;
		this.tamanioDePizza = tamanioDePizza;
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_ESPECIAL, "Especial", this.getNombre(), this.getPrecioDeVenta(), this.cantidadFainas, this.tamanioDePizza.getDescripcion());
	}

	@Override
	public float getPrecioDeCosto() {
		return this.getCostoDeProduccion() * this.tamanioDePizza.getPorcentaje() + (this.cantidadFainas * PRECIO_UNITARIO_FAINA);
	}
}
