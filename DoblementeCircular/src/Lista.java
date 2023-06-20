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
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = inicio;
        do {
            System.out.print(actual.dato + " --> ");
            actual = actual.siguiente;
        } while (actual != inicio);
        System.out.println();
    }

    public void eliminarNodo(int dato) {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = inicio;
        do {
            if (aux.getDato() == dato) {
                if (aux == inicio && aux == fin) {
                    // Caso especial: solo hay un nodo en la lista
                    inicio = null;
                    fin = null;
                } else if (aux == inicio) {
                    // Caso especial: el nodo a eliminar es el primero
                    inicio = inicio.getSiguiente();
                    fin.setSiguiente(inicio);
                    inicio.setAnterior(fin);
                } else if (aux == fin) {
                    // Caso especial: el nodo a eliminar es el último
                    fin = fin.getAnterior();
                    fin.setSiguiente(inicio);
                    inicio.setAnterior(fin);
                } else {
                    // Caso general: el nodo a eliminar está en medio de la lista
                    Nodo nodoAnterior = aux.getAnterior();
                    Nodo nodoSiguiente = aux.getSiguiente();
                    nodoAnterior.setSiguiente(nodoSiguiente);
                    nodoSiguiente.setAnterior(nodoAnterior);
                }
                System.out.println("\nSe eliminó el nodo " + dato);
                return;
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);

        System.out.println("No se encontró el dato " + dato + " en la lista.");
    }

    public void insertarNodo(int dato, int nuevoDato) {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo aux = inicio;
        do {
            if (aux.getDato() == dato) {
                Nodo nuevoNodo = new Nodo(nuevoDato);
                nuevoNodo.setSiguiente(aux.getSiguiente());
                nuevoNodo.setAnterior(aux);
                aux.getSiguiente().setAnterior(nuevoNodo);
                aux.setSiguiente(nuevoNodo);
                System.out.println("\nSe ha insertado el nodo " + nuevoDato);
                return;
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);

        System.out.println("No se encontró el nodo " + dato + " en la lista.");
    }
}
