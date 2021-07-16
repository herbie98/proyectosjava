
public class ListaSimple {
  
    public Nodo crearNodo(int dato){
    Nodo  nodo = new Nodo(dato);
    return nodo;
    }
    
    public boolean listaVacia(Nodo lista){
        if(lista==null)
            return true;
        return false;
    }
    //agregar in nodo al inicio de la lista 
    public Nodo agregarInicio(Nodo lista,int dato){
        //si la lista esta vacia 
        if(listaVacia(lista))
            lista= crearNodo(dato);
        else{
            Nodo auxiliar = lista;
            lista = crearNodo(dato);
            lista.siguiente = auxiliar;
        }
        return lista;
    }
    
    public Nodo agregarFinal(Nodo lista,int dato){
        if(listaVacia(lista))
            lista= crearNodo(dato);
        else{
            Nodo auxiliar = lista.siguiente.siguiente;
            lista = crearNodo(dato);
            lista.siguiente= auxiliar;
        }
        return lista;
    }
    
    public void imprimirLista(Nodo lista){
        if(!listaVacia(lista)){
            Nodo auxiliar = lista;
            while (auxiliar.siguiente != null){
                System.out.println(auxiliar.getDato());
                auxiliar = auxiliar.siguiente;
                System.out.println("-->");
            }
            System.out.println(auxiliar.getDato());
        }else
            System.out.println("lista vacia");
    }
}
