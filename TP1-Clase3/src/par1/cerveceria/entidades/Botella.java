package par1.cerveceria.entidades;

public class Botella extends EnvaseCerveza {
	public static final int CANTIDAD_ML_BOTELLA = 350;
	private int mililitros;

	public Botella(Sabor sabor) {
		super(sabor);
		this.setMililitros(CANTIDAD_ML_BOTELLA);
	}

	@Override
	protected void setPrecioVenta(double precio) {
		super.precioVenta = precio;
		
	}

	@Override
	public String getTipo() {
		return "Botella";
	}

	public int getMililitros() {
		return mililitros;
	}

	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}

}
