
package oscar;

import java.util.Scanner;

public class Arreglos {
    private int [] Arreglo = new int [5];//declarar un objeto con una reserva de espacio con 5
    private int [] Arreglo1 = new int [5];//igul que el caso anterior
    private int [] Arreglo2 = new int [5];
    private int [] Arreglo3 = new int [10];//en este caso con una reserva de espacio de 10
    private int [] Arreglo4 = new int [20];//reserva 20
    private int [] Arreglo5 = new int [20];//igual a reserva 20
    private int [] Arreglo6 = new int [20];
    private int [] Arreglo7 = new int [20];
    private int [] Arreglo9 = new int [20];
    
    private Scanner in = new Scanner(System.in);//declarar la entrada como in en el teclado
    
    public Arreglos(){
        for(int i = 0; i<5; i++){
            this.Arreglo[i] = 0;        
        }
        for(int i = 0; i<Arreglo4.length; i++){
            this.Arreglo4[i] = 0; 
            this.Arreglo6[i] = 0;  
            this.Arreglo5[i] = 0;  
        }
        this.Inicia();
    }
    public void Inicia(){
        int opc = 0;
        do{
            System.out.print(//menu principal
                      "Practica 1\n"
                    + "Practica 2\n"
                    + "Practica 3\n"
                    + "Practica 4\n"
                    + "Practica 5\n"
                    + "Practica 6\n"
                    + "Practica 7\n"
                    + "Practica 8\n"
                    + "Practica 9 insercion\n");
            opc = in.nextInt();//opcion a ingresar
            switch(opc){
                case 1:{  this.Practica_1_(); break;  }//caso 1
                case 2:{  this.Practica_2_(); break;  }//caso 2
                case 3:{  this.Practica_3_(); break;  }//caso etc...
                case 4:{  this.Practica_4_(); break;  }
                case 5:{  this.Practica_5_(); break;  }
                case 6:{  this.Practica_6_(); break;  }
                case 7:{  this.Practica_7_(); break;  }
                case 8:{  this.Practica_8_(); break;  }
                case 9:{  this.Insertion_sort(); break;  }
                default:{ System.out.println("opcion invalida intentar de nuevo"); break;  }//opcion en caso de invalido
            }
        }while(opc!=9);
    }
    private  void LlenarArreglos(){
         for(int i = 0; i<5; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Arreglo[i] = in.nextInt();
         }
    }
    private  void LlenarArreglos1(){
         for(int i = 0; i<5; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Arreglo1[i] = in.nextInt();
         }
    }
    private  void LlenarArreglos3(){
        int bandera = 0;
         for(int i = 0; i<Arreglo4.length; i++){
             System.out.println("Dame Dato  de -10  a 10: "+(i+1)); 
               do{
                   bandera = 0;
                   this.Arreglo4[i] = in.nextInt();
                   if(this.Arreglo4[i]>= -10 && this.Arreglo4[i]<= 10){
                       bandera = 1;
                   }else{
                       System.out.println("Valor no admintido"); 
                   }
               }while(bandera != 1);
         }
    }
    private  void LlenarArreglos2(){
         for(int i = 0; i<10; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Arreglo3[i] = in.nextInt();
         }
    }
    private void Practica_1_(){
        this.LlenarArreglos();
         for(int i = 0; i<5; i++){
             System.out.println("Dato # "+(i+1)+ " -> "+this.Arreglo[i]); 
         }
          this.Arreglo = Ordenamiento(this.Arreglo);
          System.out.println("Dato  mas grande # "+ this.Arreglo[4]); 
    }
    private void Practica_2_(){
        this.LlenarArreglos();
          for(int i = 0; i<5; i++){
             if((this.Arreglo[i]%2) == 0){
                 System.out.println("Dame Dato : "+(i+1)+" | "+this.Arreglo[i] +" es par"); 
             }else {
                  System.out.println("Dame Dato : "+(i+1)+" | "+this.Arreglo[i] +" es inpar"); 
             }
         }
    }
    private void Practica_3_(){
        this.LlenarArreglos();
         System.out.println(" Dame Dato a buscar  ");
        int aux = in.nextInt();
        boolean bandera = true;
         for(int i = 0; i<5; i++){
             if(this.Arreglo[i] == aux){
                 System.out.println("El datos que buscavas se encuantra en la posicion : "+1+" | "+this.Arreglo[i] +" |"); 
                 bandera = false;
             }
         }
         if(bandera == true) {
             System.out.println(" Dato No esta en el arreglo  "+aux);
         }
    }
    private void Practica_4_(){
        this.LlenarArreglos();
        this.LlenarArreglos1();
         for(int i = 0; i<5; i++){
             this.Arreglo2[i] = this.Arreglo[i] + this.Arreglo1[i];
             System.out.println("Duma  # "+(i+1)+ " -> "+this.Arreglo[i]+" + "+this.Arreglo1[i]+ " = "+this.Arreglo2[i]); 
         }
        
    }
    private void Practica_5_(){
        this.LlenarArreglos2();
        int aux = 0;
        int mayor = 0;
        int posicion = 0;
        int i,j = 0;
        for( i = 0; i<10; i++){                
             aux = 0;
            for( j = 0; j<10; j++){
                 if(this.Arreglo3[i] == this.Arreglo3[j] ) {   
                     aux ++;                           
                 }  
             }          
            if( mayor  <  aux){                
                 mayor =  aux;
                posicion = this.Arreglo3[i];
            }
         }
        System.out.print(" EL numero que mas se repite es: "+posicion+"Se Repite : "+mayor);
        
    }
    private void Practica_6_(){
        this.LlenarArreglos3();
         for(int i = 0; i<Arreglo4.length; i++){
             
        }
    }
    private void Practica_7_(){
        this.LlenarArreglos();
    }
    private void Practica_8_(){
        
    }
    private void Insertion_sort(){
    int i, j;
    int actual;
    for (i = 1; i < 20; i++) {
        actual = t[i];
        for (j = i; j > 0 && t[j - 1] > actual; j--) {
            t[j] = t[j - 1];
        }
        t[j] = actual;
    }
}
    private int[] Ordenamiento(int a[]){
        int aux = 0;
        for(int j = 0; j<4; j++){
            for(int i = 0; i<4; i++){
                 if (a[i] > a[i+1]){
                     aux = a[i];
                     a[i] = a[i+1];
                     a[i+1] = aux;
                 }
              }             
         }
        return a;
    }
    public static void main(String[] args){Arreglos Obj = new Arreglos();}
}
