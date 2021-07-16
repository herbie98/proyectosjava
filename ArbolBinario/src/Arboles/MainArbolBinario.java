package Arboles;

import java.util.Scanner;

public class MainArbolBinario {
    Nodo arbol = null;
    public void arbolBinario(){
        Scanner teclado = new Scanner(System.in);
        ArbolBinario objeto = new ArbolBinario();
        System.out.println("Ingresa el nodo Raiz");
        arbol = objeto.crearArbol(arbol, teclado.nextInt());
        objeto.agregarNodoArbol(arbol.getDato(), arbol, 3);
        System.out.println("\n Preorden \n");
        objeto.imprimirPreorden(arbol);
        System.out.println("\n Inorden \n");
        objeto.imprimirInorden(arbol);
        System.out.println("\n Posorden \n");
        objeto.imprimirPosorden(arbol);
    }
    public static void main(String[] args){
        MainArbolBinario objMain = new MainArbolBinario();
        objMain.arbolBinario();
    }
}
