package Recursividad;


public class Factorial {
    
    public Factorial(){
    }
    
    public double FactorialAlgoridmo(double x){        
        if (x == 0){
            return 1;
        }
        return (x = x *  FactorialAlgoridmo(x-1));
    }
    
    public double PotenciaAlgoridmo(double x,double n){        
        if (n == 0){
            return 1;
        }
        return (x = x * (PotenciaAlgoridmo(x,n-1)));
    }
     
    public double SumaAlgoridmo(double x){             
         if (x == 0){
            return 0;
        }
        return ( x + SumaAlgoridmo(x-1));
    }
    
    public double ArregloAlgoridmo(double x[],int a){   
         if (a == 0){
            return 0;
        }
        return ( x[a-1] + ArregloAlgoridmo(x,a-1));
    }
    
    public double MultiplicacionAlgoridmo(double a,double b){   
         if (b == 0){
            return 0;
        }
        return ( a + MultiplicacionAlgoridmo(a,b-1));
    }   
      
    public static void main(String[] args){
        Factorial Obj = new Factorial();
        System.out.print(" Factorial de 5 es "+Obj.FactorialAlgoridmo(5)+"\n");
        System.out.print(" Potencia  de 3 es "+Obj.PotenciaAlgoridmo(3, 3)+"\n");
        System.out.print(" Suma  de 100 es "+Obj.SumaAlgoridmo(10)+"\n");        
        double Arreglo[] = {15,2,8,20,10};
        System.out.print(" Suma  Arreglo es "+Obj.ArregloAlgoridmo(Arreglo, 5)+"\n");
        System.out.print(" Multiplicacion  es "+Obj.MultiplicacionAlgoridmo(5,5)+"\n");
    }
}
