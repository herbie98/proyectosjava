package ListaDobleLigada;

import java.util.Scanner;


public class MainLista {
    Nodo lista = null;

    public void menu() {
        ListaDoble objList = new ListaDoble();
        short opcion;
        int dato;
        int nodoBuscado;
        Scanner usuario = new Scanner(System.in);
        do {
            System.out.println("Lista ligada");
            System.out.println("1. Agregar un nodo al inicio");
            System.out.println("2. Agregar un nodo al final");
            System.out.println("3. Agregar un nodo en medio");
            System.out.println("4. Eliminar un nodo");
            System.out.println("5. Imprimir la lista");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");
            opcion = usuario.nextShort();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el dato: ");
                    dato = usuario.nextInt();
                    lista = objList.agregarInico(lista, dato);
                    break;
                case 2:
                    System.out.println("\nIngrese el dato: ");
                    dato = usuario.nextInt();
                    lista = objList.agregarFinal(lista, dato);
                    break;
                case 3:
                    System.out.println("\nIngrese un dato: ");
                    dato = usuario.nextInt();
                    System.out.println("\n¿Despues de cual nodo?");
                    nodoBuscado = usuario.nextInt();
                    lista = objList.agregarMedio(lista, dato, nodoBuscado);
                    break;

                case 4:
                    if (lista != null) {
                        System.out.println("\nIngrese el dato a eliminar: ");
                        nodoBuscado = usuario.nextInt();
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
        MainLista objMain = new MainLista();
        objMain.menu();
    }
}
