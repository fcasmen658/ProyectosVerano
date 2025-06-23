package com.indalosoftware;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(1, "Juan", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria(2, "Pedro", 2000.0);

        System.out.println("Saldo de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());

        System.out.println("\nDeposito 500 en la cuenta 1: ");
        cuenta1.depositar(500.0);

        System.out.println("Retiro 1000 de la cuenta 2: ");
        cuenta2.retirar(1000.0);

        System.out.println("\nSaldo de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());

    }
}
