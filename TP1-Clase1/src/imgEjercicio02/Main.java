package imgEjercicio02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado rafa = new Empleado("Rafa");
		Empleado mario = new Directivo("Mario");
		Empleado alfonso = new Operario("Alfonso");
		Empleado luis = new Oficial("Luis");
		Empleado pablo = new Tecnico("Pablo");

		System.out.println(rafa.toString());
		System.out.println(mario.toString());
		System.out.println(alfonso.toString());
		System.out.println(luis.toString());
		System.out.println(pablo.toString());

	}

}
