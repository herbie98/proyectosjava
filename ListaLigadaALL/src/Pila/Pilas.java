
package Pila;


public class Pilas {
    
    public Nodo crearNodo(int dato) {
        Nodo nodo = new Nodo(dato);
        return nodo;
    }
     
      public boolean PilaVacia(Nodo Pila) {
        if (Pila == null) {
            return true;
        }
        return false;
    }
      
      
       public Nodo agregarFinal(Nodo Pila, int dato) {
        //Si la lista esta vacia
        if (PilaVacia(Pila)) {
            Pila = crearNodo(dato);
        } else {
            Nodo auxiliar = Pila;
            while (auxiliar.siguiente != null) {
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = crearNodo(dato);
        }
        return Pila;
    }
       
        public Nodo Eliminar(Nodo Pila) {
        Nodo auxiliar = Pila;
        Nodo anterior = Pila;
        if(auxiliar.siguiente == null){
            Pila=null;
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
        return Pila;
    }
        
        
        
         public void imprimirLista(Nodo Pila) {
        if (!PilaVacia(Pila)) {
            Nodo auxiliar = Pila;
            while (auxiliar.siguiente != null) {
                System.out.print(auxiliar.getDato());
                auxiliar = auxiliar.siguiente;
                System.out.print(" -> ");
            }
            System.out.println(auxiliar.getDato());
        } else {
            System.out.println("Pila vacia");
        }
    }
}
