
package Colas;

import java.util.Scanner;

public class MainCola {
    
    Nodo pila = null;
    
    public void menu() {
        Colas objp = new Colas();
        short opcion;
        int dato;
        int nodoBuscado;
        Scanner usuario = new Scanner(System.in);
        do {
            System.out.println("Colas");
            System.out.println("1. Agregar un nodo");
            System.out.println("2. Eliminar un nodo");
            System.out.println("3. Imprimir la cola");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = usuario.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el dato: ");
                    dato = usuario.nextInt();
                    pila = objp.agregarInico(pila, dato);
                    break;
               

                case 2:
                    if (pila != null) {
                        pila = objp.Eliminar(pila);
                    } else {
                        System.out.println("Cola vacia");
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
        MainCola objcola = new MainCola();
        objcola.menu();
    }
}
