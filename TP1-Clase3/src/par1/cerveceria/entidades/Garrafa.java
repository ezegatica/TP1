package par1.cerveceria.entidades;

public class Garrafa extends EnvaseCerveza {
	private static final double RECARGO_MEDIANA = 1.1;
	private static final double RECARGO_CHICA = 1.2;
	private Medida medida;

	public Garrafa(Sabor sabor) {
		super(sabor);
		this.medida = Medida.MEDIANA;
	}
	
	public Garrafa(Sabor sabor, Medida medida) {
		super(sabor);
		this.medida = medida;
	}

	@Override
	protected void setPrecioVenta(double precio) {
		double precioVenta = precio;
		
		switch(getMedida()) {
		case CHICA:
			precioVenta = getMedida().getMililitros() * precio * RECARGO_CHICA;
			break;
		case MEDIANA:
			precioVenta = getMedida().getMililitros() * precio * RECARGO_MEDIANA;
			break;
		default:
			precioVenta = getMedida().getMililitros() * precio;
			break;
		}
		
		super.precioVenta = precioVenta / 1000; // Ya que usamos mililitros;
	}

	public Medida getMedida() {
		return this.medida;
	}
	
	@Override
	public String getTipo() {
		return "Garrafa";
	}

}
