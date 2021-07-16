package arreglos;

import java.util.Scanner;

public class vista {

    public static void main(String[] args) {
        modelo temp = new modelo();

        Scanner teclado = new Scanner(System.in);

        //Objeto bodega
        bodega miArreglo = new bodega();

        temp.setId("2118100636");
        temp.setNombre("Ricardo Daniel");
        temp.setCel("3030 0910");
        temp.setEmail("rdaniel@utj.edu.mx");

        miArreglo.inserta(temp);
        
        menu miMenu = new menu();

        do {
            System.out.println(miMenu.menu01("AGENDA COMERCIAL"));
            switch (miMenu.Getopc1()) {
                case 1:
                    System.out.print("Id: ");
                    temp.setId(teclado.nextLine());
                    System.out.print("Nombre: ");
                    temp.setNombre(teclado.nextLine());
                    System.out.print("Celular: ");
                    temp.setCel(teclado.nextLine());
                    System.out.print("Email: ");
                    temp.setEmail(teclado.nextLine());
                    miArreglo.inserta(temp);
                    break;
                case 2:
                    System.out.println("\n\n");
                    System.out.println(miArreglo.extrae());
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("\n\n");
                    System.out.print("Id a Buscar: ");
                    System.out.println(miArreglo.busca(teclado.nextLine()));
                    System.out.println("\n\n");
                    break;
                case 4:
                    System.out.println("\n\n");
                    System.out.print("Nombre a Buscar: ");
                    System.out.println(miArreglo.consulta(teclado.nextLine()));
                    System.out.println("\n\n");
                    break;
                default :
                    System.out.println("seleccione un numero, vuelva a intentar");
                    break;
            }

        } while (miMenu.Getopc1() != 5);

    }
}