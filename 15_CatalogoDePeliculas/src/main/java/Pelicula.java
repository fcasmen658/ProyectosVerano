public class Pelicula {
    private String titulo;
    private String genero;
    private int duracionMinutos;

    public Pelicula(String titulo, String genero, int duracionMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Género: " + genero + ", Duración: " + duracionMinutos + " min";
    }
}
