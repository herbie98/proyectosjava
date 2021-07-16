/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author JGCUT
 */
public class MainListaSimple {
    
    
    Nodo lista= null;
    
    public void menu(){
        ListaSimple objListaSimple = new ListaSimple();
       
        short opcion;
        int dato,nodobuscado;
        Scanner in = new Scanner (System.in);
        
        do{
        System.out.println("lista simplemente ligada");
        System.out.println("1.agregar un nodo al inicio");
        System.out.println("2.agregar un nodo al final");
        System.out.println("3.agregar un nodo en medio");
        System.out.println("4.eliminar un nodo");
        System.out.println("5.imprimir la lista");
        System.out.println("6.salir");
        System.out.println("elige una opción");
        opcion = in.nextShort();
        switch(opcion){
            case 1 : System.out.println("ingresar dato");
                     dato = in.nextInt();
                     lista = objListaSimple.agregarInicio(lista, dato);
                     break;
            case 2 : System.out.println("ingresar dato");
                     dato = in.nextInt();
                     lista = objListaSimple.agregarFinal(lista, dato);
                     break;
            case 3 : System.out.println("ingresar un dato");
                     dato = in.nextInt();
                     System.out.println("¿Despues de cual nodo?");
                     nodobuscado = in.nextInt();
                     lista = objListaSimple.agregarMedio(lista, nodobuscado, dato);
                     break;
            case 4 : if(lista != null){
                     System.out.println("ingresar un dato a eliminar");
                     nodobuscado = in.nextInt();
                     lista = objListaSimple.borrar(lista, nodobuscado);
                    }else{
                    System.out.println("lista vacia");
                    }
                     break;
            case 5 :
                    objListaSimple.imprimirLista(lista);
                     break;
            case 6:
              
                     break;
        }
        }while(opcion !=6);
       
    }
    
    public static void main(String []args){
        MainListaSimple obMain = new MainListaSimple();
        obMain.menu();
    }
}
// puedes agregar una o mas lista y utulizar los mismo metodos

