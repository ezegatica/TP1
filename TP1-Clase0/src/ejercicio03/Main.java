package ejercicio03;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	public final static int CANTIDAD_REPETICIONES = 10;
	public static void main(String[] args) {
		int suma = 0;
		int numIngresado = 0;

		for(int i = 1; i <= CANTIDAD_REPETICIONES; i++) {
			System.out.printf("Ingrese el numero #%d: %n", i);
			numIngresado = Integer.parseInt(input.nextLine());
			suma += numIngresado;
			numIngresado = 0;
		};
		
		System.out.printf("La suma de los %d numeros es: %d", CANTIDAD_REPETICIONES, suma);
	}

}
