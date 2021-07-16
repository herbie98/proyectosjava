package producto;
public class atributos {
    
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;
    
    atributos(){
		nombre = "desconocido";
		marca = "desconocido";
		precio = 0;
		cantidad = 0;
	}
    public String getnombre(){
        return nombre;
    }
    public String getmarca(){
        return marca;
    }
    public double getprecio(){
        return precio;
    }
    public int getcantidad(){
        return cantidad;
    }
    
    public void setnombre(String dato){
        nombre = dato;
    }
    public void setmarca(String dato){
        marca = dato;
    }
    public void setprecio(double dato){
        precio = dato;
    }
    public void setcantidad(int dato){
        cantidad = dato;
    }
    
	//Método
public double calc_iva() {
    double iva;
    iva = precio*0.16;
    return iva;
	}
}
 
