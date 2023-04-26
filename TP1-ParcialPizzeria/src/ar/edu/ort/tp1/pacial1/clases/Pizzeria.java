package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class Pizzeria implements Mostrable {

	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final String MSG_FABRICANDO = "Fabricando la Pizza: ";
	private ArrayList<Pizza> pizzas;
	private String nombre;
	private int cantEspecial = 0;
	private int cantRectangular = 0;
	private int cantTradicional = 0;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		this.pizzas = new ArrayList<>();
	}

	public boolean fabricar(Pizza m) {
		System.out.printf(MSG_FABRICANDO);
		m.mostrar();
		if (m instanceof Especial) {
			Especial p = (Especial) m;
			this.pizzas.add(p);
			//p.mostrar();
			this.cantEspecial += 1;
		} else if (m instanceof Rectangular) {
			Rectangular p = (Rectangular) m;
			this.pizzas.add(p);
			//p.mostrar();
			this.cantRectangular += 1;			
		} else if (m instanceof Tradicional) {
			Tradicional p = (Tradicional) m;
			this.pizzas.add(p);
			//p.mostrar();
			this.cantTradicional += 1;
		}
		return true;
	}


	/**
	 * Retorna la sumatoria de los precios de Venta de nombre de la pizza enviado por parametro. 
	 * @param nombre
	 * @return
	 */
	public float sumatoriaDePizzas(String nombre) {
		float total = 0;
		for (Pizza p: this.pizzas) {
			if (p.modeloCorrecto(nombre)) {
				total += p.getPrecioDeVenta();
			}
		}
		return total;
	}
	
	/**
	 * 	Retorna la cantidad de pizzas vendidas con el precio de venta entre los parametros enviados.
	 * 	Los valores enviados son inclusivos.
	 * @param precioInferior
	 * @param precioSuperior
	 * @return
	 */
	
	public int vendidasConPrecioEntre(float precioInferior, float precioSuperior) {
		int cantidad = 0;
		for (Pizza p: this.pizzas) {
			float precio = p.getPrecioDeVenta();
			if (precio >= precioInferior && precio <= precioSuperior) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	/**
	 * Retorna el precio de venta de la primer pizza enviada por parametro.
	 * En caso de no encontrarse retorna 0.
	 * @param nombre
	 * @return
	 */
	public float precioVentaDeLaPrimerPizza(String nombre) {
		float   precio 		= 0;
		int i = 0;
		while (precio == 0 && i < this.pizzas.size()) {
			Pizza p = this.pizzas.get(i);
			if (p.modeloCorrecto(nombre)) {
				precio = p.getPrecioDeVenta();
			}
			i++;
		}
		return precio;
	}


	@Override
	public void mostrar() {
		float precioTotal = 0;
		for (Pizza p: this.pizzas) {
			precioTotal += p.getPrecioDeVenta();
		}
		System.out.printf("Pizzeria: %s \n", this.nombre);
		System.out.printf(MSG_CANTIDADES, this.cantTradicional, this.cantEspecial, this.cantRectangular);
		System.out.printf(MSG_TOTALES, precioTotal);
	}
}
