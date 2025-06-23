/**
 * Ejercicio 5: Cuenta Bancaria Simple
 * Enunciado: Crea una clase CuentaBancaria con propiedades para numeroCuenta, titular y saldo. Implementa métodos
 * para depositar y retirar dinero. El método retirar debe verificar que hay suficiente saldo antes de realizar la
 * operación. En el main, realiza depósitos y retiros y muestra el saldo después de cada operación.
 * */

package com.indalosoftware;

public class CuentaBancaria {

    private int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Cantidad no válida.");
            return;
        }
        if (cantidad < saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
