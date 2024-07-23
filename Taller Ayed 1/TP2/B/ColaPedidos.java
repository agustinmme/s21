
class ColaPedidos {
    class Nodo {
        Pedido info;
        Nodo sig;
    }
    
    private Nodo frente;
    private Nodo fondo;
    
    public ColaPedidos() {
        frente = null; // uso frente para desencolar
        fondo = null; // uso fondo para encolar
    }
    
    public void encolar(Pedido x) {
        //Cargo datos del nuevo nodo y verifico que no sea el primero
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = null;
        if (fondo == null) {
            frente = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }
    
    public Pedido desencolar() {
        //Chequeo que no este vacia y actualizo punteros
        if (frente == null) {
            System.out.println("La cola está vacía");
            return null;
        }
        Pedido aux = frente.info;
        frente = frente.sig;
        if (frente == null) {
            fondo = null;
        }
        return aux;
    }
    
    public void verContenido() {
        //Verifico si no esta vacia.
        Nodo aux = frente;
        if(aux == null){
           System.out.println("La cola esta vacia");
           return;
        }
        //Me paro en la primera pos y recorro hasta el final
        System.out.println("Contenido de la cola:");
        while (aux != null) {
            System.out.println(aux.info);
            aux = aux.sig;
        }
    }
    
    public static void main(String[] ar) {
        ColaPedidos colaPedidos = new ColaPedidos();

        Pedido pedido1 = new Pedido(1, "Cliente Carlos", 100);
        Pedido pedido2 = new Pedido(2, "Cliente Agustin", 200);
        Pedido pedido3 = new Pedido(3, "Cliente Carvin", 150);
        Pedido pedido4 = new Pedido(4, "Cliente Diego", 300);
        Pedido pedido5 = new Pedido(5, "Cliente Estevan", 250);

        colaPedidos.encolar(pedido1);
        colaPedidos.encolar(pedido2);
        colaPedidos.encolar(pedido3);
        colaPedidos.encolar(pedido4);
        colaPedidos.encolar(pedido5);

        colaPedidos.verContenido();

        System.out.println("Resultado final");
        Pedido procesado;
        while ((procesado = colaPedidos.desencolar()) != null) {
            System.out.println("Procesado: " + procesado);
        }

        colaPedidos.verContenido();
    }
}
