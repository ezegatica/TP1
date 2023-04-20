package par1.cerveceria.entidades;

public enum Medida {
	GRANDE(3000), MEDIANA(1500), CHICA(750);
	
	private int mililitros;
	
	Medida(int mililitros){
		this.setMililitros(mililitros);
	}

	public int getMililitros() {
		return mililitros;
	}

	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
}
