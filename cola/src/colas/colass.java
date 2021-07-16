package colas;

public class colass {

    public Nodo crearNodo(int dato) {
        Nodo nodo = new Nodo(dato);
        return nodo;
    }

    public boolean listaVacia(Nodo lista) {
        if (lista == null) {
            return true;
        }
        return false;
    }

     public Nodo agregarInicio(Nodo lista, int dato) {
        //si la lista esta vacia 
        if (listaVacia(lista)) {//si la lista esta vacia "lista=null"
            lista = crearNodo(dato);//crea un nodo
        } else {
            Nodo auxiliar = lista;//auxiliar toma los datos que se encuentran en la lista y la lista queda como null
            lista = crearNodo(dato);//en lista se le crea un nodo
            lista.siguiente = auxiliar;//lista tiene el nodo pero el puntosiguiente(.siguiente)lo une el auxiliar
        }
        return lista;//retorna la lista
    }

    public Nodo eliminar(Nodo lista) {
        Nodo auxiliar = lista;//auxiliar apunta donde la lista apunta
        Nodo anterior = lista;//anterior apunta donde la lista apunta
        if (!listaVacia(lista)) {
            if(auxiliar.siguiente==null){
                lista=null;
            }else {
                
            
            
            while (auxiliar.siguiente != null) {
                anterior = auxiliar;//anterior apunta donde apunta auxiliar
                auxiliar = auxiliar.siguiente;//auxiliar realiza un brinco! al siguiente nodo
            }
            
            
                anterior.siguiente = auxiliar.siguiente;
                auxiliar.siguiente = null;
           
            }
        }
        return lista;
    }

    public void imprimirLista(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null) {
                System.out.print(auxiliar.getDato());
                auxiliar = auxiliar.siguiente;
                System.out.print("\n");
            }
            System.out.print(auxiliar.getDato());
        } else {
            System.out.println("lista vacia");
        }
    }
}
