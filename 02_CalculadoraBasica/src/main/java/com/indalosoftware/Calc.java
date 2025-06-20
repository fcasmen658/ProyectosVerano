package com.indalosoftware;

public class Calc {

    private int num1;
    private int num2;
    private int resultado;
    private int resultado1;
    private int resultado2;


    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        this.resultado = num1 + num2;
        return this.resultado;
    }

    public int res() {
        this.resultado = num1 - num2;
        return this.resultado;
    }

    public int prod() {
        this.resultado = num1 * num2;
        return this.resultado;
    }

    public int modulo() {
        this.resultado1 = num1 / num2;
        this.resultado2 = num1 % num2;
        System.out.println("El resto de la división es: " + this.resultado2);
        return this.resultado1;
    }

    public int doble() {
        this.resultado = num1 * 2;
        return this.resultado;
    }

    public int triple() {
        this.resultado = num1 * 3;
        return this.resultado;
    }

    public int cuadruple() {
        this.resultado = num1 * 4;
        return this.resultado;
    }

    public int cubo() {
        this.resultado = num1 * num1 * num1;
        return this.resultado;
    }
}
