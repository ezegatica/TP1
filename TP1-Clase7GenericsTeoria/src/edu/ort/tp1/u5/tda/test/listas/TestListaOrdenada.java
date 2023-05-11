package edu.ort.tp1.u5.tda.test.listas;

import ar.edu.ort.tp1.unidad5.tda.inodos.ListaOrdenadaNodos;

import java.util.Stack;

public class TestListaOrdenada {

    // Declaro las dos listas con las que voy a querer mantener ordenados los
    // empleados.
    private static EmpleadosPorLegajo listaPorLegajo;
    private static EmpleadosPorNombre listaPorNombre;

    public static void main(String[] args) {
        Stack<String> nombres = new Stack<>();
        nombres.add("Carlos");

        // Inicializo ambas clases
        listaPorLegajo = new EmpleadosPorLegajo();
        listaPorNombre = new EmpleadosPorNombre();

        // Agrego los empleados a ambas listas
        agregarEmpleado(5, "Sebastian");
        agregarEmpleado(3, "Mariano");
        agregarEmpleado(7, "Nir");
        agregarEmpleado(1, "Gaby");
        agregarEmpleado(2, "Dany");
        agregarEmpleado(4, "Carlos");
        agregarEmpleado(8, "Sebastian");

        // listo los empleados ordenados de dos formas distintas (por legajo y por nombre)
        listar(listaPorLegajo);
        listar(listaPorNombre);

        // Elimino a uno de los empleados de una de las listas
        System.out.println("Eliminando a Dany de la lista por legajo...");
        Empleado e = listaPorLegajo.removeByKey(new Integer(2));

        // muestro el empleado removido
        System.out.println("Se removio a " + e);

        System.out.println("Sin embargo, el empleado 'sobrevive' en la lista por nombre");
        listar(listaPorLegajo);
        listar(listaPorNombre);

        // lo removemos de la segunda lista y volvemos a mostrar la lista por nombre
        System.out.println("Eliminando a Dany de la lista por nombre...");
        e = listaPorNombre.removeByKey("Dany");

        // muestro el empleado removido
        System.out.println("Se removio a " + e);

        listar(listaPorNombre);
    }

    private static void agregarEmpleado(int legajo, String nombre) {
        System.out.println("Agrego " + legajo + " - " + nombre + " en ambas listas");
        Empleado e = new Empleado(legajo, nombre);
        listaPorLegajo.add(e);
        listaPorNombre.add(e);
    }

    private static void listar(ListaOrdenadaNodos<?, Empleado> lista) {
        System.out.println(String.join(" ", lista.getClass().getSimpleName().split("(?=\\p{Upper})")));
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

}