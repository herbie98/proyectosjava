package colas;

import java.util.Scanner;

public class Maincola {

    Nodo lista = null;

    public void menu() {
        colass objpila = new colass();

        short opcion;
        int dato;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("********Cola*********");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.Imprimir");
            System.out.println("4. salir");
            opcion = in.nextShort();
            switch (opcion) {
                case 1:
                    System.out.println("ingresar dato");
                    dato = in.nextInt();
                    lista = objpila.agregarInicio(lista, dato);
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
        Maincola obMain = new Maincola();
        obMain.menu();
    }
}
