package herencia;
public class usuario {
    private String numusuario;
    private String contrasenia;

    public String getnumusuario() {
        return numusuario;
    }

    public void setnumusuario(String numusuario) {
        this.numusuario = numusuario;
    }

    public String getcontrasenia() {
        return contrasenia;
    }

    public void setcontrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    //metodo de valida de ususario
    boolean valida(String usuario, String contrasenia){
        boolean salida = false;
        if(numusuario.compareTo(usuario) == 0){
            if(contrasenia.compareTo(contrasenia) == 0){
            salida = true;
        }
    }
        return salida;
    }
    
}
