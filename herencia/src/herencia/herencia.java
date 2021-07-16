package herencia;
import java.util.Scanner;
public class herencia {
    public static void main(String[] args) {
        empleado empleado01 = new empleado();
        Scanner entrada = new Scanner (System.in);
        
        //asignar datos
        empleado01.setnumusuario("riley");
        empleado01.setcontrasenia("1234");
        empleado01.setnombre("timothy");
        empleado01.setapellidos("garcia arana");
        empleado01.setpuesto("cio");
        empleado01.setsueldo(35000);
        
        //pedimos datos de entrada del teclado con scanner
        String a,b;
        System.out.print("usuario: ");
        a = entrada.nextLine();
        System.out.println("contrasenia: ");
        b = entrada.nextLine();
        
        //metodo de validacion de contraseña
        if(empleado01.valida(a,b)){
            System.out.print("welcome...");
            if(empleado01.getpuesto().compareTo("cio") == 0){
                System.out.println("hello CIO welcome..");
            }
            System.out.print(empleado01.getnombre() + " ");
            System.out.println(empleado01.getapellidos());
        } else {
            System.out.println("los datos estan incorrectos...");
        }
    }
    
}
