import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("VERIFICAR NUMERO ");
        Scanner reader = new Scanner(System.in);

        //variable
        int numero;

        //Ingresar el numero
        System.out.println("Ingrese el numero a verificar:");
        numero = reader.nextInt();

        //verificar numero si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero "+ numero +" es par ");

        } else {
            System.out.println("El numero "+ numero +" es impar ");
        }

    }
}