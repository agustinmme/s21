
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dos fl = new Dos();
        
        // Definir arreglo
        System.out.print("Ingrese el num de palabras que desea almacenar: ");
        int n = scan.nextInt();
        scan.nextLine();  // Consumir info
        
        String[] word = new String[n];
        
        // Solicitar palabras
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            word[i] = scan.nextLine();
        }
        
        // Listar todas las palabras almacenadas
        System.out.println("Palabras almacenadas:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + word[i]);
        }
        
        // Solicitar al usuario una pos para contar la frecuencia de letras
        System.out.print("Ingrese el num de la palabra para contar la frecuencia de letras: ");
        int pos = scan.nextInt() - 1;//Al sumar 1 al print tengo que restarle 1 para encontrar el pos verdadero.
        // Listar frecuencia o error
        if (pos >= 0 && pos < n) {
            int[] counter = fl.contarFrecuencia(word[pos]);
            System.out.println("Frecuencia de letras en la palabra ´" + word[pos] + "´:");
            fl.imprimirFrecuencia(counter);
        } else {
            System.out.println("Posicion no valida.");
        }
    }
}