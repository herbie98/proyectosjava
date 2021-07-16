package pilas;

public class Pila {

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

    public Nodo agregarFinal(Nodo lista, int dato) {
        if (listaVacia(lista)) {//si la lista esta vacia que tenga como valor null "lista" es igual a null
            lista = crearNodo(dato);//va a crear un nodo
        } else {//si no es asi. si tiene nodos en "lista" entonces
            Nodo auxiliar = lista;//"auxiliar" toma los datos de la lista y la variable "lista" queda como null(vacia)

            while (auxiliar.siguiente != null) {//si es diferente a null. osea si no es null realiza la comparacion
                auxiliar = auxiliar.siguiente;//toma el otro nodo y verifica que sea null si no lo es, sigue brincando
            }
            auxiliar.siguiente = crearNodo(dato);//una vez que encuentra el nodo que es null alli crea el nodo deseado
        }
        return lista;//devuelve toda la lista ya unida
    }

    public Nodo eliminar(Nodo lista) {
        Nodo auxiliar = lista;
        Nodo anterior = lista;
        if (!listaVacia(lista)) {
            if(auxiliar.siguiente==null){
                lista=null;
            }else {
                
            
            
            while (auxiliar.siguiente != null) {
                anterior = auxiliar;
                auxiliar = auxiliar.siguiente;
            }
            
            
                anterior.siguiente = auxiliar.siguiente;
                //auxiliar.siguiente = null;
           
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
