import java.util.ArrayList;
import java.util.List;

public class Libros {

    private List<Libro> listaLibros;


    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Libros() {
        this.listaLibros = new ArrayList<>();
    }

    public void insertarLibro() {
        System.out.println("Insertar Libro");

    }

    public void buscarLibro() {
        System.out.println("Buscar Libro");
    }




}
