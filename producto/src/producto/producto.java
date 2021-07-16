package producto;

import java.util.Scanner;

public class producto {

    public static void main(String[] args) {

        //Creacion en un solo paso
        electrodomestico pc = new electrodomestico();
        electrodomestico smartTV = new electrodomestico();
        perecedero leche = new perecedero();
        perecedero yoghurt = new perecedero();
        menu menu1 = new menu();
        
        String nombre, marca, normas, garantia, fechacaducidad;
        String nombre2, marca2, normas2, garantia2, fechacaducidad2;
        double precio, pesounidad;
        double precio2, pesounidad2;
        int cantidad;
        int cantidad2;

        Scanner sc = new Scanner(System.in);
        do {
            menu1.menup("menu principal");
            //Evalua la opcion
            switch (menu1.Getopc1()) {

                case 1:
                    do {
                        menu1.sub2("---------percederos------------");
                        //Evaluamos submenu
                        switch (menu1.Getopc2()) {
                            case 1:
                                System.out.println("escriba el nombre del producto");
                                nombre =sc.nextLine();
                                leche.setnombre(nombre);
                                System.out.println("escriba la marca");
                                marca =sc.nextLine();
                                leche.setmarca(marca);
                                System.out.println("teclee el precio");
                                precio =sc.nextDouble();
                                leche.setprecio(precio);
                                System.out.println("teclee la cantidad de producto por unidad");
                                cantidad =sc.nextInt();
                                leche.setcantidad(cantidad);
                                System.out.println("escriba la fecha de caducidad");
                                fechacaducidad =sc.nextLine();
                                leche.setfechacaducidad(fechacaducidad);
                                System.out.println("teclee el peso por ml/gr");
                                pesounidad =sc.nextDouble();
                                leche.setpesounidad(pesounidad);
                                break;
                            case 2:
                                System.out.println("datos del producto");
                                System.out.println("nombre: "+leche.getnombre());
                                System.out.println("marca: "+leche.getmarca());
                                System.out.println("precio: "+leche.getprecio());
                                System.out.println("cantidad: "+leche.getcantidad());
                                System.out.println("fecha de caducidad: "+leche.getfechacaducidad());
                                System.out.println("peso ml/gr: "+leche.getpesounidad());
                                break;
                            case 3:
                                System.out.println("salio de percederos");
                                break;
                            default:
                                System.out.println("la opcion no esta disponible elija otra");
                                break;
                        }
                    } while (menu1.Getopc2() != 3);
                    break;

                case 2:
                    do {
                        menu1.sub2("-----------electrodomesticos--------------");
                        //Evaluamos submenu
                        switch (menu1.Getopc2()) {
                            case 1:
                                System.out.println("escriba el nombre del producto");
                                nombre2 =sc.nextLine();
                                pc.setnombre(nombre2);
                                System.out.println("escriba la marca");
                                marca2 =sc.nextLine();
                                pc.setmarca(marca2);
                                System.out.println("teclee el precio");
                                precio2 =sc.nextDouble();
                                pc.setprecio(precio2);
                                System.out.println("teclee la cantidad de producto por unidad");
                                cantidad2 =sc.nextInt();
                                pc.setcantidad(cantidad2);
                                System.out.println("escriba la norma de condicion");
                                normas2 =sc.nextLine();
                                pc.setnormas(normas2);
                                System.out.println("escriba la garantia");
                                garantia2 =sc.nextLine();
                                pc.setgarantia(garantia2);
                                break;
                            case 2:
                                System.out.println("datos del producto");
                                System.out.println("nombre: "+pc.getnombre());
                                System.out.println("marca: "+pc.getmarca());
                                System.out.println("precio: "+pc.getprecio());
                                System.out.println("cantidad: "+pc.getcantidad());
                                System.out.println("normas: "+pc.getnormas());
                                System.out.println("garantia: "+pc.getgarantia());
                                break;
                            case 3:
                                System.out.println("salio de electrodomesticos");
                                break;
                            default:
                                System.out.println("la opcion no esta disponible elija otra");
                                break;
                        }
                    } while (menu1.Getopc2() != 3);
                    break;
                case 3:
                    System.out.println("hasta la proxima........");
                    break;
                default:
                    System.out.println("la opcion no esta disponible elija otra");
                    break;
            }

        } while (menu1.Getopc1() != 3);
    }
}
