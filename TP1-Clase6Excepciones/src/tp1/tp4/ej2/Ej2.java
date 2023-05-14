package tp1.tp4.ej2;

import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {
	static Scanner input = new Scanner(System.in);
	static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	static final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);

	public static void main(String[] args) {
		// LectorEnteros lector = new LectorEnteros(input);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;

		while (alu == null) {
			dni = pedirEntero("DNI");
			anioNacimiento = pedirEntero("Año nacimiento");
			nombreCompleto = pedirString("Nombre");
			try {
				alu = new Alumno(dni, nombreCompleto, anioNacimiento);				
			} catch (Exception e) {
				alu = null;
				System.out.println(e.getMessage());
			}
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}
	}
	
	public static int pedirEntero(String nombre) {
		int in = 0;
		boolean okInput = false;
		while (!okInput) {
			try {
				System.out.print("Ingrese " + nombre + ": ");
				in = Integer.parseInt(input.nextLine());
				okInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Error. Ingrese un numero correcto");
			}
		}
		return in;
	}
	
	public static String pedirString(String nombre) {
		String in = "";
		boolean okInput = false;
		while (!okInput) {
			try {
				System.out.print("Ingrese " + nombre + ": ");
				in = input.nextLine();
				okInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Error. Ingrese un numero correcto");
			}
		}
		return in;
	}
}