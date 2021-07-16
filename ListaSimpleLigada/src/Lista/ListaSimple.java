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

    //agregar in nodo al inicio de la lista 
    public Nodo agregarInicio(Nodo lista, int dato) {
        //si la lista esta vacia 
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo auxiliar = lista;
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
        }
        return lista;
    }

    public Nodo agregarMedio(Nodo lista, int nodobuscado, int dato) {

        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {

            Nodo nuevoNodo = crearNodo(dato);
            Nodo auxiliar = lista;

            while (auxiliar.siguiente != null && auxiliar.getDato() != nodobuscado) {
                auxiliar = auxiliar.siguiente;
            }
            /*if(auxiliar.siguiente == null && auxiliar.getDato() != nodobuscado){
            //no es el nodo que busque
        }
             */
            nuevoNodo.siguiente = auxiliar.siguiente;
            auxiliar.siguiente = nuevoNodo;

        }
        return lista;
    }

    public Nodo agregarFinal(Nodo lista, int dato) {
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

    public void imprimirLista(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null) {
                System.out.print(auxiliar.getDato());
                auxiliar = auxiliar.siguiente;
                System.out.print("-->");
            }
            System.out.println(auxiliar.getDato());
        } else {
            System.out.println("lista vacia");
        }
    }

    public Nodo borrar(Nodo lista, int nodobuscado) {
        Nodo auxiliar = lista;
        Nodo anterior = lista;
        if (!listaVacia(lista)) {
            //comprobamos si es el primer nodo
            if (auxiliar.getDato() == nodobuscado) {
                //si lo es ,entonces hacemos que el primer nodo sea el segundo
                lista = auxiliar.siguiente;
            } else {
                //vamos saltando los nodos que no cuincidad hasta
                //que encontremos uno o se acabe la lista
                while (auxiliar.siguiente != null && auxiliar.getDato() != nodobuscado) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                //si la lista no ha acabado
                if (auxiliar.siguiente != null || auxiliar.getDato() == nodobuscado) {
                    //saltamos al siguinete
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = null;
                }
            }
        }
        return lista;
    }
}
