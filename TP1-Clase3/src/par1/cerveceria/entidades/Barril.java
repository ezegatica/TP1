package par1.cerveceria.entidades;

public class Barril extends Contenedor {
	private int contenido;
	private static final int CANTIDAD_MINIMA = 750;
	private static final int CANTIDAD_MAXIMA = 30000;

	public Barril(Sabor sabor) {
		super(sabor);
		this.setContenido(CANTIDAD_MAXIMA);
	}

	@Override
	public boolean estaVacio() {
		return this.getContenido() < CANTIDAD_MINIMA;
	}

	@Override
	protected EnvaseCerveza extraer() {
		return this.extraer(Medida.MEDIANA);
	}
	
	protected EnvaseCerveza extraer(Medida medida) {
		EnvaseCerveza garrafa = null;
		if (!this.estaVacio()) {
			this.contenido -= medida.getMililitros();
			garrafa = new Garrafa(getSabor(), medida);
		}
		return garrafa;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

}
