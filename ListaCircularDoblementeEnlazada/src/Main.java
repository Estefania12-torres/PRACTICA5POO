// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        // Agregar valores a la lista
        lista.agregar(8);
        lista.agregar(14);
        lista.agregar(16);
        lista.agregar(24);
        lista.agregar(34);
        lista.agregar(64);

        System.out.println("Lista original:");
        lista.mostrarLista();

    }
}