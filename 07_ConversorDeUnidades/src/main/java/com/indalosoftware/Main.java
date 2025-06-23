package com.indalosoftware;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Conversor de Temperatura");
        System.out.println("----------------------");
        System.out.println("Introduzca el valor que desea convertir: ");
        double valor = Entrada.real();
        System.out.println("----------------------");
        System.out.println( "Temperatura en Fahrenheit: " + (ConversorTemperatura.calcularFahrenheit(valor)));
        System.out.println( "Temperatura en Celsius: " + (ConversorTemperatura.calcularCelsius(valor)));



    }
}
