package com.indalosoftware;
/**
 * Ejercicio 1: Gestión Simple de Empleados
 * Enunciado: Crea una clase Empleado con propiedades para nombre, salario y idEmpleado. Implementa un método para
 * mostrar la información del empleado. Luego, en el método main, crea un objeto Empleado, asígnale valores y muestra
 * su información. Utiliza una estructura condicional para verificar si el salario es mayor a 2000 y, si lo es, aplica
 * un bono del 10%.
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Gestion Simple de Empleados");
        Empleado empleado = new Empleado(1, "Juan", 1500);
        Empleado empleado2 = new Empleado(2, "Pedro", 6000);
        Empleado empleado3 = new Empleado(3, "Luis", 7000);

        for (Empleado e : new Empleado[]{empleado, empleado2, empleado3}) {
            if (e.getSalario() > 2000.0) {
                e.setSalario((float) (e.getSalario() * 1.1));
            }
            System.out.println("El empleado (" + e.getIdEmpleado() + ") - " + e.getNombre() + " tiene un salario de " + e.getSalario() + " " + "€.");
        }

        }

}

//todo: preguntar por double y por toString