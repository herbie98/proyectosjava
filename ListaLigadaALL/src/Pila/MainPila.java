
package Pila;

import java.util.Scanner;


public class MainPila {
    
    Nodo pila = null;
    
    public void menu() {
        Pilas objp = new Pilas();
        short opcion;
        int dato;
        int nodoBuscado;
        Scanner usuario = new Scanner(System.in);
        do {
            System.out.println("Pilas");
            System.out.println("1. Agregar un nodo");
            System.out.println("2. Eliminar un nodo");
            System.out.println("3. Imprimir la lista");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = usuario.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el dato: ");
                    dato = usuario.nextInt();
                    pila = objp.agregarFinal(pila, dato);
                    break;
               

                case 2:
                    if (pila != null) {
                        pila = objp.Eliminar(pila);
                    } else {
                        System.out.println("Lista vacia");
                    }
                    break;
               
                case 3:
                    objp.imprimirLista(pila);
                    break;
               
                case 4:
                    break;
            }
        } while (opcion != 4);

    }
    
    
    public static void main(String []agrs){
        MainPila objPi = new MainPila();
        objPi.menu();
    }
}
