
package com.ejemplo.gestortareas;

public class Tarea {
    private int id;
    private String nombre;
    private String descripcion;

    public Tarea(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Tarea ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion;
    }
}
