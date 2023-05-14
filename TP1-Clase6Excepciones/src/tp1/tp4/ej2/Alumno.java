package tp1.tp4.ej2;

import tp1.tp4.tj3.RangoDeEnteros;

public class Alumno extends Persona {
    public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
    private int numeroLegajo;

    public Alumno(int DNI, String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
        super(nombreCompleto, anioNacimiento, anioFallecimiento);
        this.setNumeroLegajo(DNI);
    }
    
    public Alumno(int DNI, String nombreCompleto, int anioNacimiento) {
        super(nombreCompleto, anioNacimiento);
        this.setNumeroLegajo(DNI);
    }

    public void setNumeroLegajo(int numeroLegajo) {
        if (numeroLegajo < RANGO_NRO_DOCUMENTO.getLimiteInferior()) {
            throw new IllegalArgumentException("el numero de lejago no puede ser menor al limite inferior permitido");
        }
        if (numeroLegajo > RANGO_NRO_DOCUMENTO.getLimiteSuperior()) {
            throw new IllegalArgumentException("el numero de lejago no puede ser superior al limite inferior permitido");
        }
        this.numeroLegajo = numeroLegajo;
    }
    
    public int getNumeroLegajo() {
    	return this.numeroLegajo;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + "numeroLegajo: " + numeroLegajo + '}';
    }
}