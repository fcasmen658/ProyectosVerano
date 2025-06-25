package com.indalosoftware;

public class Programador extends Empleado {
    private static final double PLUS_SALARIO = 1.40;

    public Programador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalarioTotal() {
        return getSalarioBase() + (getSalarioBase() * PLUS_SALARIO);
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + getNombre() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", salarioTotal=" + calcularSalarioTotal() +
                '}';
    }
}
