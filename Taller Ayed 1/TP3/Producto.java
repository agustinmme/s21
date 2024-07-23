
//Reutilizo la clase del tp 2 cambiando atributos.
class Producto {
    int codigo;
    String desc;
    int precio;

    public Producto(int codigo, String desc, int precio) {
        this.codigo = codigo;
        this.desc = desc;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto" +" codigo:" + codigo +" descripcion: '" + desc + "'" +" precio: " + precio ;
    }
}