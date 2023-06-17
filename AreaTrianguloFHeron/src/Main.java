import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Se crea un objeto Scanner para ingresar los valores del Usuario 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores positivos para el calculo del Area del Triangulo");
        System.out.println("Ingrese el valor del lado A: "); 
        double valorLadoA = scanner.nextDouble();  //Se obtiene el valor del lado A del triangulo
        System.out.println("Ingrese el valor del lado B: ");
        double valorLadoB = scanner.nextDouble();  //Se obtiene el valor del lado B del triangulo
        System.out.println("Ingrese el valor del lado C: "); 
        double valorLadoC = scanner.nextDouble();  //Se obtiene el valor del lado C del triangulo


        Triangulo triangulo = new Triangulo(valorLadoA, valorLadoB, valorLadoC);
        System.out.println(triangulo.toString());




    }
}
