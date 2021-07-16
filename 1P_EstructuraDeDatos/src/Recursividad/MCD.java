
package Recursividad;

public class MCD {
    
    public MCD(){
        
    }
    
    public int mcd(int a, int b){        
       if(b==0){      
           
            return a; 
            
        }else if(a==0)
        {            
            return b;
        }else if(a>=b){ 
            
            return mcd((a-b),b); 
            
        }else if(b>a){            
            return mcd(a,(b-a));
            
        }
        return 0;
    }
    
    
    
    public static void main(String[] args){
        MCD Obj = new MCD();
        System.out.print(" El Maximo Comun divisor de :"+Obj.mcd(24, 36));
    }
    
}
