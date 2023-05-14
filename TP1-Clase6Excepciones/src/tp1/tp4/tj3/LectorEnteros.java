package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	public LectorEnteros(Scanner scanner) {
		if (scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}

	public int pedir(String mensaje) {
		int input = 0;
		boolean ok = false;
		while (!ok) {
			try {
				input = this.cargar(mensaje);
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: " + MENSAJE_CARGA_ENTERO);
			}
		}
		return input;
	}

	public int pedir(String mensaje, int limiteA, int limiteB) {
		String extra = String.format(" entre %d y %d", limiteA, limiteB);
		int input = 0;
		RangoDeEnteros rango = new RangoDeEnteros(limiteA, limiteB);
		boolean ok = false;
		while (!ok) {
			try {
				input = this.cargar(mensaje + extra);
				if (!rango.incluye(input)) {
					throw new IllegalArgumentException();
				}
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: " + MENSAJE_CARGA_ENTERO);
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + MENSAJE_FUERA_DE_RANGO);
			}
		}
		return input;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) {
		if (mensaje == null || mensaje.isEmpty() || rangoValido == null) {
			throw new IllegalArgumentException("El mensaje y rango no deben ser nulos");
		}
		int input = 0;
		boolean ok = false;
		while (!ok) {
			try {
				input = this.cargar(mensaje);
				if (!rangoValido.incluye(input)) {
					throw new IllegalArgumentException();
				}
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: " + MENSAJE_CARGA_ENTERO);
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + MENSAJE_FUERA_DE_RANGO);
			}
		}
		return input;
	}
}
