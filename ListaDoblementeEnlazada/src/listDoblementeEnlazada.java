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

