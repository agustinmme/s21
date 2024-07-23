
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de equipos ");
        int numEquipos = scanner.nextInt();
        scanner.nextLine(); 

        Equipo[] equipos = new Equipo[numEquipos];

        for (int i = 0; i < numEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el puntaje del equipo " + (i + 1) + ": ");
            int puntaje = scanner.nextInt();
            scanner.nextLine(); 

            equipos[i] = new Equipo(nombre, puntaje);
        }

        QuickSort qs = new QuickSort();
        qs.ordenar(equipos, 0, equipos.length - 1);

        System.out.println("\nTabla de posiciones ordenada:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i]);
        }

        scanner.close();
    }
}
