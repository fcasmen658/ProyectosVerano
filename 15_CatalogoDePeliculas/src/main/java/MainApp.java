import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nCATÁLOGO DE PELÍCULAS");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar películas por género");
            System.out.println("3. Calcular duración promedio");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1 -> Peliculas.agregarPelicula(sc);
                case 2 -> Peliculas.mostrarPorGenero(sc);
                case 3 -> Peliculas.calcularDuracionPromedio();
                case 4 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
