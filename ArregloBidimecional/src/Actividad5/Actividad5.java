
package Actividad5;

import java.util.Scanner;


public class Actividad5 {
    
    private int[][] A4 = new int [6][3];
    private Scanner in = new Scanner(System.in);
    
    public Actividad5(){
        this.Actividad5();
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
    
    private void Actividad5(){
       A4 = this.Leer(A4);
       int F = 0, i = 0,j = 0;
       this.Imprimir(A4);
       for( i = 0; i< A4.length ;i++){
            for( j = 0; j< A4[0].length ;j++){
                if((i%2)!=0)
                    F = A4[i][j]+F;                
            }
            if((i%2)!=0){
                System.out.print("Valor de la Fila # "+i+" : "+F+"\n");
                F = 0;
            }  
       }
    }
    
    public static void main(String[] args){
        Actividad5 OBJ  = new Actividad5();
    }
}
