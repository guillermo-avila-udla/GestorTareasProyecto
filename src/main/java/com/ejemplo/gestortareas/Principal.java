
package com.ejemplo.gestortareas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú del Gestor de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Buscar tarea por ID");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(nombre, descripcion);
                    break;
                case 2:
                    System.out.print("ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestor.eliminarTarea(idEliminar);
                    break;
                case 3:
                    gestor.listarTareas();
                    break;
                case 4:
                    System.out.print("ID de la tarea a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Tarea tarea = gestor.buscarTareaPorId(idBuscar);
                    if (tarea != null) {
                        System.out.println("Tarea encontrada: " + tarea);
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
