package imgEjercicio02;

public class Operario extends Empleado{
	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("%s -> Operario", super.toString());
	}
}
