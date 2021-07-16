package arreglos;

public class modelo {

    private String Id;
    private String Nombre;
    private String Cel;
    private String Email;
    private boolean ocupado;

    public modelo() {
        Nombre = "";
        Cel = "";
        Email = "";
        ocupado = false;
        Id = "";
    }

    public boolean GetOcupado() {
        return ocupado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String dato) {
        Id = dato;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
        ocupado = true;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;

    }

    public String getEmail() {
        return Email;

    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}