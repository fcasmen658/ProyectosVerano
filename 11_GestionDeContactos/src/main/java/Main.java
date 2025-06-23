public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarContacto(new Contacto("Pepe", "123", "pepe@hotmail"));
        agenda.agregarContacto(new Contacto("Luis", "456", "luis@hotmail"));
        agenda.agregarContacto(new Contacto("Maria", "789", "maria@hotmail"));
        agenda.agregarContacto(new Contacto("Ana", "101", "ana@hotmail"));
        agenda.agregarContacto(new Contacto("Sofía", "111", "sofia@hotmail"));
        agenda.listarContactos();
        agenda.eliminarContacto(new Contacto("Luis", "456", "luis@hotmail"));
        agenda.listarContactos();
        System.out.println(Contacto.buscarContacto("Sofía"));
    }
}
