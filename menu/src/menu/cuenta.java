package menu;
public class cuenta {
     //Atributos son las variables 
	//que guardara el objeto
	private String NCuenta;
	private double Saldo;
	private String TMoneda;
        
        public cuenta(){
            NCuenta = "0";
            Saldo = 0;
            TMoneda = "Sin Dato";
        }
        
        public cuenta(String num, String moneda){
            NCuenta = num;
            Saldo = 0;
            TMoneda = moneda;
        }
	
	//Sacar los datos para imprimirlos
	public String datos(){
		String Salida = "";
		
		Salida = "Moneda: ";
		Salida = Salida + TMoneda + "\n";
		Salida = Salida + "Num. Cuenta: ";
		Salida = Salida + NCuenta + "\n";
		Salida = Salida + "Saldo: $";
		Salida = Salida + String.valueOf(Saldo);
		Salida = Salida + "\n-----------------\n";
		
		return Salida;
	}
	
	
    public String getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(String NCuenta) {
        this.NCuenta = NCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    
	public void Deposito(double dato){
			Saldo = Saldo + dato;
	}
	public void Retiro(double dato){
			if(dato <= Saldo) {
				Saldo = Saldo - dato;
			}
	}
	
	
    public String getTMoneda() {
        return TMoneda;
    }

    public void setTMoneda(String TMoneda) {
        this.TMoneda = TMoneda;
    }
}