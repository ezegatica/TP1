package ar.edu.ort.tp1.unidad5.tda.glistas;

import ar.edu.ort.tp1.unidad5.tda.inodos.ListaOrdenadaNodos;

public class EmpleadosPorApellido extends ListaOrdenadaNodos<String, Empleado> {

    @Override
    public int compare(Empleado dato1, Empleado dato2) {
        return dato1.getApellido().compareTo(dato2.getNombre());
    }

    @Override
    public int compareByKey(String clave, Empleado empleado) {
        return clave.compareTo(empleado.getNombre());
    }
}