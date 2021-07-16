package producto;

public class perecedero extends atributos {

    private String fechacaducidad;
    private double pesounidad;

    //gets
    public String getfechacaducidad() {
        return fechacaducidad;
    }

    public double getpesounidad() {
        return pesounidad;
    }

    //sets
    public void setfechacaducidad(String dato) {
        fechacaducidad = dato;
    }

    public void setpesounidad(double dato) {
        pesounidad = dato;
    }

}
