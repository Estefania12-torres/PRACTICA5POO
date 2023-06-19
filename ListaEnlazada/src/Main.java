// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //crear lista
        ListEnlazada lista = new ListEnlazada();
        // Agregar nodos
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(4);
        lista.agregarAlInicio(6);
        lista.agregarAlInicio(8);
        lista.agregarAlInicio(10);
        lista.agregarAlInicio(12);
        lista.agregarAlInicio(14);

        // Mostrar la lista
        lista.mostrarLista();

        // Insertar un Nuevo Nodo
        lista.insertarNuevoNodo(11);
        // Presentar la lista actualizada
        lista.mostrarLista();


        // Eliminar un nodo
        lista.eliminarNodo(14);
        // Presentar la lista actualizada
        lista.mostrarLista();
    }
}