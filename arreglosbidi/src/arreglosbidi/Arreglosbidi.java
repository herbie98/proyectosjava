package arreglosbidi;

import java.util.Scanner;


public class Arreglosbidi {
    // atributos de las clases
    private int opc;
    private Scanner teclado = new Scanner(System.in);
    private int[][] Actividad1 = new int [4][4];
    private int[][] Actividad2 = new int [5][2];
    private int[][] Actividad3 = new int [4][3];
    private int[][] Actividad4 = new int [6][3];
    private char[][] Actividad5 = new char [10][10];
    
    // clase constructor
    public Arreglosbidi(){
         A5_();
        this.Main();        
    }
    private void A5_(){
         for(int i = 0; i< Actividad5.length ;i++)
            for(int j = 0; j< Actividad5[0].length ;j++)
              Actividad5[i][j] = ' ';
    }
    public void Main(){ // metodo del menu
        do{
            System.out.print("\n"
                    + "Practica 1\n"
                    + "Practica 2\n"
                    + "Practica 3\n"
                    + "practica 4\n"
                    + "practica 5\n"
                    + "practica 6\n"
                    + "Exit     7\n");
            opc = teclado.nextInt();
            switch(opc){//los casos con su llamada alas funciones
                case 1 : Caso1();break; 
                case 2 : Caso2();break; 
                case 3 : Caso3();break; 
                case 4 : Caso4();break; 
                case 5 : Caso5();break; 
                case 6 : Caso6();break;                 
                case 7 : break;
                default : System.out.println("incorrecto"); break; 
            }  
        }while(opc != 7);
    }
    private int[][] leer(int a[][]){
        for(int i = 0; i< a.length ;i++)
            for(int j = 0; j< a[0].length ;j++){
                System.out.print("Dato ["+i+"]"+"["+j+"] ->>");
                a[i][j] = teclado.nextInt();   
            }
        return a;
    }
    private void Print(int a[][]){
        for(int i = 0; i< a.length ;i++){
            System.out.print("| ");
            for(int j = 0; j< a[0].length ;j++)
                System.out.print("[ "+a[i][j]+" ]");
            System.out.print(" |\n");
        }
    }    
    private void Caso1(){
        Actividad1 = leer(Actividad1);
        Print(Actividad1);
        int j = 0,R = 0;
        for(int i = 0; i< Actividad1.length ;i++){
           R = Actividad1[i][j] +R; 
           j++;        
        }
        System.out.print("| Suma de la Diagonal es "+R+"\n");       }    
    private void Caso2(){
        Actividad2 = this.leer(Actividad2);
        Print(Actividad2);
        int columnas= 0, filas= 0 ,i = 0,j=0;
        // Suma de las filas
        for( i = 0; i< Actividad2.length ;i++){  
            for( j = 0; j< Actividad2[0].length ;j++){
                filas = Actividad2[i][j]+filas;   
            }           
            System.out.print(" Suma de la fila # "+i+" : "+filas+"\n");
            filas = 0;  
        }
        // Suma de las Columnas
        for( i = 0; i< Actividad2[0].length ;i++){
            for( j = 0; j< Actividad2.length ;j++)
                 columnas = Actividad2[j][i]+columnas; 
            System.out.print(" Suma de la columna # "+i+" : "+columnas+"\n");
            columnas = 0;
         }            
    }
    private void Caso3(){
        for(int i = 0; i< Actividad3[0].length ;i++)
            for(int j = 0; j< Actividad3.length ;j++){
                System.out.print("Dato ["+j+"]"+"["+i+"] ->>");
                Actividad3[j][i] = teclado.nextInt();   
            }
        this.Print(Actividad3);
    }
    private void Caso4(){
        int[] arreglounibi =  new int[12];
        int columna = 0, i = 0,j = 0;
          for( i = 0; i< Actividad3[0].length ;i++)
            for( j = 0; j< Actividad3.length ;j++){
                System.out.print("Dato ["+j+"]"+"["+i+"] ->>");
                Actividad3[j][i] = teclado.nextInt();   
                arreglounibi[columna] = Actividad3[j][i];
                columna++;
            }
        this.Print(Actividad3);
        System.out.print("\n");
        for( i = 0; i< arreglounibi.length ;i++)
            System.out.print("["+arreglounibi[i]+"]");
    }
    private void Caso5(){
       Actividad4 = this.leer(Actividad4);
       int fila = 0, i = 0,j = 0;
       this.Print(Actividad4);
       for( i = 0; i< Actividad4.length ;i++){
            for( j = 0; j< Actividad4[0].length ;j++){
                if((i%2)!=0)
                    fila = Actividad4[i][j]+fila;                
            }
            if((i%2)!=0){
                System.out.print("Valor de la Fila # "+i+" : "+fila+"\n");
                fila = 0;
            }  
       }
    }
    private void Caso6(){
        int B = 0, usuario = 0, i= 0, j= 0, C = 1;
        System.out.println("escribe del    1  a 10: "); 
               do{
                   B = 0;
                   usuario = teclado.nextInt();
                   if(usuario>= 1 && usuario<= 10)                        
                       B = 1;
                   else
                       System.out.println("el numero sobrepaso de lo admitido"); 
               }while(B != 1);
        for( i = 0 ;i< usuario; i++ ){
            do{
                 Actividad5[i][j] = '*';
                 j++;
            }while(j!=C);
            C++;
            j = 0;
        }
        for( i = 0; i< Actividad5.length ;i++){
            System.out.print("| ");
            for( j = 0; j< Actividad5[0].length ;j++)
                System.out.print("[ "+Actividad5[i][j]+" ]");
            System.out.print(" |\n");
        }
         A5_();
    }
   
    public static  void main(String [] args){ Arreglosbidi Obieto = new Arreglosbidi();    }
    
}