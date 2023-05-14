package ejercicio01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TuboDePelotas t1 = new TuboDePelotas();
		PelotaDeTenis p1 = t1.sacarPelota();
		p1.usar();
		p1.usar();
		PelotaDeTenis p2 = t1.sacarPelota();
		p2.usar();
		p2.usar();
		p2.usar();
		p2.usar();
		p2.usar();
		p2.usar();
		t1.guardarPelota(p1);
		t1.guardarPelota(p2);
		System.out.println(t1);

	}
}
