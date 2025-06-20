package com.indalosoftware;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc(10, 3);
        System.out.println("La suma es: " + calc.sum());
        System.out.println("La resta es: " + calc.res());
        System.out.println("La multiplicación es: " + calc.prod());
        System.out.println("La división es: " + calc.modulo());
        System.out.println("El doble es: " + calc.doble());
        System.out.println("El triple es: " + calc.triple());
        System.out.println("El cuádruple es: " + calc.cuadruple());
        System.out.println("El cubo es: " + calc.cubo());
    }


}
