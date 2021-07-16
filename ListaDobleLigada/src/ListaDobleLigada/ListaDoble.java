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
    
    public Nodo regresarFinal(Nodo lista){
        Nodo aux = lista;
        while(aux.siguiente != lista){
            aux = aux.siguiente;
        }
        return aux;
    }

    //agregar in nodo al inicio de la lista 
    public Nodo agregarInicio(Nodo lista, int dato) {
        //si la lista esta vacia 
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior =lista;
        } else {
            Nodo aux = lista;
            Nodo fin = regresarFinal(lista);
            lista = crearNodo(dato);
            lista.siguiente = aux;
            aux.anterior= lista.siguiente;
            fin.siguiente = lista;
            lista.anterior = fin.siguiente;
            
        }
        return lista;
    }

    public Nodo agregarMedio(Nodo lista, int nodobuscado, int dato) {

        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior= lista;
        } else {

            Nodo nuevoNodo = crearNodo(dato);
            Nodo aux = lista;
            while (aux.siguiente != lista && aux.getDato() != nodobuscado) {
                aux = aux.siguiente;
            }
            /*if(aux.siguiente == null && aux.getDato() != nodobuscado){
            //no es el nodo que busque
            }
            */
            nuevoNodo.siguiente = aux.siguiente;
            aux.siguiente = nuevoNodo;
            regresarFinal(lista).anterior=nuevoNodo.siguiente;
            nuevoNodo.anterior=aux.siguiente;
        }
        return lista;
    }

    public Nodo agregarFinal(Nodo lista, int dato) {
        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
            lista.anterior= lista;
        } else {
            Nodo fin = regresarFinal(lista);
            Nodo nodo = crearNodo(dato);
            nodo.siguiente = lista;
            lista.anterior=nodo.siguiente;
            fin.siguiente = nodo;
            nodo.anterior=fin.siguiente;
        }
        return lista;
    }

    public void imprimirLista(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo aux = lista;
            while (aux.siguiente != lista) {
                System.out.print(aux.getDato());
                aux = aux.siguiente;
                System.out.print("-->");
            }
            System.out.println(aux.getDato());
        } else {
            System.out.println("lista vacia");
        }
    }

    public Nodo borrar(Nodo lista, int nodobuscado) {
        Nodo aux = lista;
        Nodo anterior = lista;
        if (!listaVacia(lista)) 
        {
            //comprobamos si es el primer nodo
            if (aux.getDato() == nodobuscado) 
            {
                //si lo es ,entonces hacemos que el primer nodo sea el segundo
                Nodo fin = regresarFinal(lista);
                lista = aux.siguiente;
                fin.siguiente=lista;
                aux.siguiente=null;
                lista.anterior=fin.siguiente;
            } else 
                {
                //vamos saltando los nodos que no coincidad hasta
                //que encontremos uno o se acabe la lista
                while (aux.siguiente != lista && aux.getDato() != nodobuscado) 
                {
                    anterior = aux;
                    aux = aux.siguiente;
                }
                //si la lista no ha acabado
                if (aux.siguiente != lista || aux.getDato() == nodobuscado) 
                {
                    //saltamos al siguinete
                    anterior.siguiente = aux.siguiente;
                    aux.siguiente = null;
                }
            }
        }
        return lista;
    }
}
