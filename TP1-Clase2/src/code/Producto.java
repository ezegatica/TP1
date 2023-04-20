package code;


/**
 * Un producto
 */
public abstract class Producto implements Mostrable{
	private String nombre;
	private float precio;
	private FamiliaProducto familiaProducto;

	private static final float DESCUENTO_POR_MAYOR = 0.9f;

	/**
	 * Constructor del pedido, recibe sus atributos como par�metro
	 * 
	 * @param familiaProducto {@link FamiliaProducto}
	 * @param nombre          {@link String} con el nombre
	 * @param precio          {@link Float} con su precio
	 */
	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		this.setFamiliaProducto(familiaProducto);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public float getPrecio(TipoPedido tipoPedido) {
		float precioReturn;
		if (tipoPedido.equals(TipoPedido.POR_MAYOR)) {
			precioReturn = this.precio * DESCUENTO_POR_MAYOR;
		} else {
			precioReturn = this.precio;
		}
		return precioReturn;
	}

	public float getPrecio() {
		return this.precio;
	}
	
	public FamiliaProducto getFamiliaProducto() {
		return familiaProducto;
	}

	public void setFamiliaProducto(FamiliaProducto familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
