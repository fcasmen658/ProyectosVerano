package com.indalosoftware;

public class Main {
    public static void main(String[] args) {

        Tarea[] tareas = new Tarea[3];
        tareas[0] = new Tarea("Tarea 1", false);
        tareas[1] = new Tarea("Tarea 2", false);
        tareas[2] = new Tarea("Tarea 3", false);
        }

        public static Tarea buscar(Tarea tarea) {
            for (Tarea t : tareas) {
                if (t.getDescripcion().equals(tarea.getDescripcion())) {
                    return t;
                }
            }
            return null;
        }



    }



}
