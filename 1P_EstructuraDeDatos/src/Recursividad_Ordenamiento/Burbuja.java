package Recursividad_Ordenamiento;


public class Burbuja {
    
    public Burbuja(){
        
    }
    public int[] Ordenamiento(int arreglo[]){
        int aux = 0;
        boolean Ban = true;
        for(int i = 0 ; i<(arreglo.length-1) ; i++){            
            if(arreglo[i+1] < arreglo[i] ){
                 aux = arreglo[i+1];
                 arreglo[i+1] =  arreglo[i];
                 arreglo[i] = aux;         
                 Ban = false;
            }            
        }
        if(Ban == true){
            arreglo = Ordenamiento(arreglo);
        }
       return arreglo;
        
    }
    
    public int[] Ordenamiento2(int arreglo[], int a, int b){
        int aux = 0;
        if(a==0){
            return arreglo;
        }else if(b>0){
            if(arreglo[b-1] < arreglo[b] ){
                 aux = arreglo[b-1];
                 arreglo[b-1] =  arreglo[b];
                 arreglo[b] = aux;                  
            }
            return (arreglo = Ordenamiento2(arreglo, a,b-1));
        }else if(a>0){            
            return (arreglo = Ordenamiento2(arreglo, a-1,arreglo.length-1));
        }
        return arreglo;
    }
            
    public static void main(String[] args){        
         int[] Arreglo = {12,43,45,65,45,6534,4,12,76,7,345,5,-3,-65,-754,-32};     
        for(int i = 0; i<Arreglo.length; i++){
            System.out.print(" | "+Arreglo[i]+" | ");
        }
        System.out.print("\n ");
        Burbuja Burbuja_ = new Burbuja();
        Arreglo =  Burbuja_.Ordenamiento(Arreglo);
         for(int i = 0; i<Arreglo.length; i++){
            System.out.print(" | "+Arreglo[i]+" | ");
        }
       System.out.print("\n -----------------------------------------------------------------------------\n");
         /*#######################################################*/
        int[] Arreglo1 = {12,43,45,65,45,6534,4,12,76,7,345,5,-3,-65,-754,-32};     
        for(int i = 0; i<Arreglo1.length; i++){
            System.out.print(" | "+Arreglo1[i]+" | ");
        }
        System.out.print("\n ");
        Arreglo1 =  Burbuja_.Ordenamiento2(Arreglo1,15,15);
         for(int i = 0; i<Arreglo1.length; i++){
            System.out.print(" | "+Arreglo1[i]+" | ");
        }
    }
}
