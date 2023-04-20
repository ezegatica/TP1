package code;

/**
 * Representa un producto sin tacc
 */
public class ProductoSinTacc extends Producto {
	private String certificadoraSinTac;
	private static final String NOMBRE_MOSTRABLE = "Producto Sin TACC";

	
	public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadora) {
		super(familiaProducto, nombre, precio);
		this.setCertificadoraSinTac(certificadora);
	}

	public String getCertificadoraSinTac() {
		return this.certificadoraSinTac;
	}
	
	public void setCertificadoraSinTac(String t) {
		this.certificadoraSinTac = t;
	}
	
	@Override
	public void mostrar() {
		System.out.printf(
				Mostrable.FORMATO_RENGLON_CONSOLA, 
				getNombre(), 
				getFamiliaProducto(), 
				getPrecio(), 
				ProductoSinTacc.NOMBRE_MOSTRABLE
		);
	}
}