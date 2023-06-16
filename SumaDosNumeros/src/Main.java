// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("SUMA DE DOS NUMEROS");
        Scanner reader=new Scanner(System.in);
        
        //Ingresar variables
        int numero1;
        int numero2;
        int resultado;

        //Ingresar por el usuario numero 1 y numero2
        System.out.println("Ingrese el primer numero: ");
        numero1=reader.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2=reader.nextInt();

        //Calcular la suma de los dos numeros 
        resultado=numero1+numero2;

        //Presentar resultado
        System.out.println("La suma de los numeros es :"+ numero1 + "+"+ numero2 + "=" + resultado);

    }
}
