public class Libro {

    private String titulo;
    private String autor;
    private String anio;
    private Libros[] libros = new Libros[30];


    public Libro(String titulo, String autor, String anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }


    private boolean prestado;

    @Override
    public String toString() {
        return "LIbro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio='" + anio + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
