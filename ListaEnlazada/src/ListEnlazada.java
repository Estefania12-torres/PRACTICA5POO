public class ListEnlazada {

    //atributos
    protected Nodo inicio,fin;
    //constructor
    public ListEnlazada(){
        inicio=null;
        fin=null;
    }
    //Metodo para saber si la lista esta vacia
    public void agregarAlInicion(int elemento){
        inicio=new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    //mostrar datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer=recorrer.siguiente;
        }
    }

}
