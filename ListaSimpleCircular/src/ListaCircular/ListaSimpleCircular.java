package ListaCircular;


public class ListaSimpleCircular {

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
        Nodo auxiliar = lista;
        while(auxiliar.siguiente != lista){
            auxiliar = auxiliar.siguiente;
        }
        return auxiliar;
    }

    //agregar in nodo al inicio de la lista 
    public Nodo agregarInicio(Nodo lista, int dato) {
        //si la lista esta vacia 
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

    public Nodo agregarMedio(Nodo lista, int nodobuscado, int dato) {

        if (listaVacia(lista)) {
            lista = crearNodo(dato);
            lista.siguiente = lista;
        } else {

            Nodo nuevoNodo = crearNodo(dato);
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != lista && auxiliar.getDato() != nodobuscado) {
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
            lista.siguiente = lista;
        } else {
            Nodo ultimo = regresarFinal(lista);
            Nodo nodo = crearNodo(dato);
            nodo.siguiente = lista;
            ultimo.siguiente = nodo;
        }
        return lista;
    }

    public void imprimirLista(Nodo lista) {
        if (!listaVacia(lista)) {
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != lista) {
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
        if (!listaVacia(lista)) 
        {
            //comprobamos si es el primer nodo
            if (auxiliar.getDato() == nodobuscado) 
            {
               
                if(auxiliar == auxiliar.siguiente){
                    lista = null;
                }
                else{
                //si lo es ,entonces hacemos que el primer nodo sea el segundo
                Nodo ultimo = regresarFinal(lista);
                lista = auxiliar.siguiente;
                ultimo.siguiente=lista;
                auxiliar.siguiente=null;
                
                }
            }
            else 
                {
                //vamos saltando los nodos que no coincidad hasta
                //que encontremos uno o se acabe la lista
                while (auxiliar.siguiente != lista && auxiliar.getDato() != nodobuscado) 
                {
                    anterior = auxiliar;
                    auxiliar = auxiliar.siguiente;
                }
                //si la lista no ha acabado
                if (auxiliar.siguiente != lista || auxiliar.getDato() == nodobuscado) 
                {
                    //saltamos al siguinete
                    anterior.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = null;
                }
            }
        }
        return lista;
    }
}
