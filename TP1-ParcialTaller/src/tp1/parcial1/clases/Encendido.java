package tp1.parcial1.clases;

public class Encendido extends Servicio implements CotizablePorMateriales {

	public Encendido(String descripcion, double porcentajeGanancia, String patente) {
		super(descripcion, porcentajeGanancia, patente);
	}

	@Override
	public void detallar() {
		System.out.printf("Servicio de Encendido\nPatente: %s Precio: $%8.2f \n", this.getPatente(), this.calcularPrecioVenta());		
	}

	@Override
	public double calcularCostoMateriales() {
		return COSTOMATERIAL1 + COSTOMATERIAL2;
	}

	@Override
	public double calcularPrecioCosto() {
		return this.calcularCostoMateriales();
	}
}
