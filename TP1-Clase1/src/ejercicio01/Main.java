package ejercicio01;
/*
 * Escribe un programa para una biblioteca que contenga libros y revistas...
 */
public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("borges1", "Fervor de Buenos Aires", 1923);
		Libro l2 = new Libro("cortazar1", "Casa Tomada", 1946);
		Revista r1 = new Revista("gente1", "Revista Gente", 1965, 1);
		
		System.out.printf("%s, prestado: %b %n", l1.toString(), l1.getPrestado());
		l1.prestar();
		System.out.printf("%s, prestado: %b %n", l1.toString(), l1.getPrestado());
	
		System.out.printf("%s, Edición #%d %n", r1.toString(), r1.getNumero());
	}

}
