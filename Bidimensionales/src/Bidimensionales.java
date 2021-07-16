import java.util.Scanner;
public class Bidimensionales {
    public void imprimir(int arreglo[][]){
        int filas;
        int columnas;
        
        for(filas = 0; filas<arreglo.length; filas++){
                                            //imprime la longitud 2,3 hasta ahi si esta en 1 debe imprimir 2,3,4,5
            for(columnas = 0; columnas<arreglo[filas].length; columnas++){
                System.out.print(arreglo[filas][columnas] + ",");
            }
            System.out.println();
        }
    }
    
        public void leerDatos(int arreglo [][]){
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa los valores del arreglo");
            for(int f=0; f<arreglo.length; f++){
                for(int c=0; c<arreglo[0].length; c++){
                    System.out.println("["+f+"]"+"["+c+"] :");
                    arreglo[f][c] = teclado.nextInt();
                }
            }
        }
    /*
        int x = arreglo.length;//regresa las filas del arreglo
        int y = arreglo[0].length;//columnas de la fila 0;
        System.out.println("filas: "+ x);
        System.out.println("columnas " + y);
    }
*/
    public static void main(String[] arg){
        Bidimensionales obj = new Bidimensionales();
        
        //4 filas * 3 columnas
                            //3 filas * 2 columnas
        int matriz[][] = {{1,2},{3,4},{5,6}};//declara el arreglo
        obj.leerDatos(matriz);
        System.out.println("\nDatos ingresados: ");
        obj.imprimir(matriz);//se manda a imprimir el arreglo
        
    }
    
}
