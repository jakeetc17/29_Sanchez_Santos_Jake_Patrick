package org.example.view;

import org.example.model.Contacto;

import org.example.controller.AgendaController;

import java.util.Scanner;

public class AgendaView {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(AgendaController controller) {
        int opcion;
        do {
            System.out.println("\n___________________________");
            System.out.println("   AGENDA DE CONTACTOS     ");
            System.out.println("_____________________________");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrar(controller);
                    break;
                case 2:
                    controller.listarContactos();
                    break;
                case 3:
                    buscar(controller);
                    break;
                case 4:
                    eliminar(controller);
                    break;
                case 5:
                    System.out.println("Saliendo de la agenda...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private void registrar(AgendaController controller) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        Contacto c = new Contacto(id, nombres, apellidos, direccion, telefono, correo);
        controller.agregarContacto(c);
        System.out.println("¡Contacto registrado exitosamente!");
    }

    private void buscar(AgendaController controller) {
        System.out.print("Ingrese nombre o apellido a buscar: ");
        String filtro = scanner.nextLine();
        controller.buscarContacto(filtro);
    }

    private void eliminar(AgendaController controller) {
        System.out.print("Ingrese el ID del contacto a eliminar: ");
        int id = scanner.nextInt();
        controller.eliminarContacto(id);
    }
}