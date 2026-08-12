package org.example.app;
import org.example.model.Contacto;
import org.example.controller.AgendaController;
import org.example.view.AgendaView;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();

        controller.agregarContacto(new Contacto(
                1,
                "Ana",
                "Gomez",
                "Lima",
                "911111111",
                "ana@gmail.com"));
        controller.agregarContacto(new Contacto(
                2,
                "Carlos",
                "Perez",
                "Chincha",
                "922222222",
                "carlos@gmail.com"));
        controller.agregarContacto(new Contacto(
                3,
                "Maria",
                "Lopez",
                "Pisco",
                "933333333",
                "maria@gmail.com"));
        controller.agregarContacto(new Contacto(
                4,
                "Jose",
                "Sanchez",
                "Ica",
                "962365185",
                "patrick@gmail.com"));
        controller.agregarContacto(new Contacto(
                5,
                "Jake",
                "Santos",
                "Chincha",
                "9523146654",
                "patrick.jake@gmail.com"));

        view.mostrarMenu(controller);
    }
}