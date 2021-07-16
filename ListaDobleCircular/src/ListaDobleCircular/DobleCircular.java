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
//metodo agregar inicio
    public Nodo agregarInico(Nodo lista, int dato) {
        //Si la lista esta vacia

        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior = lista;
        } else {
            Nodo aux = lista;
            Nodo ultimo = regresarFinal(lista);
            lista = crearNodo(dato);
            lista.siguiente = aux;
            ultimo.siguiente = lista;
            lista.anterior = ultimo;
            aux.anterior = lista;
        }
        return lista;
    }
//agregar final
    public Nodo agregarFinal(Nodo lista, int dato) {
        //Si la lista esta vacia
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior = lista;
        } else {
            Nodo ultimo = regresarFinal(lista);
            Nodo nodo = crearNodo(dato);
            nodo.siguiente = lista;
            ultimo.siguiente = nodo;
            nodo.anterior = ultimo;
            lista.anterior = nodo;
        }
        return lista;
    }

    public Nodo regresarFinal(Nodo lista) {
        Nodo aux = lista;
        while (aux.siguiente != lista) {
            aux = aux.siguiente;
        }

        return aux;
    }
//metodo agregar medio
    public Nodo agregarMedio(Nodo lista, int dato, int nodoBuscado) {
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
        } else {
            Nodo newnodo = crearNodo(dato);
            Nodo aux = lista;

            while (aux.siguiente != lista && aux.getDato() != nodoBuscado) {
                aux = aux.siguiente;
            }

            if (aux.siguiente != lista) {
                newnodo.siguiente = aux.siguiente;
                aux.siguiente.anterior = newnodo;
                newnodo.anterior = aux;
                aux.siguiente = newnodo;
            } else {
                agregarFinal(lista, dato);
            }
        }
        return lista;
    }
//metodo eliminar nodo
    public Nodo Eliminar(Nodo lista, int nodoBuscado) {
        Nodo aux = lista;
        Nodo anterior = lista;
        Nodo ultimo = regresarFinal(lista);
        if (!listaVacia(lista)) {
            if (aux.siguiente == aux) {
                lista = null;
            } else {
                if (aux.getDato() == nodoBuscado) {
                    lista = aux.siguiente;
                    ultimo.siguiente = lista;

                } else {
                    while (aux.siguiente != lista && aux.getDato() != nodoBuscado) {
                        anterior = aux;
                        aux = aux.siguiente;
                    }
                    if (aux.getDato() == nodoBuscado) {
                        if (aux.siguiente != lista) {
                            anterior.siguiente = aux.siguiente;
                            aux.siguiente.anterior = anterior;
                            aux.siguiente = null;
                            aux.anterior = null;
                        } else {
                            anterior.siguiente = aux.siguiente;
                            lista.anterior = aux.anterior;
                            aux.siguiente = null;
                            aux.anterior = null;
                        }
                    }

                }
            }
        }
        return lista;
    }

    public void imprimirLista(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo aux = lista;
            while (aux.siguiente != lista) {
                System.out.print(aux.getDato());
                aux = aux.siguiente;
                System.out.print(" -> ");
            }
            System.out.println(aux.getDato());
        } else {
            System.out.println("Lista vacia");
        }
    }

    public void imprimirListafinal(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo aux = lista;
            while (aux.siguiente != lista) {
                aux = aux.siguiente;
            }
            while (aux != lista) {
                System.out.print(aux.getDato());
                aux = aux.anterior;
                System.out.print(" -> ");
            }
            System.out.println(aux.getDato());
        } else {
            System.out.println("Lista vacia");
        }
    }
}
