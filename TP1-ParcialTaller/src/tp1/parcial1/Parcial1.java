package tp1.parcial1;
import tp1.parcial1.clases.*;

public class Parcial1 {
	
	public static void main(String[] args) {

		TallerMecanico miTaller = new TallerMecanico("Ort Boxes");
		agregarServicio(new CambioAceite("Cambio de aceite 1", 100, "AB404AC", 2), miTaller);
		agregarServicio(null, miTaller);
		agregarServicio(new CambioAceite("Cambio de aceite 2", 100, "AUA898", 3), miTaller);
		agregarServicio(new CambioAceite("Cambio de aceite 3", 80, "AC392BC", 1), miTaller);
		agregarServicio(null, miTaller);
		agregarServicio(new Alineacion("Alineacion 1", 20, "HBC343",  1, false), miTaller);
		agregarServicio(new Alineacion("Alineacion 2", 20, "IJM444", 2, true), miTaller);
		agregarServicio(new Encendido("Encendido 1", 40, "AD391BC"), miTaller);
		agregarServicio(new Encendido("Encendido 2", 40, "AC422DC"), miTaller);
		miTaller.listarServicios();
	}
	
	public static void agregarServicio(Servicio servicio, TallerMecanico miTaller) {
		if (miTaller.agregarServicio(servicio)) {
			System.out.println("Se agrego el servicio: " + servicio.getDescripcion());
			servicio.detallar();
		} else {
			System.out.println("No se agrego el servicio");
		}
	}

}
