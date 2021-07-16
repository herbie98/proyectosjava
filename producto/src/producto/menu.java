package producto;

import java.util.Scanner;

public class menu {

    private int opc1, opc2, opc3, opc4;

    public int Getopc1() {
        return opc1;
    }

    public int Getopc2() {
        return opc2;
    }

    public int getOpc3() {
        return opc3;
    }

    public int getOpc4() {
        return opc4;
    }

    public int menup(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("1. percederos");
        System.out.println("2. electrodomesticos");
        System.out.println("3. Salir");
        System.out.println("seleccione una opcion");
        opc1 = Integer.valueOf(teclado.nextLine());

        return opc1;
    }

    public int sub2(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("1. agregar datos");
        System.out.println("2. Ver");
        System.out.println("3. regresar");
        opc2 = Integer.valueOf(teclado.nextLine());

        return opc2;
    }

    public int percederos(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("presione 1 para regresar");
        opc3 = Integer.valueOf(teclado.nextLine());

        return opc3;
    }

    public int electrodomesticos(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("presione 1 para regresar");
        opc4 = Integer.valueOf(teclado.nextLine());

        return opc4;
    }
}
