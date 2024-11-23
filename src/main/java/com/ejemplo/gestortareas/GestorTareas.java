
package com.ejemplo.gestortareas;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;
    private int contadorId;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
        this.contadorId = 1;
    }

    public void agregarTarea(String nombre, String descripcion) {
        Tarea nuevaTarea = new Tarea(contadorId++, nombre, descripcion);
        tareas.add(nuevaTarea);
        System.out.println("Tarea añadida: " + nuevaTarea);
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(tarea -> tarea.getId() == id);
        System.out.println("Tarea con ID " + id + " eliminada.");
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }

    public Tarea buscarTareaPorId(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                return tarea;
            }
        }
        return null;
    }
}
