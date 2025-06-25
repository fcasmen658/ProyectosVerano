package com.indalosoftware;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(10, 5);
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(10, 5);

        System.out.println("El área del rectángulo es: " + rectangulo.area());
        System.out.println("El área del circulo es: " + circulo.area());
        System.out.println("El área del triángulo es: " + triangulo.area());

    }
}
