package ejercicio02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo(10, 20, "Polideportivo A"));
        edificios.add(new Polideportivo(20, 50, "Polideportivo B"));
        edificios.add(new Polideportivo(30, 10, "Polideportivo C"));
        edificios.add(new EdificioDeOficinas(10, 20, 30));
        edificios.add(new EdificioDeOficinas(20, 20, 10));
        
        for (Edificio ed: edificios) {
            if (ed instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) ed;
                System.out.printf("El polideportivo '%s' es de tipo #%d. ", poli.getNombre(), poli.getTipoDeInstalacion());
            } else if (ed instanceof EdificioDeOficinas) {
                EdificioDeOficinas ofi = (EdificioDeOficinas) ed;
                System.out.printf("El Edificio de Oficinas tiene %d oficinas. ", ofi.getNumOficinas());
            }
        	System.out.printf("La superficie es de: %.2f m2.%n", ed.getSuperficieEdificio());
        }
        
        System.out.printf("%nLa clase 'Polideportivo' implementa las interfaces 'InstalacionDeportiva' y 'Edificio', lo que asemeja a una herencia múltiple.%n");
	}

}
