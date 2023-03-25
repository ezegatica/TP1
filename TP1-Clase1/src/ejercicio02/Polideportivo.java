package ejercicio02;

public class Polideportivo implements Edificio, InstalacionDeportiva {
	private double ancho;
	private double profundidad;
    private String nombre;

    public Polideportivo(double ancho, double profundidad, String nombre) {
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.nombre = nombre;
    }

	@Override
	public int getTipoDeInstalacion() {
		return TiposDeInstalacion.POLIDEPORTIVO.valor;
	}

	@Override
	public double getSuperficieEdificio() {
        return ancho * profundidad;
	}
	
	public String getNombre() {
        return this.nombre;
    }
}
