public class ListEnlazada {

    //atributos
    protected Nodo inicio,fin;
    //constructor
    public ListEnlazada(){
        inicio=null;
        fin=null;
    }
    //Metodo para saber si la lista esta vacia
    public void agregarAlInicio(int elemento){
        inicio=new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    //metodo para insertar nuevo Nodo
    public void insertarNuevoNodo(int elemento){
        Nodo nuevo=new Nodo(elemento);
        if(inicio==null){
            inicio=nuevo;
            fin=nuevo;
        }else{
            fin.siguiente=nuevo;
            fin=nuevo;
        }
    }
    //metodo para eliminar Nodo
    public void eliminarNodo(int elemento){
        Nodo actual;
        boolean encontrado=false;
        actual=inicio;
        while((actual!=null)&&(!encontrado)){
            encontrado=(actual.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
        if(actual!=null){
            if(actual==inicio){
                inicio=actual.siguiente;
            }else{
                Nodo anterior=inicio;
                while(anterior.siguiente!=actual){
                    anterior=anterior.siguiente;
                }
                anterior.siguiente=actual.siguiente;
            }
            actual=null;
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
