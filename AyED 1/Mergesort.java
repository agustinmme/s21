
  class MergeSort {
    // Mezcla 2 subarrays arr[].
    // El primer subarray es arr[l..m]
    // El segundo seb subarray esarr[m+1..r]
    void mezclar(int arr[], int l, int m, int r) {
      // Obtiene el tamaño de los 2 subarrays a ser mezclados
      int n1 = m - l + 1;
      int n2 = r - m;
      /* Crea arrays temporales */
      int L[] = new int[n1];
      int R[] = new int[n2];
      /*Copia los datos a los arrays temporales*/
      for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
      for (int j = 0; j < n2; ++j)
        R[j] = arr[m + 1 + j];
      /* Mezcla los Arrays temporales */
      // ïndices iniciales del primer y segundo subarray
      int i = 0, j = 0;
      // Índices iniciales de los subarray mezclados
      int k = l;
      while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
          arr[k] = L[i];
          i++;
        } else {
          arr[k] = R[j];
          j++;
        }
        k++;
      }
      /* Copiar los elementos pendientes de L[] si hay */
      while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
      }
      /* Copiar los elementos pendientes de R[] si hay */
      while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
      }
    }
    // Funcion principal que ordena arr[l..r] usando mezclar()
    void ordenar(int arr[], int l, int r) {
        // Corto si llego al final
        if (l < r) {
            // Encuentra el punto medio del array
            int m = (l + r) / 2;
            // Ordena la primera mitad
            ordenar(arr, l, m);
            // Ordena la segunda mitad
            ordenar(arr, m + 1, r);
            // Mezcla las mitades ordenadas
            mezclar(arr, l, m, r);
        }
    }
    /* Una función que sirve para mostrar un array de tamaño n */
    static void MostrarArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  }