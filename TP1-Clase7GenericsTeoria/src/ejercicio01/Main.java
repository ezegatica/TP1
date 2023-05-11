package ejercicio01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TuboDePelotas t1 = new TuboDePelotas();
		PelotaDeTenis p1 = t1.sacarPelota();
		p1.usar();
		t1.guardarPelota(p1);
		System.out.println(t1);

	}
}
