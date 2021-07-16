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
public class matematicas {
    //todos los metodos pueden retornar un valores y pueden recibir
    //datos de entrada a travez de los parametros
    
    //si al metodo no retorna datos entonces se
    //declara como void
    public void saludo(){
        System.out.println("hello boss");
    }
    public void saludo_personal(String nombre){
        System.out.print("hello");
        System.out.println(nombre);
    }
    public void saludo_empleado(String nombre, int empleado){
        System.out.print("hello");
        System.out.println(nombre);
        System.out.print("numero de empleado");
        System.out.println(empleado);
    }
    public int suma_entero (int a, int b){
        return a + b;
    }
    public double suma_double(double a, double b){
        return a + b;
    }
    
    public String nombre_completo(String nombre, String apellidop, String apellidom){
        return nombre + "" + apellidop + "" + apellidom ;
    }
    
}
