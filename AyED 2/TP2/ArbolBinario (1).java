//*********************************************************
//* Archivo: ArbolBinario.java
//Nombre: 
//Legajo: 
//DNI: 
import java.io.*;

// Definición de la clase NodoBinario
class NodoBinario {
    int dato;
    NodoBinario Hizq, Hder;

    // Constructor
    NodoBinario(int Elem) {
        // Dato a almacenar
        dato = Elem;
        // Inicialización de hijos
        Hizq = null;
        Hder = null;
    }
}

// Definición de la clase Arbol
class Arbol {
    NodoBinario Padre;
    public NodoBinario Raiz;

    // Constructor
    public Arbol() {
        Raiz = null;
    }
    
    //Se codificaron 2 métodos y en caso de que el nodo padre de referencia sea nulo se asume que es la raíz
    // Inserción de un hijo izquierdo
    
    public NodoBinario InsertaNodoHIzq(NodoBinario Nodo, int Elem) {
        NodoBinario result = null;
        Integer Elemento = new Integer(Elem);
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(Elem);
            result = NodoAux;
            Raiz = NodoAux;
        } else {
            if (Nodo.Hizq == null) {
                NodoBinario NodoAux = new NodoBinario(Elem);
                Nodo.Hizq = NodoAux;
                result = NodoAux;
            } else {
                System.out.print("ERR- Hijo izquierdo de " + Elemento.toString() + " no es nulo");
            }
        }
        return result;
    }

    // Inserción de un hijo derecho
    public NodoBinario InsertaNodoHDer(NodoBinario Nodo, int Elem) {
        NodoBinario result = null;
        Integer Elemento = new Integer(Elem);
        if (Nodo == null) {
            NodoBinario NodoAux = new NodoBinario(Elem);
            result = NodoAux;
            Raiz = NodoAux;
        } else {
            if (Nodo.Hder == null) {
                NodoBinario NodoAux = new NodoBinario(Elem);
                Nodo.Hder = NodoAux;
                result = NodoAux;
            } else {
                System.out.print("ERR- Hijo Derecho de " + Elemento.toString() + " no es nulo");
            }
        }
        return result;
    }

    // Inorden Recursivo del arbol
    // La idea es buscar el nodo mas a izq y luego imprimir a medida que avanzo a los nodos derechos y una condicion de corte al finalizar
    public void Inorden(NodoBinario Nodo) {
        if (Nodo != null) {
            Inorden(Nodo.Hizq);
            System.out.print(Nodo.dato + " "); 
            Inorden(Nodo.Hder);
        }
    }

    // Altura del arbol
    // En este caso busca el subarbol mas grande, en este caso rompo el loop al llegar al nodo hoja o null
    public int Altura(NodoBinario Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            int AlturaIzq = Altura(Nodo.Hizq);
            int AlturaDer = Altura(Nodo.Hder);
            return Math.max(AlturaIzq, AlturaDer) + 1;
        }
    }
}

// Clase principal ArbolBinario
class ArbolBinario {
    public static void main(String[] ar) {
        Arbol A = new Arbol();
        System.out.print("Agregando la raiz 30 \n");
        NodoBinario NodoAux = null, NodoAux2 = null, NodoAux3 = null, NodoAux4 = null;
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 30);
        NodoAux = NodoAux2;
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 25);
        NodoAux3 = A.InsertaNodoHDer(NodoAux, 45);
        NodoAux = NodoAux2;
        NodoAux2 = A.InsertaNodoHIzq(NodoAux, 20);
        NodoAux4 = A.InsertaNodoHDer(NodoAux, 27);

        System.out.print("\nEl árbol binario en In orden es: \n");
        A.Inorden(A.Raiz);

        Integer Altura = new Integer(A.Altura(A.Raiz));
        System.out.print("\nLa altura del árbol es: " + Altura.toString() + "\n");
    }
}
