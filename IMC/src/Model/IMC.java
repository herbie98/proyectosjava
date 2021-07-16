package Model;
public class IMC {
    private double peso;
    private double estatura;
    
    public IMC(double peso, double estatura){
        this.peso=peso;
        this.estatura=estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
}
