package par1.cerveceria;

import par1.cerveceria.entidades.Cervecera;
import par1.cerveceria.entidades.Sabor;
import par1.cerveceria.entidades.EnvaseCerveza;
import par1.cerveceria.entidades.Medida;

public class Ejercicio {

	public static void main(String[] args) {
		Cervecera miCervecera = new Cervecera();
		
		System.out.println("El precio por litro es " + miCervecera.getPrecioLitro());
		System.out.println("El precio por unidad es " + miCervecera.getPrecioUnidad());
		
		miCervecera.agregarBarril(Sabor.BOCK);
		miCervecera.agregarBarril(Sabor.GOLDEN);
		miCervecera.agregarBarril(Sabor.LAGER);
		miCervecera.agregarBarril(Sabor.STOUT);
		miCervecera.agregarCajon(Sabor.GOLDEN);
		miCervecera.agregarCajon(Sabor.IPA);
		miCervecera.agregarCajon(Sabor.LAGER);
		miCervecera.agregarCajon(Sabor.BOCK);
		miCervecera.agregarCajon(Sabor.STOUT);
		miCervecera.agregarCajon(Sabor.HONEY);
		
		miCervecera.listarDisponibles();

		System.out.println("** VENTAS **");
		EnvaseCerveza cerveza = miCervecera.vender(Sabor.STOUT);
		mostrarCompra(cerveza);
		cerveza = miCervecera.vender(Medida.CHICA, Sabor.BOCK);
		mostrarCompra(cerveza);
		cerveza = miCervecera.vender(Medida.MEDIANA, Sabor.LAGER);
		mostrarCompra(cerveza);
		cerveza = miCervecera.vender(Medida.GRANDE, Sabor.IPA);
		mostrarCompra(cerveza);
		cerveza = miCervecera.vender(Medida.GRANDE, Sabor.GOLDEN);
		mostrarCompra(cerveza);

		miCervecera.cerrarDia();
	}

	private static void mostrarCompra(EnvaseCerveza cerveza) {
		if (cerveza == null) {
			System.out.println("No habia cerveza del sabor pedido");
		} else {
			System.out.printf("%s de %s - %5.2f$\n", cerveza.getTipo(), cerveza.getSabor(), cerveza.getPrecioVenta());
		}
	}

}
