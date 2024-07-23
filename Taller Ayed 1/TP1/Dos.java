
public class Dos {
    // Metodo para contar la frecuencia de letras en una palabra
    public int[] contarFrecuencia(String palabra) {
        int[] conteos = new int[26];
        palabra = palabra.toUpperCase();
        
        for (int i = 0; i < palabra.length(); i++) {
            try {
                int index = palabra.charAt(i) - 'A';
                conteos[index]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No es una letra: ´" + palabra.charAt(i)+"´");
            }
        }
        
        return conteos;
    }
    
    // Metodo para imprimir la frecuencia de letras
    public void imprimirFrecuencia(int[] conteos) {
        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] != 0) {
                System.out.println((char)(i + 'A') + ": " + conteos[i]);
            }
        }
    }
}
