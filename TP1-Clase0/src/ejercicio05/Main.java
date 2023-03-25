package ejercicio05;

public class Main {
	private static final int MINIMO = 1;
	private static final int MAXIMO = 100;

	public static void main(String[] args) {
		
		for (int i = MINIMO; i <= MAXIMO; i++) {
			if (i % 2 == 0) {
				System.out.printf("El número %d es divisible por 2 o 3 %n", i);
			}
		}
	}
	
}
