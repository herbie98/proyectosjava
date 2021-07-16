/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author RILEY
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el id del objeto
        persona riley;
        
        //solicitamos memoria para el objeto
        //o se conoce como instancia del objeto
        riley = new persona ();
        
        //creacion en un solo paso el objeto
        persona timothy = new persona ();
        
        //asignamos datos a riley
        riley.nombre = "riley";
        riley.apellidop = "garcia";
        riley.apellidom = "guzman";
        
        //asignamos datos a timothy
        timothy.nombre = "timothy";
        timothy.apellidop = "garcia";
        timothy.apellidom = "guzman";
        
        //mostramos los datos en pantalla lo que imprime
        System.out.print("Nombre: ");
        System.out.println(riley.nombre);
        System.out.print("apellidos: ");
        System.out.print(riley.apellidop + "");
        System.out.println(riley.apellidom);
    }
    
}
