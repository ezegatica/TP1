package ar.edu.ort.tp1.unidad5.generics.danidados;

import java.util.ArrayList;

public class TestCaja2 {

	private static final int CANTIDAD_DE_CAJAS = 4;

	public static void main(String[] args) {
		
		//Recien vimos que podemos anidar generics en caso de ser necesario, por ejemplo usando ArrayList:
		ParDeZapatos zapatos = new ParDeZapatos("Negros");
		Caja<ParDeZapatos> cajaDeZapatos = new Caja<>();

		CajaDeZapatos cajaDeZapatos1 = new CajaDeZapatos();
		cajaDeZapatos1.guardar(new ParDeZapatos("Azules"));

		cajaDeZapatos.guardar(zapatos);
		ArrayList<Caja<ParDeZapatos>> miColeccionDeZapatos = new ArrayList<>();
		ArrayList<CajaDeZapatos> miColeccionDeZapatos2 = new ArrayList<>();
		miColeccionDeZapatos2.add(cajaDeZapatos1);

		for (CajaDeZapatos caja: miColeccionDeZapatos2) {
			caja.extraer();
		}
		
//Pero si intentamos hacer lo mismo con arrays nativos:
//Veremos que Arrays y Generics no se llevan bien en Java, al menos al momento de declarar e inicializar el array. 
//Esto se debe a lo que cada estructura necesita resolver en tiempo de compilaci�n y c�mo maneja la memoria para 
//s� misma y para su contenido. Podemos resumirlo en que mientras que a un ArrayList (o cualquier estructura que 
//use Generics) no le importa el tipo del dato contenido, a un Array s� le importa.
//Los tipos gen�ricos en el c�digo son una "ilusi�n" en tiempo de compilaci�n, "comodines" que ser�n reemplazados 
//por la clase real, y ah� est� la "magia". Cuando tenemos una variable de tipo como T (suponiendo que declaramos 
//Clase<T>), el c�digo usa este tipo como "comod�n". No puede saber realmente a qu� tipo se refiere realmente T, y 
//sin embargo, sea cual fuere la clase que ocupe el lugar de T, el c�digo funcionar� sin problemas. Pero mientras 
//una clase que usa generics no necesita conocer realmente qu� elemento tiene, un arreglo necesita conocer 
//expl�citamente el tipo de dato, no puede "dejarlo para despu�s"

		// Caja<ParDeZapatos> [] caja2 = new Caja<ParDeZapatos>[CANTIDAD_DE_CAJAS];//Error de compilacion
		
//Lo solucionamos creando una nueva clase que encapsule a la clase Caja<ParDeZapatos>,
//As�, al quedar escondida la definici�n gen�rica inicial, se puede crear e inicializar un Array de la nueva clase 
//sin problemas porque la nueva clase ya es de un tipo concreto:
		CajaDeZapatos[] zapatero = new CajaDeZapatos[CANTIDAD_DE_CAJAS];
		CajaDeZapatos caja = new CajaDeZapatos();
		caja.guardar(zapatos);
		zapatero[0] = caja;
	}
}