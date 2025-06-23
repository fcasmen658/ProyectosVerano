/**
 * Ejercicio 6: Gestión de Tareas Pendientes.
 * Enunciado: Crea una clase Tarea con propiedades descripción y completada (un booleano). Agrega un método para
 * marcarComoCompletada(). En el main, crea una lista de objetos Tarea. Utiliza un bucle while para permitir al
 * usuario marcar tareas como completadas hasta que decida salir. Muestra el estado de todas las tareas después de
 * cada interacción.
 */

package com.indalosoftware;

public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
