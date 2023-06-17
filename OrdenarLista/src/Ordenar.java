import java.util.List;

public class Ordenar {
   static void procesarEstudiantes(List<Estudiante> estudiantes) {
        // Ordenar los estudiantes por nota utilizando el algoritmo de ordenación de burbuja
        int n = estudiantes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantes.get(j).getNota() < estudiantes.get(j + 1).getNota()) {
                    Estudiante temp = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j + 1));
                    estudiantes.set(j + 1, temp);
                }
            }
        }

        // Obtener la nota más alta y la nota más baja
        int notaMaxima = estudiantes.get(0).getNota();
        int notaMinima = estudiantes.get(estudiantes.size() - 1).getNota();

        // Realizar las operaciones necesarias con los nombres y las notas de los estudiantes
        for (Estudiante estudiante : estudiantes) {
            String nombre = estudiante.getNombre();
            int nota = estudiante.getNota();
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Nota del estudiante: " + nota);
            System.out.println("------------------------");
        }

        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Nota más baja: " + notaMinima);
        // Resto del código...
    }
}
