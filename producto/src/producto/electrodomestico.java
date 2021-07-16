package producto;

public class electrodomestico extends atributos {

    private String normas;
    private String garantia;

    //gets
    public String getnormas() {
        return normas;
    }

    public String getgarantia() {
        return garantia;
    }

    //sets
    public void setnormas(String dato) {
        normas = dato;
    }

    public void setgarantia(String dato) {
        garantia = dato;
    }

}
