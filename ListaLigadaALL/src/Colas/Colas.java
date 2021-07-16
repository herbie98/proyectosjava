
package Colas;

public class Colas {
   
    public Nodo crearNodo(int dato) {
        Nodo nodo = new Nodo(dato);
        return nodo;
    }

    public boolean listaVacia(Nodo cola) {
        if (cola == null) {
            return true;
        }
        return false;
    }
    
    public Nodo agregarInico(Nodo cola, int dato) {
        //Si la lista esta vacia
        if (listaVacia(cola)) {
            cola = crearNodo(dato);
        } else {
            Nodo auxiliar = cola;
            cola = crearNodo(dato);
            cola.siguiente = auxiliar;
        }
        return cola;
    }

    public Nodo Eliminar(Nodo cola) {
        Nodo auxiliar = cola;
        Nodo anterior = cola;
        if(auxiliar.siguiente == null){
            cola=null;
        }
        else{
                while (auxiliar.siguiente != null) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                if (auxiliar.siguiente == null) {
                    anterior.siguiente = auxiliar.siguiente;
                    System.out.println("se elimino: "+ auxiliar.getDato());
                    auxiliar.siguiente = null;
                    
                }
        }
        return cola;
    }
    
    
      public void imprimirLista(Nodo cola) {
        if (!listaVacia(cola)) {
            Nodo auxiliar = cola;
            while (auxiliar.siguiente != null) {
                System.out.print(auxiliar.getDato());
                auxiliar = auxiliar.siguiente;
                System.out.print(" -> ");
            }
            System.out.println(auxiliar.getDato());
        } else {
            System.out.println("Colas vacia");
        }
    }
}
