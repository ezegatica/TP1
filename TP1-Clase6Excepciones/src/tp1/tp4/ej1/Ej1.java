package tp1.tp4.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Probamos el error de carga con Integer.ParseInt
		int numero = 0;
		System.out.println("valor de la variable numero1: " + numero);
		try {
			System.out.print("Ingrese un numero: ");
			numero = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
		} finally {
			System.out.println("Ahora la variable numero1 vale: " + numero);
		}
		System.out.println("\n*************************\n");

		// volvemos a probar, pero usando nextInt (genera otra excepcion)
		numero = 0;
		try {
			System.out.println("valor de la variable numero2: " + numero);
			System.out.print("Ingrese un numero: ");
			numero = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error. Se produjo un error en la carga.");
		} finally {
			input.nextLine();
			System.out.println("Ahora la variable numero2 vale: " + numero);
		}

		// Ahora probamos de encapsular esta funcionalidad para capturar un
		// numero sin errores de carga por tipo de dato inadecuado.

		System.out.println("\n*************************\n");

		numero = pedirNumeroEntero(input);
		System.out.println("El numero ingresado fue " + numero + ".");

		input.close();
	}

	/**
	 * Pide un numero entero dentro de un ciclo. Solo saldra cuando el nro sea
	 * valido. Y dado que trabaja con excepciones el programa no fallara con la
	 * carga de datos no numericos.
	 * 
	 * @param input
	 *            el scanner a usar para la carga del nro.
	 * @return el valor ingresado.
	 */
	public static int pedirNumeroEntero(Scanner input) {
		int numero = 0;
		boolean ok = false;
		while (!ok) {
			try {
				System.out.print("Ingrese numero entero: ");
				numero = Integer.parseInt(input.nextLine());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Error. Ingrese un numero correcto");
			}
		}
		return numero;
	}

}
