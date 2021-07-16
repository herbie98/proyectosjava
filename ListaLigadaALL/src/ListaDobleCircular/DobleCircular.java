
package ListaDobleCircular;


public class DobleCircular {
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
            lista.siguiente=lista;
            lista.anterior=lista;
        } else {
            Nodo auxiliar = lista; 
            Nodo ultimo = regresarFinal(lista);
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
            ultimo.siguiente = lista;
            lista.anterior=ultimo;
            auxiliar.anterior=lista;
        }
        return lista;
    }
    
    public Nodo agregarFinal(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior=lista;
        } else {
            Nodo ultimo = regresarFinal(lista);
            Nodo nodo = crearNodo(dato);
            nodo.siguiente = lista;
            ultimo.siguiente = nodo;
            nodo.anterior=ultimo;
            lista.anterior=nodo;
        }
        return lista;
    }
    
     public Nodo regresarFinal(Nodo lista) {
        Nodo auxiliar = lista;
        while (auxiliar.siguiente != lista) {
            auxiliar = auxiliar.siguiente;
        }
        // System.out.println(auxiliar.getDato());
        return auxiliar;
    }
    
    public Nodo agregarMedio(Nodo lista, int dato, int nodoBuscado) {
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo nuevo = crearNodo(dato);
            Nodo auxiliar = lista;
           
            while (auxiliar.siguiente != lista && auxiliar.getDato() != nodoBuscado) {
                auxiliar = auxiliar.siguiente;
            }
            
            if(auxiliar.siguiente != lista){
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
        Nodo ultimo = regresarFinal(lista);
        if (!listaVacia(lista)) {
            if(auxiliar.siguiente==auxiliar /*&& auxiliar.anterior==lista*/){
                lista=null;
            }
            else{
            if (auxiliar.getDato() == nodoBuscado) {
                lista = auxiliar.siguiente;
                ultimo.siguiente=lista;
               /* auxiliar.siguiente=null;
                auxiliar.anterior=null;*/
            } else {
                while (auxiliar.siguiente != lista && auxiliar.getDato() != nodoBuscado) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                if (auxiliar.getDato() == nodoBuscado) {
                    if (auxiliar.siguiente != lista ) {
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente.anterior=anterior;
                    auxiliar.siguiente = null;
                    auxiliar.anterior=null;
                    }
                     else{
                    anterior.siguiente = auxiliar.siguiente;
                    lista.anterior=auxiliar.anterior;
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
            while (auxiliar.siguiente != lista) {
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
            while (auxiliar.siguiente != lista) {
                auxiliar = auxiliar.siguiente;
            }
            while (auxiliar != lista){
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
