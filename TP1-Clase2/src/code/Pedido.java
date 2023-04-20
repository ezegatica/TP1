package code;


import java.util.ArrayList;

/**
 * Clase que contiene un pedido generado.
 */
public class Pedido implements Mostrable, Certificable {
	private TipoPedido tipo;
	private ArrayList<Integer> cantidadList;
	private ArrayList<Producto> productoList;

	public Pedido(TipoPedido tipo) {
		this.tipo = tipo;
		this.cantidadList = new ArrayList<>();
		this.productoList = new ArrayList<>();
	}

	/**
	 * Permite agregar un producto al pedido
	 * 
	 * @param producto El {@link Producto} a agregar.
	 * @param cantidad La cantidadd del {@link Producto} a agregar
	 */
	public void agregarProducto(Producto producto, Integer cantidad) {
		int pI = this.buscarProducto(producto);
		if (pI == -1) {
			this.productoList.add(producto);
			this.cantidadList.add(cantidad);			
		} else {
			this.cantidadList.set(pI, this.cantidadProducto(producto) + cantidad);
		}
	}

	/**
	 * Saca un producto del pedido.
	 * 
	 * @param producto El {@link Producto} a sacar del pedido
	 * @param cantidadASacar Cantidad del {@link Producto} a sacar del pedido
	 */
	public void sacarProducto(Producto producto, int cantidadASacar) {
		int pI = this.buscarProducto(producto);
		if (pI != -1) {
			if (this.cantidadProducto(producto) > cantidadASacar) {
				// Restar cantidad
				this.cantidadList.set(pI, this.cantidadList.get(pI) - cantidadASacar);
			} else {
				// Eliminar del array ya que la cantidad es mayor a la disponible
				this.productoList.remove(pI);
				this.cantidadList.remove(pI);
			}
		}
	}

	/**
	 * Devuelve el indice del producto buscado en la lista.
	 * 
	 * @param p {@link Producto}
	 * @return El indice >= 0 si encuentra el producto y -1 si no lo encuentra
	 */
	private int buscarProducto(Producto p) {
		int idx = -1;
		int i = 0;
		do {
			if (this.productoList.size() > 0 && this.productoList.get(i).equals(p)) {
				idx = i;
			}
			i++;
		} while(idx == -1 && i < this.productoList.size());
		return idx;
	}

	/**
	 * Indica la cantidad del producto dado.
	 * 
	 * @param producto {@link Producto} cuya cantidad se desea averiguar
	 * @return {@link Integer} conteniendo la cantidad del producto en el pedido -1
	 *         si no est� el producto
	 */
	private int cantidadProducto(Producto producto) {
		int pI = this.buscarProducto(producto);
		int cantidad;
		if (pI == -1) {
			cantidad = this.cantidadList.get(pI);
		} else {
			cantidad = -1;
		}
		return cantidad;
	}

	/**
	 * Devuelve una estructura conteniendo las lineas del pedido
	 * 
	 * @return un la estructura conteniendo {@link LineaPedido}s
	 */
	private ArrayList<LineaPedido> getTablaProductosPedidos() {
		ArrayList<LineaPedido> l = new ArrayList<>();
		for (int i = 0; i < this.productoList.size(); i++) {
			Producto p = this.productoList.get(i);
			int c = this.cantidadList.get(i);
			LineaPedido lineaToAdd = new LineaPedido(p, c);
			l.add(lineaToAdd);
		}
		return l;
	}

	/**
	 * // * Calcula el importe del pedido
	 * 
	 * @return {@link Float} conteniendo el importe del pedido
	 */
	private float calcularImportePedido() {
		float importe = 0;
		ArrayList<LineaPedido> lista = this.getTablaProductosPedidos();
		for (LineaPedido p: lista) {
			float precio = p.getProducto().getPrecio(this.tipo);
			float cantidad = p.getCantidad();
			importe += precio * cantidad;
		}
		return importe;
	}
	

	@Override
	public boolean isCertificadoSinTACC() {
		boolean certificadoSinTac = true;
		int i = 0;
		
		while(i < this.productoList.size() && certificadoSinTac) {
			if (this.productoList.get(i) instanceof ProductoConTacc) {
				certificadoSinTac = false;
			}
			i++;
		}
		
		return certificadoSinTac;
	}

	public void mostrar() {
		System.out.printf(FORMATO_ENCABEZADO_CONSOLA, "Cantidad", "Nombre", "Tipo de Producto", "Precio Unitario", "Tipo de Producto");
		ArrayList<LineaPedido> lista = this.getTablaProductosPedidos();
		for(LineaPedido lp: lista) {
			lp.mostrar();
		}
		
		System.out.println("-----------------------------------");
		
		if(this.isCertificadoSinTACC()) {
			System.out.println("El pedido es certificado sin TACC");
		} else {
			System.out.println("El pedido NO es certificado sin TACC");
		}
		
		System.out.println("-----------------------------------");
		System.out.printf("El precio total del pedido es $ %5.2f", this.calcularImportePedido());
	}
}
