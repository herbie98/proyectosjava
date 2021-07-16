package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IMC_DAO {
    private IMC imc;
    private Conexion con;

    public IMC_DAO() {
        con=new Conexion();
    }
    
    public ArrayList<IMC> consultartodoimc(){
        ArrayList <IMC> datosIMC=new ArrayList<>();
        Connection c=con.abrir();
        if(c!=null){
            try {
                String query = "select * from imcdatos; ";
                PreparedStatement ps=c.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(IMC_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datosIMC;
    }
    
    public int guardarIMC(double peso, double estatura){
        int exito=0;
        Connection c=con.abrir();
        if(c!=null){
            try {
                try {
                    String query="insert into imcdatos(peso,estatura)values(?,?)";
                    PreparedStatement ps=c.prepareStatement(query);
                    ps.setDouble(1, exito);
                    ps.setDouble(2,estatura);
                    
                    exito=ps.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(IMC_DAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                c.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(IMC_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
        return exito;
    }
    
    public double calcularIMC(double peso, double estatura){
        
        return peso/(estatura*estatura);
    }
    
    public String estatusIMC(double IMC){
        
        String estatus="";
        
        if(IMC<18.49 && IMC>0){
            estatus="Estas muy delgado";
        }
        
        else if(IMC>18.50 && IMC<24.99){
            estatus="Estas normal";
        }
        
         else if(IMC>25 && IMC<29.99){
            estatus="Tienes sobre peso";
        }
        
         else if(IMC>30 && IMC<34.99){
            estatus="Tienes obesidad I";
        }
        
         else if(IMC>35 && IMC<39.99){
            estatus="Tienes obesidad II";
        }
        
         else if(IMC>40 && IMC<49.99){
            estatus="Tienes obesidad III";
        }
        
         else if(IMC>50){
             estatus="Tienes obesidad IV";
        }
        
       return estatus;
    } 
    
}
