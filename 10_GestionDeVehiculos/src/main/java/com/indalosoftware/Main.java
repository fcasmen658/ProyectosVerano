package com.indalosoftware;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = new Vehiculo("Toyota", "Corolla", 2021);
        vehiculos[1] = new Vehiculo("Honda", "Civic", 2022);
        vehiculos[2] = new Vehiculo("Ford", "Ka", 2020);
        vehiculos[3] = new Vehiculo("Dacia", "Sandero", 2010);
        vehiculos[4] = new Vehiculo("Tesla", "Model 3", 2023);

        System.out.println("Listado de todos los Vehículos");
        System.out.println("--------------------");

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println(vehiculo.mostrarDetalles());
        }

        System.out.println("\nListado de Vehículos fabricados después de 2020");
        System.out.println("--------------------");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAnioFabricacion() > 2020) {
                System.out.println(vehiculo.mostrarDetalles());
            }
        }


    }

}
