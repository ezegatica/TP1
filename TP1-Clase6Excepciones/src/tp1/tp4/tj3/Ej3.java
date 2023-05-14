package tp1.tp4.tj3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		nacimiento = lector.pedir("Ingrese una fecha de nacimiento", 1900, 2023);
		System.out.println(nacimiento);
		input.close();
	}
}
