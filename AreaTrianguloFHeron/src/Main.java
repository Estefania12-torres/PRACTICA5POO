import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores positivos para el calculo del Area del Triangulo");
        System.out.println("Ingrese el valor del lado A: ");
        double valorLadoA = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado B: ");
        double valorLadoB = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado C: ");
        double valorLadoC = scanner.nextDouble();


        Triangulo triangulo = new Triangulo(valorLadoA, valorLadoB, valorLadoC);
        System.out.println(triangulo.toString());




    }
}