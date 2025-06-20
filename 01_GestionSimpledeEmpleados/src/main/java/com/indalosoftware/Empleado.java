package com.indalosoftware;

public class Empleado {
    /**
     * Identificador único del empleado.
     * Representa un número entero que debe estar en el rango de 1 a 1000, ambos inclusive.
     * Se utiliza para asignar un valor distintivo a cada empleado dentro de una organización.
     */

    private int idEmpleado;
    /**
     * Representa el nombre del empleado.
     * Esta variable almacena el nombre asignado al empleado y no puede
     * ser nulo ni estar vacío.
     */
    private String nombre;
    /**
     * Representa el salario de un empleado.
     * Almacena el valor del salario del empleado. Este valor debe ser mayor a 1000.
     * El salario es utilizado para realizar diversos cálculos relacionados al empleado,
     * como la asignación de bonos y la verificación de condiciones salariales.
     */
    private float salario;

    /**
     * Constructor de la clase Empleado.
     *
     * @param idEmpleado Identificador único del empleado. Debe ser un entero entre 1 y 1000.
     * @param nombre Nombre del empleado.
     * @param salario Salario del empleado. Debe ser mayor a 1000.
     */
    public Empleado(int idEmpleado, String nombre, float salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el identificador único del empleado.
     * El identificador debe estar en el rango de 1 a 1000, ambos inclusive.
     *
     * @param idEmpleado Identificador único del empleado. Debe ser un entero entre 1 y 1000.
     * @throws IllegalArgumentException si el idEmpleado está fuera del rango permitido.
     */
    public void setIdEmpleado(int idEmpleado) {
        if (idEmpleado <= 0 || idEmpleado > 1000) {
            throw new IllegalArgumentException("El rango de idEmpleado es de 1 a 1000, idEmpleado: " + idEmpleado +
                    ".");
        }
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre Nombre del empleado. No puede ser nulo ni estar vacío.
     * @throws IllegalArgumentException si el nombre es nulo o está vacío.
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null o vació.");
        }
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * El salario debe ser mayor a 1000.
     *
     * @param salario Salario del empleado. Debe ser un valor flotante mayor a 1000.
     * @throws IllegalArgumentException si el salario es menor o igual a 1000.
     */
    public void setSalario(float salario) {
        if (salario <= 1000) {
            throw new IllegalArgumentException("El salario debe ser mayor a 1000, so miserias.");
        }
        this.salario = salario;
    }

    /**
     * Retorna una representación en cadena de la instancia, que incluye todos sus campos.
     *
     * @return La representación en cadena de la instancia.
     */
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
