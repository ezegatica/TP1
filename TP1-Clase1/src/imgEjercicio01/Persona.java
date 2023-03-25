package imgEjercicio01;

public abstract class Persona {
	protected String nombre;
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
    public abstract int correr();
}
