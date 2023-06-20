// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListCircular lista = new ListCircular();
        // Agregar valores a la lista
        lista.agregar(8);
        lista.agregar(14);
        lista.agregar(16);
        lista.agregar(24);
        lista.agregar(34);
        lista.agregar(64);

        System.out.println("Lista original:");
        lista.mostrarLista();

        // Insertar un nodo después del nodo con valor 16
        lista.insertarNodo(14, 18);
        // Mostrar la lista después de la inserción
        System.out.println("Lista después de la inserción:");
        lista.mostrarLista();

        // Eliminar el nodo con valor 24
        lista.eliminarNodo(34);
        lista.mostrarLista();



        // Mostrar la lista después de la eliminación
        System.out.println("\nLista Final :");
        lista.mostrarLista();


    }
}