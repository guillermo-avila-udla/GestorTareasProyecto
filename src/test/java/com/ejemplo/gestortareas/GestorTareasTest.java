
package com.ejemplo.gestortareas;

import org.junit.Test;
import static org.junit.Assert.*;

public class GestorTareasTest {
    @Test
    public void testAgregarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Prueba", "Descripción de prueba");
        assertEquals(1, gestor.buscarTareaPorId(1).getId());
    }

    @Test
    public void testEliminarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea 1", "Descripción");
        gestor.eliminarTarea(1);
        assertNull(gestor.buscarTareaPorId(1));
    }

    @Test
    public void testListarTareas() {
        GestorTareas gestor = new GestorTareas();
        gestor.listarTareas(); // Método para verificar la salida
    }
}
