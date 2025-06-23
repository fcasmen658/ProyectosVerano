public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Alumnos para manejar la lista de alumnos
        Alumnos gestionAlumnos = new Alumnos();

        // Agregar algunos alumnos de ejemplo
        gestionAlumnos.agregarAlumno(new Alumno("Juan Pérez", "12345678", new double[]{8.5, 7.8, 9.0}));
        gestionAlumnos.agregarAlumno(new Alumno("María García", "87654321", new double[]{6.5, 7.0, 6.0}));
        gestionAlumnos.agregarAlumno(new Alumno("Carlos López", "11223344", new double[]{9.0, 9.5, 9.8}));

        // 1. Mostrar promedios de todos los alumnos
        System.out.println("=== PROMEDIOS DE ALUMNOS ===");
        gestionAlumnos.mostrarPromedios();

        // 2. Mostrar alumnos con promedio mayor a 7
        System.out.println("\n=== ALUMNOS DESTACADOS (promedio > 7) ===");
        //gestionAlumnos.mostrarAlumnosDestacados();

        // 3. Buscar alumno por DNI
        System.out.println("\n=== BÚSQUEDA POR DNI ===");
        String dniABuscar = "87654321";
        System.out.println("Buscando alumno con DNI: " + dniABuscar);
        gestionAlumnos.mostrarAlumnoPorDni(dniABuscar);

        // Búsqueda de un DNI que no existe
        System.out.println("\nBuscando alumno con DNI: 99999999");
        gestionAlumnos.mostrarAlumnoPorDni("99999999");
    }
}
