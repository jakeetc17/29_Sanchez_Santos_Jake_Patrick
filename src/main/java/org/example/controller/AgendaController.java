package org.example.controller;

import org.example.model.Contacto;
import java.util.ArrayList;

public class AgendaController {
    private ArrayList<Contacto> listaContactos = new ArrayList<>();

    public void agregarContacto(Contacto c) {
        listaContactos.add(c);
    }

    public void listarContactos() {
        System.out.println("\n--- LISTA DE CONTACTOS ---");
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (Contacto c : listaContactos) {
                System.out.println("ID: " + c.getId() + " | " + c.getNombres() + " " + c.getApellidos() + " | " + c.getTelefono() + " | " + c.getCorreo());
            }
        }
    }

    public void buscarContacto(String filtro) {
        System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
        boolean encontrado = false;
        for (Contacto c : listaContactos) {
            if (c.getNombres().toLowerCase().contains(filtro.toLowerCase()) ||
                    c.getApellidos().toLowerCase().contains(filtro.toLowerCase())) {
                System.out.println("Encontrado -> " + c.getNombres() + " " + c.getApellidos() + " | Tel: " + c.getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese nombre o apellido.");
        }
    }

    public void eliminarContacto(int id) {
        boolean eliminado = false;
        for (int i = 0; i < listaContactos.size(); i++) {
            if (listaContactos.get(i).getId() == id) {
                listaContactos.remove(i);
                System.out.println("Contacto eliminado correctamente.");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No existe un contacto con el ID ingresado.");
        }
    }
}