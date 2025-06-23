public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private static Contacto[] contactos;
    private static int numContactos;

    public Contacto() {}

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public static Contacto buscarContacto(String nombre) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                return contactos[i];
            }
        }
        return null;
    }

    public static boolean eliminarContacto(String nombre) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                for (int j = i; j < numContactos - 1; j++) {
                    contactos[j] = contactos[j + 1];
                }
                contactos[numContactos - 1] = null;
                numContactos--;
                return true;
            }
        }
        return false;
    }

    public static void listarContactos() {
        for (int i = 0; i < numContactos; i++) {
            System.out.println("Nombre: " + contactos[i].getNombre() +
                    ", Teléfono: " + contactos[i].getTelefono() +
                    ", Email: " + contactos[i].getEmail());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
