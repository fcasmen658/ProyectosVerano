/**
 * Ejercicio 3: Control de Estudiantes
 * Enunciado: Crea una clase Estudiante con propiedades para nombre, edad y notaPromedio. Implementa un método que determine si el estudiante ha "Aprobado" (nota promedio >= 7) o "Reprobado". En el método main, crea varios objetos Estudiante y utiliza un bucle for para iterar sobre ellos y mostrar su estado de aprobación.
 */

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, Double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String aprobado() {
        if (notaPromedio < 0 || notaPromedio > 10) {
            return "Nota fuera de rango";
        }
        if (notaPromedio >= 7) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(Double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
}
