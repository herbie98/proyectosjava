package act05;

import java.util.Scanner;

public class Act05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        producto temp = new producto();
        menu opciones = new menu();
        bodega miarreglo = new bodega();
        cliente tempcl = new cliente();
        agenda arreglocl = new agenda();

        do {
            System.out.println(opciones.menu01("MENU PRINCIPAL HEXAMILK"));
            switch (opciones.Getopc1()) {
                case 1:
                    do {
                        System.out.println(opciones.submenu02("CLIENTES"));
                        switch (opciones.Getopc3()) {
                            case 1:
                                System.out.print("Id cliente: ");
                                tempcl.setId(teclado.nextLine());
                                System.out.print("nombre: ");
                                tempcl.setNombre(teclado.nextLine());
                                System.out.print("numero celular: ");
                                tempcl.setCelular(teclado.nextLine());
                                System.out.println("Email: ");
                                tempcl.setEmail(teclado.nextLine());
                                arreglocl.inserta(tempcl);
                                break;
                            case 2:
                                System.out.println("\n\n");
                                System.out.println(arreglocl.extrae());
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println("\n\n");
                                System.out.print("id del cliente: ");
                                System.out.println(arreglocl.busca(teclado.nextLine()));
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println("\n\n");
                                System.out.print("nombre del cliente: ");
                                System.out.println(arreglocl.consulta(teclado.nextLine()));
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println("-------salio del menu cliente----------");
                                break;
                            default:
                                System.out.println("la opcion no es valida vuelva a intentar");
                                break;
                        }
                    } while (opciones.Getopc3() != 5);
                    break;
                case 2:
                    do {
                        System.out.println(opciones.menu02("PRODUCTOS LACTEOS"));
                        switch (opciones.Getopc2()) {
                            case 1:
                                System.out.print("Id: ");
                                temp.setId(teclado.nextLine());
                                System.out.print("Descripcion: ");
                                temp.setDescripcion(teclado.nextLine());
                                System.out.print("Cantidad: ");
                                temp.setCantidad(teclado.nextInt());
                                miarreglo.inserta(temp);
                                break;
                            case 2:
                                System.out.println("\n\n");
                                System.out.println(miarreglo.existencia());
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println("\n\n");
                                System.out.print("id del producto: ");
                                System.out.println(miarreglo.busca(teclado.nextLine()));
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println("\n\n");
                                System.out.print("descripcion del producto: ");
                                System.out.println(miarreglo.consulta(teclado.nextLine()));
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println("-----------salio del menu productos----------");
                            default:
                                System.out.println("la opcion no es valida vuelva a intentar");
                                break;
                        }

                    } while (opciones.Getopc2() != 5);
                    break;
                case 3:
                    System.out.println("--------salio del software--------");
                    System.out.println("hasta la proxima................");
                default:
                    System.out.println("la opcion no es valida vuelva a intentar");
                    break;
            }
        } while (opciones.Getopc1() != 3);

    }
}
