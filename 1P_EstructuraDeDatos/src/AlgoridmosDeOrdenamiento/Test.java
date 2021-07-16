
package AlgoridmosDeOrdenamiento;

import java.util.Scanner;


public class Test {
    
    private int opc;
    private Scanner in = new Scanner(System.in);
    private int[] Areglos = new int[10];
    public Test(){
        this.opc = 0;
          for(int i = 0; i< this.Areglos.length; i++)
               this.Areglos[i] = 0; 
        this.inicio();
    }
    private void inicio(){
      
        do{  
            System.out.print(
                      "::::::::::::::::::::::::::::::::::"
                    + "1 - Burbuja \n"
                    + "2 - Selection \n"
                    + "3 - insercion  \n"
                    + "4 - Shell \n"
                    + "7 - Salir \n"
                    + "::::::::::::::::::::::::::::::::::");
            this.opc = in.nextInt();
            
            switch(opc){
                case 1:{   this.Burbuja();  break;    }
                case 2:{   this.Selection();  break;    }
                case 3:{   this.ALgoridmoInsersion();  break;    }
                case 4:{   this.ALgoridmoShell();  break;    }
                case 7:{   break;    }
                default:{ System.out.println("opcion invalido");  break;    }
                
            }
        }while(opc != 7);
    }
   
    private int[] Shell(int a[]){
       int salto, aux, i;
       boolean cambios;
       for(salto=a.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ // Mientras se intercambie algún elemento
                cambios=false;
                for(i=salto; i< a.length; i++) // se da una pasada
                   if(a[i-salto]>a[i]){ // y si están desordenados
                        aux=a[i]; // se reordenan
                        a[i]=a[i-salto];
                        a[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
                }
            }  
       return a;
    }
    private void ALgoridmoShell(){
        this.captura();
        this.Areglos = this.Shell(this.Areglos);
        this.Imprimir();
    }
    
    private int[] Insersion(int a[]){
          
        int pivote = 1,i = 0,j=0, aux = 0;
        for(i= 0; i<a.length-1;i++){            
            for(j = pivote; j>=1;j--){                
                if (a[j] <= a[j-1]  ){
                    aux = a[j];
                    a[j] = a[j-1];
                    a[j-1] = aux;
                }else{ j= 0; }
            }
            this.Imprimir();
            pivote++;
            System.out.print(pivote);
        }
        return a;
        
    }
    private void ALgoridmoInsersion(){
        this.captura();
        this.Areglos = this.Insersion(this.Areglos);
        this.Imprimir();
    }
    
    private void Burbuja(){
        this.captura();
        this.Areglos = this.AlgBurubuja(Areglos);
        this.Imprimir();
    }
    private int[] AlgBurubuja(int a[]){
        int i, j,aux = 0;
        for(i = 0; i < a.length ;i++)
             for(j = 0; j<(a.length -1);j++){
                   if(a[j] > a[j+1]){
                       aux = a[j];
                       a[j] = a[j+1];
                       a[j+1] = aux;
                   }
                   
             }
        return a;
    } 
    
    private void Selection(){
        this.captura();
        this.Areglos = this.AlgSeleccion(this.Areglos);
        this.Imprimir();
    }
    private int[] AlgSeleccion(int a[]){
        int pivote = 0, j=0, posMenor = 0,tmp = 0;
        for(pivote=0 ; pivote <a.length; pivote++){
            posMenor = pivote;
            for(j = pivote; j<a.length;j++){
                if(a[posMenor] > a[j])
                    posMenor = j;
            }
            tmp = a[pivote];
            a[pivote] = a[posMenor];
            a[posMenor] = tmp;
        }
        return a;
    }
    
    private void captura(){
         for(int i = 0; i< this.Areglos.length; i++){
               System.out.print(" Dame un numero ->>  ");        
               this.Areglos[i] = in.nextInt();
         }
    }
    private void Imprimir(){
        for(int i = 0; i< this.Areglos.length; i++)
               System.out.print(" |"+this.Areglos[i]+" |\n");
    }
    public static void main(String[] args){ Test Onj = new Test();  }
}