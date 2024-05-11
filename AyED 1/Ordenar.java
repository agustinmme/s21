public class Ordenar {
  static void MostrarArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
    System.out.print(arr[i] + " ");
    System.out.println();
  }
  // Main
  public static void main(String args[]) {
    int arr[] = {
      12,
      11,
      13,
      5,
      6,
      7
    };
    System.out.println("\nArray original antes de MergeSort");
    MostrarArray(arr);
    MergeSort obMS = new MergeSort();
    obMS.ordenar(arr, 0, arr.length - 1);
    System.out.println("\nArray ordenado por Merge Sort");
    MostrarArray(arr);
    int arr2[] = {
      12,
      11,
      13,
      5,
      6,
      7
    };
    System.out.println("\nArray original antes de QuickSort");
    MostrarArray(arr2);
    int n = arr2.length;
    QuickSort obQS = new QuickSort();
    obQS.ordenar(arr2, 0, n - 1);
    System.out.println("\nArray ordenado por Quick Sort");
    MostrarArray(arr2);
  }
}