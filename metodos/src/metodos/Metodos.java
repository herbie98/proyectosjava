/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Garcia Arana Oscar Samuel
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto matematicas
        matematicas objeto =new matematicas();
        
        objeto.saludo();
        
        objeto.saludo_personal("riley");
        objeto.saludo_personal("timothy");
        
        objeto.saludo_empleado("riley", 7);
        objeto.saludo_empleado("timothy", 2);
        
        System.out.println(objeto.suma_entero(5,3));
    }
    
}
