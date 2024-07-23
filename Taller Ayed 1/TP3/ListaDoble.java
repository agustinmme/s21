
class Nodo {
    Producto info;
    Nodo sig;
    Nodo pre;

    public Nodo(Producto info) {
        this.info = info;
    }
}

class ListaDoble {
    //Como voy a insertar ordenado voy a tener que recorrer la lista para calcular su orden, con el puntero incial me alcanza
    private Nodo inicio;

    public void insertar(Producto prod) throws Exception {
        Nodo nueNodo = new Nodo(prod);
        //Si es el vacia la lista asigno
        if (inicio == null) {
            inicio = nueNodo;
        //Es mas chico que el nodo 1 ?
        } else if (inicio.info.codigo > prod.codigo) {
            //O esta repetido
            if (inicio.info.codigo == prod.codigo) {
                throw new Exception("Error ese codigo ya existe");
            }
            //Actualizo nuevo primer nodo
            //Primero actualizo el actual nuevo que apunte al viejo primero.
            nueNodo.sig = inicio;
            //El viejo que apunte al nuevo como previo
            inicio.pre = nueNodo;
            // Y actualizo el inicio
            inicio = nueNodo;
        } else {
            //Caso contrario recorro la lista hasta el final o hasta encontrar su orden o duplicado
            Nodo actual = inicio;
            while (actual.sig != null && actual.sig.info.codigo < prod.codigo) {
                actual = actual.sig;
            }
            //Cuando termina de recorrer verifico si el producto no esta duplicado
            if (actual.info.codigo == prod.codigo || (actual.sig != null && actual.sig.info.codigo == prod.codigo)) {
                throw new Exception("Error ese codigo ya existe");
            }
            //Entonces agrego
            nueNodo.sig = actual.sig;
            // El previo del siguiente apunta al nuevo nodo si esta en el final
            if (actual.sig != null) {
                actual.sig.pre = nueNodo;
            }
            //El siguiente del actual apunta al nuevo y el previo del nuevo apunta al  actual.
            actual.sig = nueNodo;
            nueNodo.pre = actual;
        }
    }

    public void ListarProductos() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.info);
            System.out.println(actual.pre+ " PREV "+ " SIGUIENTE  "+actual.sig);
            System.out.println();
            actual = actual.sig;
        }
    }
}