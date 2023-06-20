
public class Lista {
private Nodo inicio;
private Nodo fin;

public Lista() {
        inicio = null;
        fin = null;
        }

public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
        nuevo.siguiente = nuevo;
        nuevo.anterior = nuevo;
        inicio = nuevo;
        fin = nuevo;
        } else {
        nuevo.anterior = fin;
        nuevo.siguiente = inicio;
        fin.siguiente = nuevo;
        inicio.anterior = nuevo;
        fin = nuevo;
        }
        }

public void mostrarLista() {
        if (inicio == null) {
        System.out.println("La lista está vacía");
        return;
        }

        Nodo actual = inicio;
        do {
        System.out.println(actual.dato + " -> ");
        actual = actual.siguiente;
        } while (actual != inicio);
        }
}