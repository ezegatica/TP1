package par1.cerveceria.entidades;

public abstract class EnvaseCerveza {

	private Sabor sabor;
	protected double precioVenta;

	public EnvaseCerveza(Sabor sabor) {
		this.sabor = sabor;
		this.precioVenta = 0;
	}

	public Sabor getSabor() {
		return sabor;
	}

	protected abstract void setPrecioVenta(double precio);

	public double getPrecioVenta() {
		return precioVenta;
	}

	public abstract String getTipo();
}
