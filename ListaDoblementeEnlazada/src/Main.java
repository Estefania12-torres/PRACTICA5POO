// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        listDoblementeEnlazada lista = new listDoblementeEnlazada();

        // Agregar valores a la lista
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(3);
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(7);
        lista.agregarAlFinal(9);
        lista.agregarAlFinal(11);
        lista.agregarAlFinal(13);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(17);

        // Mostrar la lista
        lista.mostrarLista();
    }
}