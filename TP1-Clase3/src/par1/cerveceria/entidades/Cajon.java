package par1.cerveceria.entidades;

public class Cajon extends Contenedor {
	public static final int CANTIDAD_BOTELLAS = 12;
	
	private int cantidadBotellas;

	public Cajon(Sabor sabor) {
		super(sabor);
		this.setCantidadBotellas(CANTIDAD_BOTELLAS);
	}

	@Override
	protected EnvaseCerveza extraer() {
		EnvaseCerveza botella = null;
		if (!this.estaVacio()) {
			this.setCantidadBotellas(this.getCantidadBotellas() - 1);
			botella = new Botella(getSabor());
		}
		return botella;
	}

	@Override
	public boolean estaVacio() {
		return this.getCantidadBotellas() == 0;
	}

	public int getCantidadBotellas() {
		return cantidadBotellas;
	}

	public void setCantidadBotellas(int cantidadBotellas) {
		this.cantidadBotellas = cantidadBotellas;
	}

}
