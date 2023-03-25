package ejercicio01;

public abstract class Publicacion {
	private String codigo;
	private String titulo;
	private int anioPublicacion;
	
	public Publicacion(String codigo, String titulo, int anioPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public String toString() {
		return String.format("Codigo: %s, Titulo: %s, Año de publicacion: %d", this.codigo, this.titulo, this.anioPublicacion);
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public int getAnio() {
		return this.anioPublicacion;
	}
}
