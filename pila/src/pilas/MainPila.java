package pilas;

import java.util.Scanner;

public class MainPila {

    Nodo lista = null;

    public void menu() {
        Pila objpila = new Pila();

        short opcion;
        int dato;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("********PILA*********");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.Imprimir");
            System.out.println("4. salir");
            opcion = in.nextShort();
            switch (opcion) {
                case 1:
                    System.out.println("ingresar dato");
                    dato = in.nextInt();
                    lista = objpila.agregarFinal(lista, dato);
                    break;
                case 2:
                    if(lista != null){
                        lista = objpila.eliminar(lista);
                    }else{
                        System.out.println("lista vacia");
                    }
                    break;
                case 3:
                    objpila.imprimirLista(lista);
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);

    }

    public static void main(String[] args) {
        MainPila obMain = new MainPila();
        obMain.menu();
    }
}
