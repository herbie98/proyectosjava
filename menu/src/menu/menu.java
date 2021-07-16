package menu;
import java.util.Scanner;

public class menu {
    private int opc1;
    private int opc2;
    
    public int Getopc1(){
        return opc1;
    }
    public int Getopc2(){
        return opc2;
    }
    
    public menu(){
        opc1 = -1;
        opc2 = -1;
    }
    
    ////Menú principal
    public int menup(String titulo){
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("---- " + titulo + " -----");
        System.out.println("1. Pesos");
        System.out.println("2. Dolar");
        System.out.println("3. Euro");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opcion: ");
        opc1 = Integer.valueOf(teclado.nextLine());
        
        return opc1;
    }
    
    public int sub2(String titulo){
        Scanner teclado = new Scanner(System.in);
        ///Imprime las opciones
        System.out.println("\n\n-----------------------------");
        System.out.println("---- " + titulo + " -----");
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Ver Saldo");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opcion: ");
        opc2 = Integer.valueOf(teclado.nextLine());
        
        return opc2;
    }
}
