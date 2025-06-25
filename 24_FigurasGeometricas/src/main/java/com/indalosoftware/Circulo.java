package com.indalosoftware;

public class Circulo extends Figura {

    private double radio;
    private static final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return (this.radio * this.radio) * PI;
    }

}
