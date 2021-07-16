package Lista;

public class ListaSimple {

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

    //Agregar un nodo al inicio de la lista
    public Nodo agregarInico(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo auxiliar = lista;
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
        }
        return lista;
    }

    //Agregar un nodo al final de la lista
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
            //if(auxiliar.siguiente == null && auxiliar.getDato() != nodoBuscado){

            nuevo.siguiente = auxiliar.siguiente;
            auxiliar.siguiente = nuevo;
        }
        return lista;
    }

    public Nodo Eliminar(Nodo lista, int nodoBuscado) {
        Nodo auxiliar = lista;
        Nodo anterior = lista;
        if (!listaVacia(lista)) {
            if (auxiliar.getDato() == nodoBuscado) {
                lista = auxiliar.siguiente;
            } else {
                while (auxiliar.siguiente != null && auxiliar.getDato() != nodoBuscado) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                if (auxiliar.siguiente != null || auxiliar.getDato() == nodoBuscado) {
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = null;
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

}
