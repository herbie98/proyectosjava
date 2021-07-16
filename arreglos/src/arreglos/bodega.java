/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author BLUE LIGHT
 */
public class Bodega {
    //Estructura de tipo arreglo
    private final int MAX = 300;
    private Producto[] Estructura = new Producto[MAX];

    ///Constructor que inicializa los
    //Objetos
    public Bodega(){
        for(int e = 0; e < MAX; e++){
                Estructura[e] = new Producto();
        }
    }
	
    public String busca(String dato){
        String salida = dato + "No encontrado";
        for(int e = 0; e < MAX; e++){
            if(Estructura[e].getOcupado() && (Estructura[e].getId().compareTo(dato) == 0)){
                    salida = "Id: " + Estructura[e].getId();
                    salida = salida + "\nDescripción: " + Estructura[e].getDescripcion();
                    salida = salida + "\nCantidad: " + Estructura[e].getCantidad();
                    salida =  salida + "\n------------\n";
                    break;
            }
        }
        return salida;
    }
	
    public void inserta(Producto elemento){
        for(int e = 0; e < 6; e++){
            if(Estructura[e].getOcupado() == false) {

                Estructura[e].setId(elemento.getId());
                Estructura[e].setDescripcion(elemento.getDescripcion());
                Estructura[e].setCantidad(elemento.getCantidad());                   				
                break;
            }
        }
    }
	
    public String existencia(){
        String salida = "";
        for(int e = 0; e < 6; e++){
            if(Estructura[e].getOcupado() == true) {
                salida = salida + "Id: " + Estructura[e].getId();
                salida = salida + "\nDescripcion: ";
                salida = salida + Estructura[e].getDescripcion();
                salida = salida + "\nCantidad: ";
                salida = salida + Estructura[e].getCantidad();
                salida = salida +"\n----\n";
            }
        }

        return salida;
    }
	
    public String consulta(String desc){
        String salida = "";
        for(int e = 0; e < 6; e++){
                if(Estructura[e].getOcupado()&& (Estructura[e].getDescripcion().contains(desc))){				
                        salida = salida + "Id: " + Estructura[e].getId();
                        salida = salida + "\nDescripcion: ";
                        salida = salida + Estructura[e].getDescripcion();
                        salida = salida + "\nCantidad: ";
                        salida = salida + Estructura[e].getCantidad();
                        salida = salida + "\n------------\n";				
                }
            }
        if(salida.compareTo("")==0) salida = "Ningun dato coincide";
        return salida;

    }
    
    
}
			  
    

