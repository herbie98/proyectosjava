
package Recursividad;


public class Ordenamiento {
    
    
    public Ordenamiento(){
        
    }
    public int[] Ondenamiento_(int a[],int b){
        if(a[0]<=a[1]){
            
            return a;
            
        }else if(a[b-1]<=a[b-2]){
            int aux =  a[b-1];
            a[b-1] = a[b-2];
            a[b-2] = aux;
        }
        return Ondenamiento_( a, b);    
    }
    
    public static void main(String[] args){
        int arreglos[] = new int[5];
         arreglos[0]= 14;
         arreglos[0]= 34;
         arreglos[0]= 42;
         arreglos[0]= 2334;
         arreglos[0]= 44;
        
        Ordenamiento Obj = new Ordenamiento();
        arreglos = Obj.Ondenamiento_(arreglos,5);
        for(int i = 0; i<5;i++){
            System.out.print(" | "+arreglos[i]+" | \n");
        }
    }
}
