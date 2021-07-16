package ListaCircular;

import java.util.Scanner;
public class MainListaSimpleCircular {
    
    
    Nodo lista= null;
    
    public void menu(){
        ListaSimpleCircular objListaSimpleCircular= new ListaSimpleCircular();
       
        short opcion;
        int dato,nodobuscado;
        Scanner in = new Scanner (System.in);
        
        do{
        System.out.println("************lista simple circular***************");
        System.out.println("1.agregar al inicio");
        System.out.println("2.agregar al final");
        System.out.println("3.agregar  en medio");
        System.out.println("4.eliminar un nodo");
        System.out.println("5.imprimir la lista");
        System.out.println("6.salir");
        System.out.println("elige una opción");
        opcion = in.nextShort();
        switch(opcion){
            case 1 : System.out.println("ingresar dato");
                     dato = in.nextInt();
                     lista = objListaSimpleCircular.agregarInicio(lista, dato);
                     break;
            case 2 : System.out.println("ingresar dato");
                     dato = in.nextInt();
                     lista = objListaSimpleCircular.agregarFinal(lista, dato);
                     break;
            case 3 : System.out.println("ingresar un dato");
                     dato = in.nextInt();
                     System.out.println("¿Despues de cual nodo?");
                     nodobuscado = in.nextInt();
                     lista = objListaSimpleCircular.agregarMedio(lista, nodobuscado, dato);
                     break;
            case 4 : if(lista != null){
                     System.out.println("ingresar un dato a eliminar");
                     nodobuscado = in.nextInt();
                     lista = objListaSimpleCircular.borrar(lista, nodobuscado);
                    }else{
                    System.out.println("lista vacia");
                    }
                     break;
            case 5 :
                    objListaSimpleCircular.imprimirLista(lista);
                     break;
            case 6:
              
                     break;
        }
        }while(opcion !=6);
       
    }
    
    public static void main(String []args){
        MainListaSimpleCircular obMain = new MainListaSimpleCircular();
        obMain.menu();
    }
}
// puedes agregar una o mas lista y utulizar los mismo metodos

