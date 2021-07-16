package ejemplo2;

public class cuenta {

    private String ncuenta;
    private double saldo;
    private String moneda;

    public String datos() {
        String salida = "";

        salida = "num. cuenta: " + ncuenta + "\n";
        salida = salida + "moneda: " + moneda + "\n";
        salida = salida + "saldo: " + String.valueOf(saldo);
        salida = salida + "\n------------------\n";

        return salida;
    }

    public void setncuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void deposito(double dato) {
        saldo = saldo + dato;
    }

    public void retiro(double dato) {
        if (dato <= saldo) {
            saldo = saldo + dato;
        }
    }

    public void setmoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getncuenta() {
        return ncuenta;
    }

    public double getsaldo() {
        return saldo;
    }

    public String getmoneda() {
        return moneda;
    }

}
