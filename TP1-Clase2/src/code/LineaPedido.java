package code;

/**
 * L�nea de un pedido, incluye el producto y la cantidad del mismo
 */
public class LineaPedido implements Mostrable {
	private Producto producto;
	private int cantidad;

	/**
	 * Constructor de la entidad
	 * 
	 * @param producto {@link Producto} contenido en la l�nea.
	 * @param cantidad {@link Integer} representando la cantidad de producto de la
	 *                 l�nea
	 */
	public LineaPedido(Producto producto, int cantidad) {
		this.setProducto(producto);
		this.setCantidad(cantidad);
	}

	/**
	 * Devuelve le precio de una linea de pedido
	 * 
	 * @param tipo {@link TipoPedido} para calular el precio
	 * @return {@link Float} con el precio de la l�nea
	 */
	public float getPrecioLineaPedido(TipoPedido tipo) {
		return this.getProducto().getPrecio(tipo) * this.getCantidad();
	}

	/**
	 * Agraga la cantidad indicada de producto a la {@link LineaPedido}
	 * 
	 * @param cantidad {@link Integer} con la cantidad a agregar (debe ser positivo,
	 *                 si no, no agrega)
	 */
	public void adicionarCantidad(int cantidad) {
		if (cantidad >= 0) {
			this.setCantidad(getCantidad() + cantidad);
		}
	}
	
	public void mostrar() {
		System.out.printf(Mostrable.FORMATO_PRECIO_RENGLON_CONSOLA, this.cantidad);
		this.getProducto().mostrar();
		System.out.println();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
