// insertar eliminar nodo, main presentar agregar

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        // Agregar valores a la lista
        lista.agregar(3);
        lista.agregar(5);
        lista.agregar(7);
        lista.agregar(9);
        lista.agregar(11);
        lista.agregar(13);

        System.out.println("Lista original:");
        lista.mostrarLista();
        // Insertar un nodo después del nodo con valor 10
        lista.insertarNodo(7, 10);
        // Eliminar el nodo con valor 5
        lista.eliminarNodo(5);
        lista.mostrarLista();
    }
}
