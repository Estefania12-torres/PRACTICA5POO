import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>();

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la nota del estudiante #" + (i + 1) + ": ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

            Estudiante estudiante = new Estudiante(nombre, nota);
            estudiantes.add(estudiante);
        }

        Ordenar ordenar = new Ordenar();
        Ordenar.procesarEstudiantes(estudiantes);
    }
}
