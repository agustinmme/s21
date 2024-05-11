public class Hash {
  int dato;
  int estado; //0 = Vacio, 1 = Eliminado, 2 = Ocupado
  static int FuncionHash(int n, int m) {
    return n % m;
  }
  static void insertaHash(Hash[] h, int m, int n) {
    boolean i = false;
    int j = FuncionHash(n, m);
    do {
      if (h[j].estado == 0 || h[j].estado == 1) {
        h[j].dato = n;
        h[j].estado = 2;
        i = true;
      } else {
        j++;
      }
    } while (j < m && !i);
    if (i) {
      System.out.print("Elemento insertado con Éxito! \n");
    } else {
      System.out.print("Tabla llena!!! \\n");
    }
  }
  static int buscaHash(Hash[] h, int m, int n) {
    int j = FuncionHash(n, m);
    // Busco posicion vacia hasta el final
    while (h[j].estado != 0 && j < m) {
      if (h[j].dato == n && h[j].estado == 2) {
        return j; // Elemento encontrado y está ocupado
      }
      j++; // Sigue buscando
    }
    return -1; // Elemento no encontrado
  }
  static int eliminaHash(Hash[] h, int m, int n) {
    int i = buscaHash(h, m, n);
    if (i == -1) {
      return -1;
    } else {
      h[i].estado = 1;
      System.out.print("Elemento Borrado! \n");
      return 1;
    }
  }

  public static void main(String[] args) {
    int i, n, elemento;
    // Tabla Definida de 15
    int m = 15;
    Hash[] h = new Hash[m];
    for (i = 0; i < m; i++) {
      h[i] = new Hash();
      h[i].estado = 0;
    }
    // Insertar elemento
    Hash.insertaHash(h, m, 15);
    Hash.insertaHash(h, m, 130);
    Hash.insertaHash(h, m, 7);
    Hash.insertaHash(h, m, 32);
    //Buscando un elemento
    elemento = 7;
    i = Hash.buscaHash(h, m, elemento);
    i = Hash.eliminaHash(h, m, 130);

  }
}