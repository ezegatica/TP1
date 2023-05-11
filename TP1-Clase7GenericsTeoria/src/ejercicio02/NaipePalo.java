package ejercicio02;

public class NaipePalo extends Naipe {
	private Palo palo;

	public NaipePalo(int numero, Palo palo) {
		super(numero);
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return String.format("%s - %d", this.getPalo(), this.getNumero());
	}

}
