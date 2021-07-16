
package Actividad1;

import java.util.Scanner;

public class Actividad1 {
    private Scanner in = new Scanner(System.in);
    private int[][] A1 = new int [4][4];
    
    public Actividad1(){
        this.Actividad();
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
    private void Actividad(){
        A1 = Leer(A1);
        this.Imprimir(A1);
        int j = 0,R = 0;
        for(int i = 0; i< A1.length ;i++){
           R = A1[i][j] +R; 
           j++;        
        }
        System.out.print("| Suma de la Diagona es "+R+"\n");   
    }  
    
    public static void main(String[] args){
        Actividad1 OBJ  = new Actividad1();
    }
}
