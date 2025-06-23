public class Inventario {

    private static final int CAPACIDAD = 50;
    private Articulo[] articulos;
    private int indice;
    //private Articulo[] articulos = new Articulo[CAPACIDAD];

    public Inventario() {
        this.articulos = new Articulo[CAPACIDAD];
        this.indice = 0;
    }

    public void insertarArticulo(Articulo articulo){
        if(indice < CAPACIDAD){
            articulos[indice] = articulo;
            indice++;
        } else {
            System.out.println("El inventario está lleno");
        }
    }

    public Articulo buscarPorCodigo(int codigo){
        for(int i = 0; i < indice; i++){
            if(articulos[i].getCodigo() == codigo){
                return articulos[i];
            }
        }
        return null;
    }

    public double calcularPrecioInventario(){
        double total = 0;
        for(int i = 0; i < indice; i++){
            total += articulos[i].getPrecio();
        }
        return total;
    }

    public void listarArticulos(){
        for(int i = 0; i < indice; i++){
            System.out.println(articulos[i].imprimir());;
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Articulo articulo1 = new Articulo(1, "Patatas", 400.0);
        inventario.insertarArticulo(articulo1);

        Articulo articulo2 = new Articulo(2, "Chocolate", 1000.0);
        inventario.insertarArticulo(articulo2);

        Articulo articulo3 = new Articulo(3, "Cerveza", 0.35);
        inventario.insertarArticulo(articulo3);

        Articulo articulo4 = inventario.buscarPorCodigo(2);

        if (articulo2.getCodigo() == articulo4.getCodigo()) {
            System.out.println("Los codigos son iguales");

        System.out.println(inventario.buscarPorCodigo(1).imprimir());
        System.out.println(inventario.calcularPrecioInventario());
        }

        inventario.listarArticulos();

    }


}
