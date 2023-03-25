package imgEjercicio02;

public class Directivo extends Empleado {
	public Directivo(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("%s -> Directivo", super.toString());
	}
}
