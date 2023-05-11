package ejercicio01;

public class PelotaDeTenis {
	private int usos;
	private EstadoPelota estado;
	private static final int USOS_MAXIMOS_GASTADA = 7;
	
	public PelotaDeTenis() {
		this.usos = 0;
		this.estado = EstadoPelota.NUEVA;
	}
	
	@Override
	public String toString() {
		return String.format("PelotaDeTenis [usos=%d, estado=%s]", this.usos, this.estado);
	}
	
	public void usar() {
        usos++;
        if (usos <= USOS_MAXIMOS_GASTADA) {
            estado = EstadoPelota.USADA;
        } else {
            estado = EstadoPelota.GASTADA;
        }
    }

}
