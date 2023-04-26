package tp1.parcial1.clases;
import java.util.ArrayList;

public class TallerMecanico {
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private int cantAli = 0;
	private int cantCambio = 0;
	private int cantEnc = 0;
	
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	
	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<>();
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if (nuevoServicio == null) {
			// Nada
		}
		else if (nuevoServicio instanceof Alineacion) {
			cantAli++;
		} else if (nuevoServicio instanceof CambioAceite) {
			cantCambio++;
		} else if (nuevoServicio instanceof Encendido) {
			cantEnc++;
		}
		
		if (nuevoServicio != null) {
			this.serviciosEfectuados.add(nuevoServicio);
			pudo = true;
		}

		return pudo;
	}
	
	public void listarServicios() {
		double total = 0;
		for (Servicio s: this.serviciosEfectuados) {
			total += s.calcularPrecioVenta();
		}
		System.out.printf("Taller %s", this.nombre);
		System.out.printf(FORMATO_CANTIDADES, this.cantCambio, this.cantEnc, this.cantAli);
		System.out.printf("El importe total de ventas es de $%8.2f", total);
	}
}
