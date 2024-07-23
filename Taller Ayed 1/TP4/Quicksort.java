
  class QuickSort {
    /* Esta función toma el último elemento como pivote,
    * coloca el elemento pivote en su posición correcta en la matriz
    ordenada
    * y coloca todos los elementos más pequeños (más pequeños que pivote)
    * a la izquierda del pivote y todos los elementos mayores a la derecha
    del pivote.
    */
    int particion(Equipo arr[], int low, int high) {
      int pivot = arr[high].getPuntaje();
      int i = (low - 1); // índice del elemento mas chico
      for (int j = low; j < high; j++) {
        // Si el elemento actual es mas chico o igual que el pivot
        if (arr[j].getPuntaje() <= pivot) {
          i++;
          // swap arr[i] and arr[j]
          Equipo temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      // Intercambia arr[i+1] y arr[high] (o pivot)
      Equipo temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;
      return i + 1;
    }
    /* Método principal que implementa quicksort
    arr[] --> Array a ser ordenado,
    low --> Comienzo de indice,
    high --> Fin de indice */
    void ordenar(Equipo arr[], int low, int high) {
        // Corto si ya ordene todo
        if (low < high) {
            // pi es el indice de particion arr[pi] esta en su posicion correcta
            int pi = particion(arr, low, high);

            // Ordena los elementos antes de la particion y despues de la particion
            ordenar(arr, low, pi - 1);
            ordenar(arr, pi + 1, high);
        }
    }
  }