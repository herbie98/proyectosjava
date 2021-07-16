
package Actividad6;

import java.util.Scanner;


public class Actividad6 {
    private Scanner in = new Scanner(System.in);
    private char[][] A5 = new char [10][10];
    public Actividad6(){
        this.Actividad6();
    }
    private void A5_(){
         for(int i = 0; i< A5.length ;i++)
            for(int j = 0; j< A5[0].length ;j++)
              A5[i][j] = ' ';
    }
    private void Actividad6(){
        int B = 0, D = 0, i= 0, j= 0, C = 1;
        System.out.println("Dame Dato  de 1  a 10: "); 
               do{
                   B = 0;
                   D = in.nextInt();
                   if(D>= 1 && D<= 10)                        
                       B = 1;
                   else
                       System.out.println("Valor no admintido"); 
               }while(B != 1);
        for( i = 0 ;i< D; i++ ){
            do{
                 A5[i][j] = '*';
                 j++;
            }while(j!=C);
            C++;
            j = 0;
        }
        for( i = 0; i< A5.length ;i++){
            System.out.print("| ");
            for( j = 0; j< A5[0].length ;j++)
                System.out.print("[ "+A5[i][j]+" ]");
            System.out.print(" |\n");
        }
         A5_();
    }
    
    public static void main(String[] args){
        Actividad6 OBJ  = new Actividad6();
    }
}
