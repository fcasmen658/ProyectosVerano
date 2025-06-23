import java.util.Scanner;

public class Peliculas {
    private static final int MAX_PELICULAS = 100;
    private static Pelicula[] peliculas = new Pelicula[MAX_PELICULAS];
    private static int contador = 0;



    static void agregarPelicula(Scanner sc) {
        if (contador >= MAX_PELICULAS) {
            System.out.println("Catálogo lleno.");
            return;
        }

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Duración en minutos: ");
        int duracion = sc.nextInt();
        sc.nextLine(); // limpiar

        peliculas[contador++] = new Pelicula(titulo, genero, duracion);
        System.out.println("Película agregada correctamente.");
    }

    static void mostrarPorGenero(Scanner sc) {
        System.out.print("Introduce el género a buscar: ");
        String generoBuscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (peliculas[i].getGenero().equalsIgnoreCase(generoBuscado)) {
                System.out.println(peliculas[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron películas del género \"" + generoBuscado + "\".");
        }
    }

    static void calcularDuracionPromedio() {
        if (contador == 0) {
            System.out.println("No hay películas en el catálogo.");
            return;
        }

        int suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += peliculas[i].getDuracionMinutos();
        }

        double promedio = (double) suma / contador;
        System.out.printf("Duración promedio: %.2f minutos\n", promedio);
    }
}
