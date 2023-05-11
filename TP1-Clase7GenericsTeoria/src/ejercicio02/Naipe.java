package ejercicio02;

public abstract class Naipe {
	private int numero;
	public Naipe(int numero) {
		this.numero = numero;
	}

    public int getNumero() {
        return numero;
    }

    public boolean esComodin() {
        return (numero == 0);
    }
}
