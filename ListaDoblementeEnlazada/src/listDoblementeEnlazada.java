import javax.swing.JOptionPane;
public class listDoblementeEnlazada {
        //atributos
        private Nodo inicio,fin;

        //constructor para inicializar los atributos
        public listDoblementeEnlazada(){
            inicio=fin=null;
        }
       //Metodo para saber si la lista esta vacia
        public boolean listaVacia(){
            return inicio==null;
        }
        //Metodo para agregar nodos al inicio de la lista
        public void agregarAlFinal(int elemento){
            if(!listaVacia()){
                fin=new Nodo(elemento,null,fin);
                fin.anterior.siguiente=fin;
            }else{
                inicio=fin=new Nodo(elemento);
            }
        }

        public void insertarNuevoNodo(int elemento, int nuevoElemento) {

            if (!listaVacia()) {
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                if (auxiliar.dato == elemento) {
                    Nodo nuevoNodo = new Nodo(nuevoElemento);
                    nuevoNodo.siguiente = auxiliar.siguiente;
                    if (auxiliar.siguiente != null) {
                        auxiliar.siguiente.anterior = nuevoNodo;
                    } else {
                        fin = nuevoNodo;
                    }
                    auxiliar.siguiente = nuevoNodo;
                    nuevoNodo.anterior = auxiliar;
                    break;
                }
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void eliminarNodo(int elemento) {
        if (!listaVacia()) {
            Nodo auxiliar = inicio;
            while (auxiliar != null) {
                if (auxiliar.dato == elemento) {
                    if (auxiliar == inicio) {
                        inicio = auxiliar.siguiente;
                        if (inicio != null) {
                            inicio.anterior = null;
                        } else {
                            fin = null;
                        }
                    } else if (auxiliar == fin) {
                        fin = auxiliar.anterior;
                        fin.siguiente = null;
                    } else {
                        auxiliar.anterior.siguiente = auxiliar.siguiente;
                        auxiliar.siguiente.anterior = auxiliar.anterior;
                    }
                    break;
                }
                auxiliar = auxiliar.siguiente;
            }
        }
    }
        //Metodo para agregar nodos al final de la lista
        public void mostrarLista(){
            if(!listaVacia()){
                String datos = "<=>";
                Nodo auxiliar=inicio;
                while(auxiliar!=null){
                    datos = datos +"["+auxiliar.dato+"]<=> ";
                    auxiliar=auxiliar.siguiente;
                }
                JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Inicio a Fin" ,JOptionPane.INFORMATION_MESSAGE);

            }
        }

}

