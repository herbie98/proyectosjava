
package ListaCircular;

public class Nodo {
     public int dato;
    public Nodo siguiente;
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
