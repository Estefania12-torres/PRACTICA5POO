public class Nodo {
    //atributos
    int dato;
    Nodo siguiente;
    Nodo anterior;
   
    //constructor
    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }
   
    //getters y setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}

