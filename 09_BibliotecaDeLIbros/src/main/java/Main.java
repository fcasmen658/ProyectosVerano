import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Libro[] libros = new Libro[] {
            new Libro("Don Quijote", "Miguel de Cervantes", false),
            new Libro("D. Homebrew", "Victor Suarez", true)
    };

    public static Libro buscar(Libro libro) {
        Libro result = null;
        for (Libro l : libros) {
            if (l.getTitulo().equals(libro.getTitulo())) {
                result = l;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Introduce el titulo del libro: ");
        String titulo = new Scanner(System.in).nextLine();
        Libro l = buscar(new Libro(titulo, "", false));
        if (Objects.nonNull(l)) {
            l.prestar();
        }



    }
}
