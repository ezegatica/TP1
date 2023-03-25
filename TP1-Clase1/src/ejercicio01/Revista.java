package ejercicio01;

public class Revista extends Publicacion {
	private int numero;
	public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
