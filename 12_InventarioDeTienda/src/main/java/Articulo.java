public class Articulo {
    private int codigo;
    private String nombre;
    private double precio;

    public Articulo(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Articulo() {
        this.codigo = 0;
        this.nombre = "";
        this.precio = 0.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String imprimir() {
        return "Código: " + this.getCodigo() + " Nombre: " + this.getNombre() + " Precio: " + this.getPrecio();
    }
}