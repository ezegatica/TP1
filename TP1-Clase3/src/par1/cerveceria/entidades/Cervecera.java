package par1.cerveceria.entidades;

import java.util.ArrayList;

public class Cervecera {

	private static final double PRECIO_BOTELLITA = 80.0;
	private static final double PRECIO_LITRO = 160.0;
	private ArrayList<Contenedor> deposito;

	// DESCOMENTAR Y COMPLETAR
	private Refrigerador<Cajon> refrigeradorEnvasados;
	private Refrigerador<Barril> refrigeradorSueltos;
	
	private ArrayList<EnvaseCerveza> ventas;
	// FALTAN ATRIBUTOS, COMPLETAR

	public Cervecera() {
		this.deposito = new ArrayList<>();
		this.refrigeradorEnvasados = new Refrigerador<>();
		this.refrigeradorSueltos = new Refrigerador<>();
		this.ventas = new ArrayList<>();
	}
	
	/**
	 * Guarda el barril en el refrigerador que corresponda.
	 * @param sabor
	 */
	public void agregarBarril(Sabor sabor) {
		this.refrigeradorSueltos.add(new Barril(sabor));
	}

	/**
	 * Guarda el cajon en el refrigerador que corresponda
	 * @param sabor
	 */
	public void agregarCajon(Sabor sabor) {
		this.refrigeradorEnvasados.add(new Cajon(sabor));
	}

	/**
	 * Se usa para vender botellitas. No olvides chequear el stock al terminar la venta.
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Sabor sabor) {
		EnvaseCerveza botellita = null;
		Cajon cajon = this.refrigeradorEnvasados.buscar(sabor);
		
		if (cajon != null) {
			botellita = cajon.extraer();
			botellita.setPrecioVenta(PRECIO_BOTELLITA);
			
			ventas.add(botellita);
			
			if (cajon.estaVacio()) {
				this.refrigeradorEnvasados.remove(cajon);
				this.deposito.add(cajon);
			}
			
		}
		return botellita;
	}

	/**
	 * Se usa para vender cerveza suelta en garrafas. No olvides chequear el stock al terminar la venta.
	 * @param capacidad
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Medida capacidad, Sabor sabor) {
		EnvaseCerveza envase = null;
		Barril barril = this.refrigeradorSueltos.buscar(sabor);
		
		if (barril != null) {
			envase = barril.extraer(capacidad);
			envase.setPrecioVenta(PRECIO_LITRO);
			
			ventas.add(envase);
			
			if (barril.estaVacio()) {
				this.refrigeradorSueltos.remove(barril);
				this.deposito.add(barril);
			}
			
		}
		
		return envase;
	}

	/**
	 * Lista los sabores disponibles de cerveza suelta o preenvasada
	 */
	public void listarDisponibles() {
		System.out.println("Sabores disponibles de cerveza pre envasada");
		for (Contenedor contenedor: this.refrigeradorEnvasados.getLista()) {
			System.out.println(contenedor.getSabor());
		}
		
		System.out.println("Sabores disponibles de cerveza suelta");
		for (Contenedor contenedor: this.refrigeradorSueltos.getLista()) {
			System.out.println(contenedor.getSabor());
		}
	}

	public double getPrecioLitro() {
		return PRECIO_LITRO;
	}

	public double getPrecioUnidad() {
		return PRECIO_BOTELLITA;
	}

	/**
	 * Lista la reposicion a partir de lo que haya vacio en deposito.
	 */
	private void listarReposicion() {
		System.out.println("-- Reposiciones --");
		if (deposito.isEmpty()) {
			System.out.println("No hay nada que reponer.");
		} else {
			System.out.println("Se debe reponer.");
			for (Contenedor contenedor: this.deposito) {
				System.out.println(contenedor.getSabor() + " Presentacion " + contenedor.getClass().getSimpleName());
			}
		}
	}

	/**
	 * Lista la cantidad de unidades vendidas de cada sabor.
	 */
	private void listarUnidadesVendidasPorSabor() {
		int cantidadGolden = 0;
		int cantidadBlack = 0;
		int cantidadIpa = 0;
		int cantidadStout = 0;
		int cantidadHoney = 0;
		int cantidadLager = 0;
		int cantidadBock = 0;
		System.out.println("-- Unidades vendidas por sabor --");
		for (EnvaseCerveza cerveza: this.ventas) {
			switch(cerveza.getSabor()) {
				case GOLDEN:
					cantidadGolden++;
					break;
				case BLACK:
					cantidadBlack++;
					break;
				case IPA:
					cantidadIpa++;
					break;
				case STOUT:
					cantidadStout++;
					break;
				case HONEY:
					cantidadHoney++;
					break;
				case LAGER:
					cantidadLager++;
					break;
				case BOCK:
					cantidadBock++;
					break;
			}
		}
		System.out.printf("GOLDEN = %d\n", cantidadGolden);
		System.out.printf("BLACK = %d\n", cantidadBlack);
		System.out.printf("IPA = %d\n", cantidadIpa);
		System.out.printf("STOUT = %d\n", cantidadStout);
		System.out.printf("HONEY = %d\n", cantidadHoney);
		System.out.printf("LAGER = %d\n", cantidadLager);
		System.out.printf("BOCK = %d\n", cantidadBock);
	}

	public void cerrarDia() {
		System.out.println("** Cierre del dia **");
		listarReposicion();
		listarUnidadesVendidasPorSabor();
	}

}