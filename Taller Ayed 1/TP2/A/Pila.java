
import java.util.Scanner;
class Pila {
  private int[] pila;
  private int raiz;

  public Pila(int capacidad) {
    pila = new int[capacidad];
    raiz = -1;
  }

  public void apilar(int x) {
    //Controlo que no este llena agrego y subo raiz
    if (raiz < pila.length - 1) {
      pila[++raiz] = x;
    } else {
      System.out.println("La pila está llena");
    }
  }

  public int desapilar() {
    //Si estoy en el final retorno vacio
    if (raiz == -1) {
      System.out.println("La pila está vacía");
      return -1;
    }
    //retorno y bajo raiz
    return pila[raiz--];
  }

  public void vercontenido() {
    //Si estoy en el final retorno vacio
    if (raiz == -1) {
      System.out.println("La pila está vacía");
      return;
    }
    //Recorro la lista hasta el final consologeando
    System.out.println("Contenido de la pila:");
    for (int i = raiz; i >= 0; i--) {
      System.out.println(pila[i]);
    }
  }

public static void main(String[] ar) {
    Scanner scanner = new Scanner(System.in);
    Pila pila1 = new Pila(100);//En mi caso elijo 100 otra opcion era tener una lista,evitamos el limite y un desborde. 
    int opcion = 0;

    while (opcion != 4) {
      System.out.println("Menú:");
      System.out.println("1- Apilar dato \t 2- Desapilar e imprimir dato \t 3- Consultar estado de la pila \t 4- Salir");
      System.out.print("Elija una opcion: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("\n Ingrese el dato a apilar: ");
          int dato = scanner.nextInt();
          pila1.apilar(dato);
          break;
        case 2:
          int desapilado = pila1.desapilar();
          if (desapilado != -1) {
            System.out.println("Dato desapilado: " + desapilado );
          }
          break;
        case 3:
          pila1.vercontenido();
          break;
        case 4:
          System.out.println("Cerrado");
          break;
        default:
          System.out.println("Opcion no valida");
          break;
      }
    }
    scanner.close();
  }
}