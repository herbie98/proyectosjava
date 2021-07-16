package act05;

public class producto {

    private String Id;
    private String Descripcion;
    private Integer Cantidad;
    private boolean ocupado;

    public producto() {
        Id = "0000";
        Descripcion = "";
        Cantidad = 0;
        ocupado = false;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
        ocupado = true;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
        ocupado = true;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public boolean getOcupado() {
        return ocupado;
    }

}
