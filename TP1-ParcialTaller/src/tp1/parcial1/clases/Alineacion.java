package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	private int horas;
	private boolean conBalanceo;

	public Alineacion(String descripcion, double porcentajeGanancia,
			 String patente, int horas, boolean conBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
		this.conBalanceo = conBalanceo;
	}

	@Override
	public void detallar() {
		System.out.printf("Servicio de Alineacion\nPatente: %s Precio: $%8.2f \n", this.getPatente(), this.calcularPrecioVenta());
	}

	@Override
	public double calcularCostoHoras() {
		return this.horas * COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		double costo = 0;
		if (conBalanceo) {
			costo += EXTRABALANCEO;
		}
		costo += this.calcularCostoHoras();
		return costo;
	}
	

}
