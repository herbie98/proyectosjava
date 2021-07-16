
package Actividad4;

import java.util.Scanner;


public class Actividad4 {
    private Scanner in = new Scanner(System.in);
    private int[][] A3 = new int [4][3];
    public Actividad4(){
        this.Actividad4();
    }
    private void Imprimir(int a[][]){
        for(int i = 0; i< a.length ;i++){
            System.out.print("| ");
            for(int j = 0; j< a[0].length ;j++)
                System.out.print("[ "+a[i][j]+" ]");
            System.out.print(" |\n");
        }
    }   
     private void Actividad4(){
        int[] AU =  new int[12];
        int C = 0, i = 0,j = 0;
          for( i = 0; i< A3[0].length ;i++)
            for( j = 0; j< A3.length ;j++){
                System.out.print("Dato ["+j+"]"+"["+i+"] ->>");
                A3[j][i] = in.nextInt();   
                AU[C] = A3[j][i];
                C++;
            }
        this.Imprimir(A3);
        System.out.print("\n");
        for( i = 0; i< AU.length ;i++)
            System.out.print("["+AU[i]+"]");
    }
    public static void main(String[] args){
        Actividad4 OBJ  = new Actividad4();
    }
}
