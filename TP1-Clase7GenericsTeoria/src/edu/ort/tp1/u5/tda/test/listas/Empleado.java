package edu.ort.tp1.u5.tda.test.listas;

public class Empleado {

    private int legajo;
    private String nombre;

    public Empleado(int legajo, String nombre) {
        this.setLegajo(legajo);
        this.setNombre(nombre);
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
        return "Empleado [legajo=" + legajo + ", nombre=" + nombre + "]";
    }

}
