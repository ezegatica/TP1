package ar.edu.ort.tp1.unidad5.tda.glistas;

public class Empleado {

    private int legajo;
    private String nombre;
    private String apellido;

    public Empleado(int legajo, String nombre, String apellido) {
        this.setLegajo(legajo);
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    private void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getApellido() {
        return apellido;
    }
}
