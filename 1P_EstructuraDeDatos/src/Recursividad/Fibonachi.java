
package Recursividad;

public class Fibonachi {
    int contador;
    int a;
    
    public Fibonachi(){
        
    }
    public int Fibonacci(int a){
        if(a == 0 || a== 1){
            return 1;
        }
        return Fibonacci(a-1) + Fibonacci(a-2);
        
    }
    
  
    public static void main(String[] args){
        System.out.print("Fibonashi \n");
        Fibonachi obj = new Fibonachi();
        System.out.print(" | "+obj.Fibonacci(9));
    }
}
