
package Actividad2;

import java.util.Scanner;

public class Actividad2 {
    private Scanner in = new Scanner(System.in);
    private int[][] A2 = new int [5][2];
    
    public Actividad2(){
        this.Actividad2();
    }
    
   
    
     private int[][] Leer(int a[][]){
        for(int i = 0; i< a.length ;i++)
            for(int j = 0; j< a[0].length ;j++){
                System.out.print("Dato ["+i+"]"+"["+j+"] ->>");
                a[i][j] = in.nextInt();   
            }
        return a;
    }
    private void Imprimir(int a[][]){
        for(int i = 0; i< a.length ;i++){
            System.out.print("| ");
            for(int j = 0; j< a[0].length ;j++)
                System.out.print("[ "+a[i][j]+" ]");
            System.out.print(" |\n");
        }
    }    
    private void Actividad2(){
        A2 = this.Leer(A2); 
        Imprimir(A2);
        int C= 0, F= 0 ,i = 0,j=0;
        // Sumas de FIlas
        for( i = 0; i< A2.length ;i++){  
            for( j = 0; j< A2[0].length ;j++){
                F = A2[i][j]+F;   
            }           
            System.out.print(" Suma de la Fila # "+i+" : "+F+"\n");
            F = 0;  
        }
        // Sumas De Columnas
        for( i = 0; i< A2[0].length ;i++){
            for( j = 0; j< A2.length ;j++)
                 C = A2[j][i]+C; 
            System.out.print(" Suma de la Columna # "+i+" : "+C+"\n");
            C = 0;
         }            
    }
    
     public static void main(String[] args){
        Actividad2 OBJ  = new Actividad2();
    }
}
