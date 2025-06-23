package com.indalosoftware;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[] {
            new Producto("Producto 1", 10.0, 5),
            new Producto("Producto 2", 20.0, 10),
            new Producto("Producto 3", 30.0, 15)
        };

        productos[0].vender(3);
        productos[1].comprar(2);
        productos[0].vender(6);

    }
}
