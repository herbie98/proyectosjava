
package PracaticaArreglos;

import java.util.Scanner;

public class Arreglos {
    private int [] Act = new int [5];
    private int [] Act1 = new int [5];
    private int [] Act2 = new int [5];
    private int [] Act3 = new int [10];
    private int [] Act4 = new int [20];
    private int [] Act5 = new int [20];
    private int [] Act6 = new int [20];
    
    private Scanner teclado = new Scanner(System.in);
    
    public Arreglos(){
        for(int i = 0; i<5; i++){
            this.Act[i] = 0;        
        }
        for(int i = 0; i<Act4.length; i++){
            this.Act4[i] = 0; 
            this.Act6[i] = 11;
            this.Act5[i] = 11;  
        }
        this.Inicio();
    }
    public void Inicio(){
        int opc = 0;
        do{
            System.out.print(
                      "::::::::::::::::::::::::::::::\n"
                    + "| 1 - Practica 1|\n"
                    + "| 2 - Practica 2|\n"
                    + "| 3 - Practica 3|\n"
                    + "| 4 - Practica 4|\n"
                    + "| 5 - Practica 5|\n"
                    + "| 6 - Practica 6|\n"
                    + "| 7 - Practica 7|\n"
                    + "| 8 - Practica 8|\n"
                    + "| 9 - Salir     |\n"); 
            opc = teclado.nextInt();
            switch(opc){
                case 1:{  this.Practica_1_(); break;  }
                case 2:{  this.Practica_2_(); break;  }
                case 3:{  this.Practica_3_(); break;  }
                case 4:{  this.Practica_4_(); break;  }
                case 5:{  this.Practica_5_(); break;  }
                case 6:{  this.Practica_6_(); break;  }
                case 7:{  this.Practica_7_(); break;  }
                case 8:{  this.Practica_8_(); break;  }
                case 9:{  break;  }
                default:{ System.out.println("opcion invalido"); break;  }
            }
        }while(opc!=9);
    }
    
    private  void LlenarArreglos(){
         for(int i = 0; i<5; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Act[i] = teclado.nextInt();
         }
    }
    private  void LlenarArreglos1(){
         for(int i = 0; i<5; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Act1[i] = teclado.nextInt();
         }
    }
    private  void LlenarArreglos3(){
        int badera = 0;
         for(int i = 0; i<Act4.length; i++){
             System.out.println("Dame Dato  de -10  a 10: "+(i+1)); 
               do{
                   badera = 0;
                   this.Act4[i] = teclado.nextInt();
                   if(this.Act4[i]>= -10 && this.Act4[i]<= 10){
                         if(this.Act4[i]>= -10 && this.Act[i]<= -1){
                         this.Act5[i] = Act4[i];
                         }else{
                              this.Act6[i] = Act4[i];
                         }
                       badera = 1;
                   }else{
                       System.out.println("Valor no admitido"); 
                   }
               }while(badera != 1);
         }
    }
    private  void LlenarArreglos2(){
         for(int i = 0; i<10; i++){
             System.out.println("Dame Dato : "+(i+1)); 
               this.Act3[i] = teclado.nextInt();
         }
    }
    
    private void Practica_1_(){
        this.LlenarArreglos();
         for(int i = 0; i<5; i++){
             System.out.println("Dato # "+(i+1)+ " -> "+this.Act[i]); 
         }
          this.Act = Ordenamiento(this.Act);
          System.out.println("Dato  mas grande # "+ this.Act[4]); 
    }
    private void Practica_2_(){
        this.LlenarArreglos();
          for(int i = 0; i<5; i++){
             if((this.Act[i]%2) == 0){
                 System.out.println("Dame Dato : "+(i+1)+" | "+this.Act[i] +" es par"); 
             }else {
                  System.out.println("Dame Dato : "+(i+1)+" | "+this.Act[i] +" es inpar"); 
             }
         }
    }
    private void Practica_3_(){
        this.LlenarArreglos();
         System.out.println(" Dame Dato a buscar  ");
        int aux = teclado.nextInt();
        boolean badeta = true;
         for(int i = 0; i<5; i++){
             if(this.Act[i] == aux){
                 System.out.println("El datos que buscas se encuantra en la posicion : "+1+" | "+this.Act[i] +" |"); 
                 badeta = false;
             }
         }
         if(badeta == true) {
             System.out.println(" el dato no esta en el arreglo  "+aux);
         }
    }
    private void Practica_4_(){
        this.LlenarArreglos();
        this.LlenarArreglos1();
         for(int i = 0; i<5; i++){
             this.Act2[i] = this.Act[i] + this.Act1[i];
             System.out.println("Duma  # "+(i+1)+ " -> "+this.Act[i]+" + "+this.Act1[i]+ " = "+this.Act2[i]); 
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
                 if(this.Act3[i] == this.Act3[j] ) {   
                     aux ++;                           
                 }  
             }          
            if( mayor  <  aux){                
                 mayor =  aux;
                posicion = this.Act3[i];
            }
           
         }
        System.out.print(" EL numero que mas veces se repite es : "+posicion+" se repite : "+mayor);
        
    }
    private void Practica_6_(){
        this.LlenarArreglos3();
        int i = 0;
        for(i = 0;i<Act4.length; i++){
           System.out.println("| Valor # |"+(i+1)+" : "+Act4[i]); 
        } 
        System.out.println("| Valores Negativos "); 
        for(i = 0;i<Act.length; i++){
           if(Act5[i]<= -1 && this.Act5[i]<11)
               System.out.println("| Valor # |"+(i+1)+" : "+Act5[i]); 
        } 
        System.out.println("| Valores positivos "); 
        for(i = 0;i<Act6.length; i++){
           if(Act6[i]>= 0 &&this.Act6[i]<11)
               System.out.println("| Valor # |"+(i+1)+" : "+Act6[i]); 
        } 
    }
    private void Practica_7_(){//no me funciono
        this.LlenarArreglos();
    }
    private void Practica_8_(){
        String Palindrimo;
        System.out.print(" escribe una palabra \n");
        Palindrimo =  teclado.next();
        boolean bandera = false;
        int N = Palindrimo.length();
        for (int i = 0; i < N/2; i++)   
            if (Palindrimo.charAt(i) != Palindrimo.charAt(N-1-i))
                bandera = true;
            
       if(bandera == true){
                System.out.print(" no es Palintromo \n");
           }else{
             System.out.print(" Palintromo \n");
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
    public static void main(String[] args){Arreglos objeto = new Arreglos();}
}
