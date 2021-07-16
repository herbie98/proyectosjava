
package ListaDobleLigada;


public class ListaDoble {
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
     
     public Nodo agregarInico(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo auxiliar = lista;
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
            auxiliar.anterior  = lista;
        }
        return lista;
    }
     
     public Nodo agregarFinal(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null) {
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = crearNodo(dato);
            auxiliar.siguiente.anterior=auxiliar;
        }
        return lista;
    }
     
     public Nodo agregarMedio(Nodo lista, int dato, int nodoBuscado) {
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo nuevo = crearNodo(dato);
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null && auxiliar.getDato() != nodoBuscado) {
                auxiliar = auxiliar.siguiente;
            }
            if(auxiliar.siguiente !=null){
            nuevo.siguiente = auxiliar.siguiente;
            auxiliar.siguiente.anterior=nuevo;
            nuevo.anterior=auxiliar;
            auxiliar.siguiente = nuevo;
            }
            else{
                agregarFinal(lista,dato);
            }
        }
        return lista;
    }
     
     public Nodo Eliminar(Nodo lista, int nodoBuscado) {
        Nodo auxiliar = lista;
        Nodo anterior = lista;
        if (!listaVacia(lista)) {
            if(auxiliar.siguiente==null && auxiliar.anterior==null){
                lista=null;
            }
            else{
            if (auxiliar.getDato() == nodoBuscado) {
                lista = auxiliar.siguiente;
                lista.anterior=null;
                auxiliar.siguiente=null;
            } else {
                while (auxiliar.siguiente != null && auxiliar.getDato() != nodoBuscado) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                if (auxiliar.getDato() == nodoBuscado) {
                    if (auxiliar.siguiente != null ) {
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente.anterior=anterior;
                    auxiliar.siguiente = null;
                    auxiliar.anterior=null;
                    }
                     else{
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = null;
                    auxiliar.anterior=null;
                }
                }
               
            }
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
                System.out.print(" -> ");
            }
            System.out.println(auxiliar.getDato());
        } else {
            System.out.println("Lista vacia");
        }
    }
      
       public void imprimirListafinal(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null) {
                
                auxiliar = auxiliar.siguiente;
                
            }
            while (auxiliar.anterior != null ){
                System.out.print(auxiliar.getDato());
                auxiliar=auxiliar.anterior;
                System.out.print(" -> ");
            }
            System.out.println(auxiliar.getDato());
        } else {
            System.out.println("Lista vacia");
        }
    }
}
