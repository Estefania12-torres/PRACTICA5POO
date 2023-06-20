import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea una instancia de la clase Scanner para leer la entrada del usuario desde la consola.
        List<Estudiante> estudiantes = new ArrayList<>(); //Crea una lista llamada estudiantes que almacenará objetos de tipo Estudiante

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt(); // Lee un entero ingresado por el usuario utilizando el método nextInt()
        scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la nota del estudiante #" + (i + 1) + ": ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

            Estudiante estudiante = new Estudiante(nombre, nota); //Se crea un objeto Estudiante con el nombre y la nota ingresados
            estudiantes.add(estudiante);
        }

        Ordenar ordenar = new Ordenar();
        Ordenar.procesarEstudiantes(estudiantes); // Llama al método estático procesarEstudiantes() de la clase Ordenar
    }
}
