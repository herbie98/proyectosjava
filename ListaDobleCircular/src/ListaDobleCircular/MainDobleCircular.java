package ListaDobleCircular;

import java.util.Scanner;

public class MainDobleCircular {

    Nodo lista = null;

    public void menu() {
        DobleCircular objList = new DobleCircular();
        short opcion;
        int dato;
        int nodoBuscado;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("********Lista Doble Circular*********");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en medio");
            System.out.println("4. Eliminar un nodo");
            System.out.println("5. Imprimir la lista");
            System.out.println("6. Salir");
            opcion = teclado.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el dato: ");
                    dato = teclado.nextInt();
                    lista = objList.agregarInico(lista, dato);
                    break;
                case 2:
                    System.out.println("\nIngrese el dato: ");
                    dato = teclado.nextInt();
                    lista = objList.agregarFinal(lista, dato);
                    break;
                case 3:
                    System.out.println("\nIngrese un dato: ");
                    dato = teclado.nextInt();
                    System.out.println("\n�Despues de cual nodo?");
                    nodoBuscado = teclado.nextInt();
                    lista = objList.agregarMedio(lista, dato, nodoBuscado);
                    break;

                case 4:
                    if (lista != null) {
                        System.out.println("\nIngrese el dato a eliminar: ");
                        nodoBuscado = teclado.nextInt();
                        lista = objList.Eliminar(lista, nodoBuscado);
                    } else {
                        System.out.println("Lista vacia");
                    }
                    break;

                case 5:
                    objList.imprimirLista(lista);
                    objList.imprimirListafinal(lista);
                    break;

                case 6:
                    break;
            }
        } while (opcion != 6);

    }

    public static void main(String[] args) {
        MainDobleCircular objMain = new MainDobleCircular();
        objMain.menu();
    }
}
