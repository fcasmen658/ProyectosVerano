import java.util.Arrays;
import java.util.Objects;

public class Alumno {

    private String nombre;
    private String dni;
    private double[] notas = new double[3];

    public Alumno(String nombre, String dni, double[] notas) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public Object calcularPromedio() {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
        }
        return promedio / notas.length;
    }
}
