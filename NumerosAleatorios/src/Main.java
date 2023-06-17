import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int cantidadNumeros = 20; // Declara la variable cantidadNumeros e inicializa su valor en 20

        List<Integer> numeros = generarNumerosAleatorios(cantidadNumeros); // Llama y asigna el resultado a la lista numeros
        System.out.println("Lista de números generados: " + numeros); // Imprime la lista de números generados

        List<Integer> numerosPares = obtenerNumerosPares(numeros); // Llama al método obtenerNumerosPares
        System.out.println("Números pares de la lista: " + numerosPares); // Imprime la lista de números pares
    }

    private static List<Integer> generarNumerosAleatorios(int cantidad) {
        Set<Integer> numeros = new HashSet<>(); // Utiliza un HashSet para evitar duplicados
        Random random = new Random(); // Crea una nueva instancia de Random

        while (numeros.size() < cantidad) {
            int numero = random.nextInt(100); // Genera un número aleatorio del 0 al 99
            numeros.add(numero); // Agrega el número generado al conjunto numeros
        }

        return new ArrayList<>(numeros); // Convierte en una lista antes de retornarla
    }

    private static List<Integer> obtenerNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>(); // Crea una nueva instancia de ArrayList para almacenar los números pares

        for (int numero : numeros) {
            if (numero % 2 == 0) { // Comprueba si el número es par verificando si su resto al dividirlo por 2 es igual a cero
                numerosPares.add(numero); // Agrega el número par a la lista de números pares.
            }
        }
        return numerosPares; // Retorna la lista de números pares.
    }
}
