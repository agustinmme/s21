class Pila {
  class Nodo {
    int info;
    Nodo sig;
  }
  private Nodo raiz;
  public Pila() {
    raiz = null;
  }
  public void apilar(int x) {
    Nodo nuevo;
    nuevo = new Nodo();
    nuevo.info = x;
    if (raiz == null) {
      nuevo.sig = null;
      raiz = nuevo;
    } else {
      nuevo.sig = raiz;
      raiz = nuevo;
    }
  }
  //
  public int desapilar() {
    //Si estoy en el final retorno vacio
    if (raiz == null) {
    System.out.println("La pila esta vacia");
      return -1;
    }
    //Caso contrario retorno el valor y actualizo
    //Piso la refencia y paso el resultado, lo unico que no libero la memoria calculo que garbage collector lo elimina
      int aux = raiz.info;
      raiz = raiz.sig;
      return aux;
  }

  public void vercontenido() {
    //La copio para recorrerla y no modificar la pila
    Nodo aux = raiz;
    System.out.println("Contenido de la pila:");
    //Recorro la lista hasta el final consologeando
    while (aux != null) {
      System.out.println(aux.info);
      aux = aux.sig;
    }
  }

  public static void main(String[] ar) {
    Pila pila1 = new Pila();
    pila1.apilar(10);
    pila1.apilar(40);
    pila1.apilar(3);
    pila1.vercontenido();
    System.out.println("Cima de la pila:" + pila1.desapilar());
    pila1.vercontenido();
    pila1.desapilar();
    pila1.desapilar();
    pila1.desapilar();
    pila1.desapilar();
  }
}
