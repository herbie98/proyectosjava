
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class IMD_DAO {
    
    private IMC imc;
    private Coneccion con;
    
    public IMD_DAO(){
        
    }
    public double calcularIMC(double peso, double estatura){
        this.con = new Coneccion();
        return (estatura/(peso*peso));
    }
    public int guardarIMC(double peso, double estatura) throws SQLException{
        int exito = 0;
        Connection c = con.abrir();
        String query = "insert into imcdatos (peso, estatura)value(?,?);";
        if(c!=null){
            PreparedStatement ps = c.prepareStatement(query);
            ps.setDouble(1, peso);
            ps.setDouble(2, estatura);
            exito = ps.executeUpdate();
        }else{
            JOptionPane.showMessageDialog(null, "Error de coneccion");
        }
        c.close();
        return exito;
    }
    public ArrayList COsultarIMC() throws SQLException{
      ArrayList <IMC> datosimc = new ArrayList<>();
      Connection c = con.abrir();
       if(c!=null){
           String query = "select * from imcdatos ;";
           PreparedStatement ps = c.prepareStatement(query);
           ResultSet  re = ps.executeQuery();
           while(re.next()){
               datosimc.add((new IMC(re.getDouble("peso"),re.getDouble("estatura"))));
           }
       }else{
            JOptionPane.showMessageDialog(null, "Error de coneccion");
        }
      return datosimc;
    }
    
    public String statusIMC(double imc){
        if(imc < 18.5){
            return " Delgades";
        }else if(imc > 18.5 && imc <= 24.5){
            return " Saludable";
        }else if(imc > 24.5 && imc <= 29.9){
            return " PreObesidad";
        }else if(imc > 29.9 && imc <= 35.5){
            return " Obecidad";
        }else if(imc > 35.5 ){
            return " Obecidad Morbida";
        }
        return "Error";
    }
}
