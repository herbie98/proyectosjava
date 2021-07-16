package arreglos;

import java.util.Scanner;

public class menu {

    private int opc1;

    public int Getopc1() {
        return opc1;
    }

    public menu() {
        opc1 = -1;
    }

    ////Menú principal
    public int menu01(String titulo) {
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("---- " + titulo + " -----");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Ver Todos los Datos");
        System.out.println("3. Buscar por Id");
        System.out.println("4. Consulta por Nombre");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opcion: ");
        opc1 = Integer.valueOf(teclado.nextLine());

        return opc1;
    }

}