public class Nodo {
    //atributos
    public int dato;
    Nodo siguiente,anterior;
    //constructor para insertar al final
    public Nodo(int elemento){
        this(elemento,null,null);

    }
    //constructor para insertar al inicio
    public Nodo(int elemento,  Nodo s,Nodo a){
        dato=elemento;
        siguiente=s;
        anterior=a;
    }
}
