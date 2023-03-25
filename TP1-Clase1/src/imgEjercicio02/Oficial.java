package imgEjercicio02;

public class Oficial extends Operario{
	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("%s -> Oficial", super.toString());
	}
}
