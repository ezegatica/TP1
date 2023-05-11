package ejercicio01;

public class PelotaDeTenis {
	private int usos;
	private EstadoPelota estado;
	public PelotaDeTenis() {
		this.usos = 0;
		this.estado = EstadoPelota.NUEVA;
	}
	
	@Override
	public String toString() {
		return String.format("PelotaDeTenis [usos=%d, estado=%s]", this.usos, this.estado);
	}

}
