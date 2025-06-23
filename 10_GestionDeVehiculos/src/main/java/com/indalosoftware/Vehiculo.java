/**
 * Ejercicio 10: Gestión de Vehículos (Concesionario)
 * Enunciado: Diseña una clase Vehiculo con propiedades marca, modelo y anioFabricacion. Agrega un método para
 * mostrarDetalles() del vehículo. En el main, crea una lista de al menos 5 objetos Vehiculo. Luego, utiliza un bucle
 * for-each para recorrer la lista y mostrar los detalles de cada vehículo. Añade una estructura condicional para
 * identificar y mostrar solo los vehículos fabricados después de 2020.
 */


package com.indalosoftware;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String mostrarDetalles() {
        return  "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año de Fabricación: " + anioFabricacion + "\n" +
                "---";
    }


}
