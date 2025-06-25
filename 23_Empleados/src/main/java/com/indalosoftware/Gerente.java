package com.indalosoftware;

public class Gerente extends Empleado {
    private static final double PLUS_SALARIO = 1.40;

    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double calcularSalarioTotal() {
        return getSalarioBase() + (getSalarioBase() * PLUS_SALARIO);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", salarioTotal=" + calcularSalarioTotal() +
                '}';
    }
}
