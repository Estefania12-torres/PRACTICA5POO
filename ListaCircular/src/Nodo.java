class Nodo {
    //atributos
    private int dato;
    private Nodo siguiente;
    
    //constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
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
}
