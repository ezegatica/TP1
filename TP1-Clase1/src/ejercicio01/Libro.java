package ejercicio01;

public class Libro extends Publicacion implements Prestable {
	private boolean prestado;
	public Libro(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		this.prestado = false;
	}
	
	@Override
	public void prestar() {
		this.prestado = true;
	}
	
	@Override
	public void devolver() {
		this.prestado = false;
	}
	
	@Override
    public boolean prestado() {
        return prestado;
    }
	
	public boolean getPrestado() {
		return this.prestado;
	}
}
