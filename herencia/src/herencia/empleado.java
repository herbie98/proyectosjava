package herencia;
public class empleado extends persona {
    private String puesto;
    private double sueldo;

    public String getpuesto() {
        return puesto;
    }

    public void setpuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getsueldo() {
        return sueldo;
    }

    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
