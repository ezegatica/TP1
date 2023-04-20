package par1.cerveceria.entidades;

import java.util.ArrayList;

public class Refrigerador<T extends Contenedor> {
	private ArrayList<T> elementos;

	public Refrigerador() {
		elementos = new ArrayList<>();
	}
	
	public void add(T elemento) {
		elementos.add(elemento);
	}

	public T buscar(Sabor sabor) {
		T aux = null;
		int pos = 0;
		while (pos < elementos.size() && aux == null) {
			if (elementos.get(pos).getSabor() == sabor) {
				aux = elementos.get(pos);
			} else {
				pos++;
			}
		}
		return aux;
	}

	public void remove(T elemento) {
		elementos.remove(elemento);
	}

	public ArrayList<T> getLista() {
		return elementos;
	}

}