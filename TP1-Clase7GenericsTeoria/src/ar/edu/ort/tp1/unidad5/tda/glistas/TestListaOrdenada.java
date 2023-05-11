package ar.edu.ort.tp1.unidad5.tda.glistas;

import ar.edu.ort.tp1.unidad5.tda.inodos.ListaOrdenadaNodos;

public class TestListaOrdenada {

    // Declaro las dos listas con las que voy a querer mantener ordenados los
    // empleados.
    private static EmpleadosPorLegajo listaPorLegajo;
    private static EmpleadosPorNombre listaPorNombre;
    private static EmpleadosPorApellido listaPorApellido;

    public static void main(String[] args) {
        // Inicializo ambas clases
        listaPorLegajo = new EmpleadosPorLegajo();
        listaPorNombre = new EmpleadosPorNombre();
        listaPorApellido = new EmpleadosPorApellido();

        // Agrego los empleados a ambas listas
        agregarEmpleado(5, "Sebastian", "Rivera");
        agregarEmpleado(3, "Mariano", "Perez");
        agregarEmpleado(7, "Nir", "Wanraich");
        agregarEmpleado(1, "Gaby", "Rosales");
        agregarEmpleado(2, "Dany", "Torres");
        agregarEmpleado(4, "Carlos", "Garcia");
        agregarEmpleado(8, "Sebastian", "Tevez");

        // listo los empleados ordenados de dos formas distintas (por legajo y por nombre)
        listar(listaPorLegajo);
        listar(listaPorNombre);
        listar(listaPorApellido);

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

    private static void agregarEmpleado(int legajo, String nombre, String apellido) {
        System.out.println("Agrego " + legajo + " - " + nombre + " en ambas listas");
        Empleado e = new Empleado(legajo, nombre, apellido);
        listaPorLegajo.add(e);
        listaPorNombre.add(e);
        listaPorApellido.add(e);
    }

    private static void listar(ListaOrdenadaNodos<?, Empleado> lista) {
        System.out.println(String.join(" ", lista.getClass().getSimpleName().split("(?=\\p{Upper})")));
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}