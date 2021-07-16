package ListaCircular;

public class Circular {

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
            lista.siguiente = lista;
        } else {
            Nodo auxiliar = lista;
            Nodo ultimo = regresarFinal(lista);
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
            ultimo.siguiente = lista;
        }
        return lista;
    }

    //Agregar un nodo al final de la lista
    public Nodo agregarFinal(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
        } else {
            Nodo ultimo = regresarFinal(lista);
            Nodo nodo = crearNodo(dato);
            nodo.siguiente = lista;
            ultimo.siguiente = nodo;
        }
        return lista;
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
            //if(auxiliar.siguiente == null && auxiliar.getDato() != nodoBuscado){

            nuevo.siguiente = auxiliar.siguiente;
            auxiliar.siguiente = nuevo;
        }
        return lista;
    }

    public Nodo regresarFinal(Nodo lista) {
        Nodo auxiliar = lista;
        while (auxiliar.siguiente != lista) {
            auxiliar = auxiliar.siguiente;
        }
        return auxiliar;
    }

    public Nodo Eliminar(Nodo lista, int nodoBuscado) {
        Nodo auxiliar = lista;
        Nodo anterior = lista;
        Nodo ultimo = regresarFinal(lista);

        if (!listaVacia(lista)) {

            if (auxiliar == auxiliar.siguiente) {
                lista = null;

            } else {

                if (auxiliar.getDato() == nodoBuscado) {
                    lista = auxiliar.siguiente;
                    ultimo.siguiente = lista;
                } else {
                    while (auxiliar.siguiente != lista && auxiliar.getDato() != nodoBuscado) {
                        anterior = auxiliar;
                        auxiliar = auxiliar.siguiente;
                    }
                    if (auxiliar.siguiente != lista || auxiliar.getDato() == nodoBuscado) {
                        anterior.siguiente = auxiliar.siguiente;
                        auxiliar.siguiente = null;
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
}
