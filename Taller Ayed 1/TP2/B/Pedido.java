
class Pedido {
    int codigo;
    String cliente;
    int cantidad;

    public Pedido(int codigo, String cliente, int cantidad) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido" +" codigo:" + codigo +" cliente: '" + cliente + "'" +" cantidad: " + cantidad ;
    }
}