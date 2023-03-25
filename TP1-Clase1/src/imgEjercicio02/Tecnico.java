package imgEjercicio02;

public class Tecnico extends Operario{
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("%s -> Tecnico", super.toString());
	}
}
