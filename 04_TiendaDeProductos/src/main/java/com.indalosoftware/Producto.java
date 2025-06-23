/**
 * Ejercicio 4: Tienda de Productos
 * Enunciado:
 * Define una clase Producto con propiedades nombre, precio y cantidadEnStock.
 * Agrega un método para vender una cierta cantidad de productos (resta la cantidad del stock) y otro para reponer el stock.
 * Asegúrate de que no se pueda vender más productos de los que hay en stock usando una estructura condicional.
 * En el main, simula algunas ventas y reposiciones.
 */
package com.indalosoftware;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        }
        if (nombre == null) {
            System.out.println("El nombre no puede ser null");
            return;
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock <= 0) {
            System.out.println("La cantidad en stock no puede ser negativa");
            return;
        }
        this.cantidadEnStock = cantidadEnStock;
    }

    public void vender(int cantidad) {
        if (cantidad > cantidadEnStock) {
            System.out.println("No hay suficiente stock");
            return;
        }
        cantidadEnStock -= cantidad;
    }

    public void comprar(int cantidad) {
        cantidadEnStock += cantidad;
    }



}
