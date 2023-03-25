package ejercicio02;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	public final static int CANTIDAD_REPETICIONES = 10;
	public static void main(String[] args) {
		int suma = 0;
		int numIngresado = 0;
		int i = 1;
		do {
			System.out.printf("Ingrese el numero #%d: %n", i);
			numIngresado = Integer.parseInt(input.nextLine());
			suma += numIngresado;
			numIngresado = 0;
			i++;
		} while(i <= CANTIDAD_REPETICIONES);
		
		System.out.printf("La suma de los %d numeros es: %d", CANTIDAD_REPETICIONES, suma);
	}

}
