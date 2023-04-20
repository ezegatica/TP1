package code;

/**
 * Representa un producto con tacc que puede estar en un pedido
 */
public class ProductoConTacc extends Producto {
	private static final String NOMBRE_MOSTRABLE = "Producto Con TACC";


	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
	}

	public void mostrar() {
		System.out.printf(
				Mostrable.FORMATO_RENGLON_CONSOLA, 
				getNombre(), 
				getFamiliaProducto(), 
				getPrecio(), 
				ProductoConTacc.NOMBRE_MOSTRABLE
				);
	}
}
