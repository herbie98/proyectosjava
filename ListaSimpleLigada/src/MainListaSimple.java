
public class MainListaSimple {
    
    Nodo lista= null;
    
    public void prueba(){
        ListaSimple objListaSimple = new ListaSimple();
        
       lista= objListaSimple.agregarInicio(lista,500);
       lista= objListaSimple.agregarInicio(lista,400);
       lista= objListaSimple.agregarInicio(lista,300);
       lista= objListaSimple.agregarInicio(lista,200);
       lista= objListaSimple.agregarInicio(lista,100);
       objListaSimple.imprimirLista(lista);
    }
    
    public static void main(String []args){
        MainListaSimple obMain = new MainListaSimple();
        obMain.prueba();
    }
}
// puedes agregar una o mas lista y utulizar los mismo metodos