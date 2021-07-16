package Model;
public class IMC_DAO {
    private IMC imc;

    public IMC_DAO(IMC imc) {
        this.imc = imc;
    }
    
    public double calcularIMC(double peso, double estatura){
        return peso/(estatura*estatura);
    }
    
    public String estatusIMC(double IMC){
        String estatus="";
        if(IMC < 18.5){
            estatus=" Delgades";
        }else if(IMC > 18.5 && IMC <= 24.5){
            estatus= " Saludable";
        }else if(IMC > 24.5 && IMC <= 29.9){
            estatus= " PreObesidad";
        }else if(IMC > 29.9 && IMC <= 35.5){
            estatus= " Obecidad";
        }else if(IMC > 35.5 ){
            estatus= " Obecidad Morbida";
        }
        return estatus;
    }
}