package ejercicio06;
import java.util.Scanner;

/*
 * Escribe una aplicación con un String que contenga una contraseña cualquiera. 
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
 * Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. 
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

 */

public class Main {
	private static Scanner input = new Scanner(System.in);
	private static final String PASSWORD = "pepito";
	private static int INTENTOS_MAXIMOS = 3;
	public static void main(String[] args) {
		int intentos = 0;
		String userInput = "";
		do {
			System.out.println("Ingrese la contraseña");
			userInput = input.nextLine();
			
			
			intentos++;
		} while(intentos < INTENTOS_MAXIMOS && !userInput.equals(PASSWORD));

		if (userInput.equals(PASSWORD)) {
			System.out.println("Enhorabuena!");
		} else {
			System.out.println("No pudiste adivinar la contraseña");
		}
	}
	
}
