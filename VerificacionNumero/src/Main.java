import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("VERIFICAR NUMERO ");
        Scanner reader = new Scanner(System.in);

        //Variable
        int numero;

        //Ingresar el numero
        System.out.println("Ingrese el numero a verificar:");
        numero = reader.nextInt();

        //Verificar numero si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero "+ numero +" es par ");

        } else {
            System.out.println("El numero "+ numero +" es impar ");
        }

    }
}
