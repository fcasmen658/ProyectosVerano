import java.util.ArrayList;
import java.util.List;

public class Alumnos {

    private List<Alumno> listaAlumnos;

    public Alumnos() {
        this.listaAlumnos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo alumno a la lista
     */
    public void agregarAlumno(Alumno alumno) {
        if (alumno != null) {
            listaAlumnos.add(alumno);
        }
    }

    /**
     * Calcula y muestra el promedio de cada alumno
     */
    public void mostrarPromedios() {
        System.out.println("\n--- Promedios de Alumnos ---");
        for (Alumno alumno : listaAlumnos) {
            System.out.printf("%s - Promedio: %.2f%n",
                alumno.getNombre(),
                alumno.calcularPromedio());
        }
    }

    /**
     * Busca un alumno por su DNI
     * @param dni DNI a buscar
     * @return el alumno si se encuentra, null en caso contrario
     */
    public Alumno buscarPorDni(String dni) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }

    /**
     * Muestra la información de un alumno buscado por DNI
     * @param dni DNI del alumno a buscar
     */
    public void mostrarAlumnoPorDni(String dni) {
        Alumno alumno = buscarPorDni(dni);
        if (alumno != null) {
            System.out.println("\n--- Alumno encontrado ---");
            System.out.println(alumno);
        } else {
            System.out.println("\nNo se encontró ningún alumno con DNI: " + dni);
        }
    }
}
