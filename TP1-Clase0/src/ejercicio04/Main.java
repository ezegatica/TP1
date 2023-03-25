package ejercicio04;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		if (num1 > num2) {
			System.out.printf("El primer numero %d es el mayor!", num1);
		} else if (num1 < num2) {
			System.out.printf("El segundo numero %d es el mayor!", num2);
		} else {
			System.out.printf("Los dos numeros son iguales!");
		}
	
	}
	
}
