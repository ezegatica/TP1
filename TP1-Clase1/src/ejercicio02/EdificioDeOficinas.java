package ejercicio02;

public class EdificioDeOficinas implements Edificio {
	 private int numOficinas;
	 private double ancho;
	 private double profundidad;

	    public EdificioDeOficinas(double ancho, double profundidad, int numOficinas) {
	        this.numOficinas = numOficinas;
	        this.ancho = ancho;
	        this.profundidad = profundidad;
	    }

	    @Override
	    public double getSuperficieEdificio() {
	        return ancho * profundidad;
	    }

	    public int getNumOficinas() {
	        return this.numOficinas;
	    }

}
