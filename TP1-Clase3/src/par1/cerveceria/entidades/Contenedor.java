package par1.cerveceria.entidades;

public abstract class Contenedor implements Stockeable {
	private Sabor sabor;

	public Contenedor(Sabor sabor) {
		this.setSabor(sabor);
	}

	public Sabor getSabor() {
		return sabor;
	}

	private void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	protected abstract EnvaseCerveza extraer();
}
