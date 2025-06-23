public class Agenda {
    private int indice;
    private Contacto[] contactos;

    public Agenda() {
        this.indice = 0;
        this.contactos = new Contacto[100];
    }

    public Agenda(int capacidad) {
        this.indice = 0;
        this.contactos = new Contacto[capacidad];
    }

    public void agregarContacto(Contacto contacto) {
        if (indice >= this.contactos.length) {
            System.out.println("Agenda llena");
        } else {
            this.contactos[indice] = contacto;
            indice++;
        }
    }

    public Contacto buscarContacto(Contacto contacto) {
        for (int j = 0; j < indice; j++) {
            Contacto c = contactos[j];
            if (c.getNombre().equals(contacto.getNombre())) {
                return c;
            }
        }
        return null;
    }

    public void listarContactos() {
        for (int i = 0; i < indice; i++) {
            Contacto c = contactos[i];
            System.out.println("Nombre: " + c.getNombre() + ", Teléfono: " + c.getTelefono());
        }
    }

    private int buscarPorIndice(Contacto contacto) {
        int result = -1;
        for (int j = 0; j < indice; j++) {
            Contacto c = contactos[j];
            if (c.getNombre().equals(contacto.getNombre())) {
                result = j;
                break;
            }
        }
        return result;

    }

    public void eliminarContacto(Contacto contacto) {
        int indiceABorrar = buscarPorIndice(contacto);
        if (indiceABorrar > 0) {
            for (int j = indiceABorrar; j < indice; j++) {
                contactos[j] = contactos[j + 1];
            }
            this.indice--;
        }
    }


}
