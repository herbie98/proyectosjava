
package Actividad3;

import java.util.Scanner;


public class Actividad3 {
    private Scanner in = new Scanner(System.in);
    private int[][] A3 = new int [4][3];
    public Actividad3(){
        this.Actividad3();
    }
    
    private void Imprimir(int a[][]){
        for(int i = 0; i< a.length ;i++){
            System.out.print("| ");
            for(int j = 0; j< a[0].length ;j++)
                System.out.print("[ "+a[i][j]+" ]");
            System.out.print(" |\n");
        }
    }   
     private void Actividad3(){
        for(int i = 0; i< A3[0].length ;i++)
            for(int j = 0; j< A3.length ;j++){
                System.out.print("Dato ["+j+"]"+"["+i+"] ->>");
                A3[j][i] = in.nextInt();   
            }
        this.Imprimir(A3);
    }
    
     public static void main(String[] args){
        Actividad3 OBJ  = new Actividad3();
    }
}
