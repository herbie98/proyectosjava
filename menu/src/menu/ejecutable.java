package menu;
import java.util.Scanner;

public class ejecutable {
        public static void main(String[] args) {
        menu menu = new menu();
        //Creamos las cuentas
        cuenta Cuenta01 = new cuenta("001","PESOS");
        cuenta Cuenta02 = new cuenta("002","DOLARES");
        cuenta Cuenta03 = new cuenta("003","EUROS");
        
         Scanner teclado = new Scanner(System.in);
        
        do {
            menu.menup("CARTERA DIGITAL");
            //Evalua la opcion
            switch(menu.Getopc1()) {
                
                    case 1: do {
                                menu.sub2("CUENTA EN PESOS"); 
                                //Evaluamos submenu
                                switch(menu.Getopc2()) {
                                    case 1: 
                                        System.out.println("\n--- DEPOSITO ----");
                                        System.out.print("Valor del DEPOSITO: $");
                                        Cuenta01.Deposito(Double.valueOf(teclado.nextLine()));                                        
                                        break;
                                    case 2:
                                        System.out.println("\n--- RETIRO ----");
                                        System.out.print("Valor del RETIRO: $");
                                        Cuenta01.Retiro(Double.valueOf(teclado.nextLine()));  
                                        break;
                                    case 3:
                                        System.out.println("\nDATOS DE CUENTA\n");
                                        System.out.println(Cuenta01.datos());
                                        break;                                       
                                }
                            }while(menu.Getopc2() != 4);
                     break;
            }            
            
        }while(menu.Getopc1() != 4);
    }
}