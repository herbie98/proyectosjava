package Arboles;

import java.util.Scanner;

public class ArbolBinario {
    Scanner teclado = new Scanner (System.in);
    short opcion;
    public Nodo crearNodo(int dato){
        Nodo nodo = new Nodo(dato);
        return nodo;
    }
    public boolean arbolVacio(Nodo arbol){
        if(arbol == null)
            return true;
        return false;
    }
    public Nodo crearArbol(Nodo arbol, int dato){
        if(arbolVacio(arbol)){
            arbol = crearNodo(dato);
        }
        return arbol;
    }
    public void agregarNodoArbol(int dato, Nodo nodoActual, int izqOder){
        if(izqOder == 1){
            nodoActual.izquierda = crearNodo(dato);
            nodoActual = nodoActual.izquierda;
        }
        if(izqOder == 2){
            nodoActual.derecha = crearNodo(dato);
            nodoActual = nodoActual.derecha;
            
        }
        System.out.println("otro a la izquierda del "+ dato + "  1.SI 2.NO");
        opcion = teclado.nextShort();
        if(opcion == 1){
            System.out.println("Ingresa el Nodo a agregar a la izquierda");
            agregarNodoArbol(teclado.nextInt(), nodoActual, 1);
        }
        System.out.println("otro a la derecha del "+ dato+ "  1.SI 2.NO");
        opcion = teclado.nextShort();
        if (opcion == 1){
            System.out.println("Ingresa el nodo a agregar a la derecha");
            agregarNodoArbol(teclado.nextInt(), nodoActual, 2);
        }
    }

    public void imprimirPreorden(Nodo nodoactual) {
        System.out.println(nodoactual.getDato() +" , ");
        if (nodoactual.izquierda !=null){
            imprimirPreorden(nodoactual.izquierda);
        }
        if (nodoactual.derecha !=null){
            imprimirPreorden(nodoactual.derecha);
        }
    }
    public void imprimirInorden(Nodo nodoactual) {
        if (nodoactual.izquierda !=null){
            imprimirInorden(nodoactual.izquierda);
            
            System.out.println(nodoactual.getDato() + " , ");
        
        if (nodoactual.derecha !=null)
            imprimirInorden(nodoactual.derecha);
        }
    }
    public void imprimirPosorden(Nodo nodoactual) {
        if (nodoactual.izquierda !=null){
            imprimirPosorden(nodoactual.izquierda);
                    
        if (nodoactual.derecha !=null)
            imprimirPosorden(nodoactual.derecha);
        
        System.out.println(nodoactual.getDato() + " , ");
        }
    }
    
}
