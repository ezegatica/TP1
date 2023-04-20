package code;


/**
 * Indica que la clase debe poder mostrar su contenido de alguna forma.
 */
public interface Mostrable {
	
	public final static String FORMATO_ENCABEZADO_CONSOLA = "%9s %20s %17s %18s %25s\n";
	public final static String FORMATO_PRECIO_RENGLON_CONSOLA = "%9s ";
	public final static String FORMATO_RENGLON_CONSOLA = "%20s %17s %18.2f %25s\n";

	/**
	 * Muestra su contenido de la forma definida.
	 */
	public void mostrar();
}
