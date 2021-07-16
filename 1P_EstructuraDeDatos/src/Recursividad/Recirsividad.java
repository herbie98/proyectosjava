
package Recursividad;

public class Recirsividad {
    
    public Recirsividad(){
        this.Recursivo(1);
    }
    private void Recursivo(int a){        
        System.out.print("Antes ...."+a+"\n");        
        if ( a<= 5 ){            
            this.Recursivo(++a);
        }
        System.out.print("Despues .... "+a+"\n");
        
       
    }
            
    public static void main(String[] args){
        Recirsividad Obj = new Recirsividad();
    }
}
