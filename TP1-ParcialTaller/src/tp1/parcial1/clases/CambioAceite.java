package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	private	int horas;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
	}

	@Override
	public void detallar() {
		System.out.printf("Servicio de Cambio de Aceite\nPatente: %s Precio: $%8.2f \n", this.getPatente(), this.calcularPrecioVenta());

	}

	@Override
	public double calcularCostoMateriales() {
		return COSTOMATERIAL1 + COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return this.horas * COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return this.calcularCostoHoras() + this.calcularCostoMateriales();
	}

	

}
