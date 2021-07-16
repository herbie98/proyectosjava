package act05;

import java.util.Scanner;

public class menu {

    private int opc1, opc2, opc3;

    public int Getopc1() {
        return opc1;
    }

    public int Getopc2() {
        return opc2;
    }

    public int Getopc3() {
        return opc3;
    }

    public menu() {
        opc1 = -1;
        opc2 = -1;
        opc3 = -1;

    }

    ////Menú principal
    public int menu02(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones de productos
        System.out.println("\n\n-----------------------------");
        System.out.println("---- " + titulo + " -----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver disponibilidad");
        System.out.println("3. Buscar producto por Id");
        System.out.println("4. Buscar producto por descripcion");
        System.out.println("5. Regresar");
        System.out.print("Selecciona una opcion: ");
        opc2 = Integer.valueOf(teclado.nextLine());

        return opc2;
    }

    //menu principal
    public int menu01(String titulo) {
        Scanner teclado = new Scanner(System.in);
        //imprime las opciones principales
        System.out.println("\n------------------------------");
        System.out.println("-----" + titulo + "------");
        System.out.println("1. clientes");
        System.out.println("2. productos");
        System.out.println("3. salir");
        System.out.print("Seleccione una opcion: ");
        opc1 = Integer.valueOf(teclado.nextLine());
        return opc1;
    }

    //submenu de agenda
    public int submenu02(String titulo) {
        Scanner teclado = new Scanner(System.in);
        //imprime las opciones de agenda
        System.out.println("\n------------------------------");
        System.out.println("-----" + titulo + "------");
        System.out.println("1. registrar cliente");
        System.out.println("2. ver lista de clientes");
        System.out.println("3. buscar cliente por id");
        System.out.println("4. buscar cliente por nombre");
        System.out.println("5. regresar");
        System.out.print("Seleccione una opcion: ");
        opc3 = Integer.valueOf(teclado.nextLine());
        return opc3;
    }

}
