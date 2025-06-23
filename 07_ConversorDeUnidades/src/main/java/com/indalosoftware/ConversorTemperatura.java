package com.indalosoftware;

import org.iesalandalus.programacion.utilidades.Entrada;

public class ConversorTemperatura {

    private double valor;


    public ConversorTemperatura(double valor) {
        this.valor = valor;
    }

    static double calcularCelsius(double valor) {
        return (valor - 32) * 5 / 9;
    }

    static double calcularFahrenheit(double valor) {
        return (valor * 9 / 5) + 32;
    }

}
