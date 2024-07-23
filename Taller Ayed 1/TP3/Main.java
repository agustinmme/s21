
public class Main {
    public static void main(String[] args) {
        ListaDoble prodLista = new ListaDoble();

        try {
            prodLista.insertar(new Producto(3, "Producto 2323", 545));
            prodLista.insertar(new Producto(1, "Producto 23232", 100));
            prodLista.insertar(new Producto(4, "Producto 232332", 213210));
            prodLista.insertar(new Producto(2, "Producto 1111", 222220));
            prodLista.insertar(new Producto(5, "Producto 32323233", 4440));
            // rEpitod el un producto
            prodLista.insertar(new Producto(3, "Producto 2323", 350));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        prodLista.ListarProductos();
    }
}