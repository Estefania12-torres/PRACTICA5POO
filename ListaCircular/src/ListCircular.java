public class ListCircular {
    private Nodo inicio;

    public ListCircular() {
        inicio = null;
    }

    public boolean listaVacia() {
        return inicio == null;
    }


    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (listaVacia()) {
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio.getSiguiente());
            inicio.setSiguiente(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarNodo(int dato, int nuevoDato) {
        if (listaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo aux = inicio;
        do {
            if (aux.getDato() == dato) {
                Nodo nuevoNodo = new Nodo(nuevoDato);
                nuevoNodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevoNodo);
                System.out.println("\nSe ha insertado el nodo " + nuevoDato +"");
                return;
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);
        System.out.println("No se encontró el nodo " + dato + " en la lista.");
    }

    public void eliminarNodo(int dato) {
        if (listaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo aux = inicio;
        while (aux.getSiguiente() != inicio) {
            if (aux.getSiguiente().getDato() == dato) {
                Nodo nodoEliminar = aux.getSiguiente();
                aux.setSiguiente(nodoEliminar.getSiguiente());
                System.out.println("\nSe elimino el nodo " + dato);
                return;
            }
            aux = aux.getSiguiente();
        }
        System.out.println("No se encontró el dato " + dato + " en la lista.");
    }
    public void mostrarLista() {
        if (listaVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo aux = inicio.getSiguiente();
            do {
                System.out.print("[" + aux.getDato() + "]-->");
                aux = aux.getSiguiente();
            } while (aux != inicio.getSiguiente());
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}