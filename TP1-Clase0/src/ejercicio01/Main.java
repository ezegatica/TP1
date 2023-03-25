package ejercicio01;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	
	public final static int CERO = 0;
	
	public static void main(String[] args) {
		
		int num1 = CERO;
		int num2 = CERO;
		do {
			System.out.println("Ingrese el primer numero");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese el segundo numero");
			num2 = Integer.parseInt(input.nextLine());
		} while(num1 != num2);
		
		System.out.printf("Los numeros ingresados son iguales! (%d y %d)", num1, num2);
	}
}
