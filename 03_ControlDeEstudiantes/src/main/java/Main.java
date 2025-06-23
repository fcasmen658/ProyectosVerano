/**
 * Ejercicio 3: Control de Estudiantes
 * Enunciado: Crea una clase Estudiante con propiedades para nombre, edad y notaPromedio. Implementa un método que determine si el estudiante ha "Aprobado" (nota promedio >= 7) o "Reprobado". En el método main, crea varios objetos Estudiante y utiliza un bucle for para iterar sobre ellos y mostrar su estado de aprobación.
 */


public class Main {

    public static void main(String[] args) {

//        Estudiante estudiante1 = new Estudiante("Pedro", 20, 8.5);
//        Estudiante estudiante2 = new Estudiante("Maria", 19, 6.5);
//        Estudiante estudiante3 = new Estudiante("Luis", 21, 9.5);
//
//        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};
//        for (Estudiante estudiante : estudiantes) {
//            System.out.println("Nombre: " + estudiante.getNombre() + " - Edad: " + estudiante.getEdad() + " -
//            Nota " + "Promedio: " + estudiante.getNotaPromedio());
//
//        }
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Pepe", -2, 8.5),
                new Estudiante("Maria", 19, 6.5),
                new Estudiante("Luis", 21, 9.5)
        };
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.aprobado());
        }





    }
}
