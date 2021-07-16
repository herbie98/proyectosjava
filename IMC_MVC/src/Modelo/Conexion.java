package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con = null;
    private String servidor = "localhost:3306";
    private String bd = "imc";
    private String usuario = "root";
    private String pass ="cagg199324";
    private String url = "jdbc:mysql://" + servidor + "/" + bd;
	
     public Connection abrir(){
            try{           
            Class.forName("com.mysql.jdbc.Driver");            
            this.con = DriverManager.getConnection(url,usuario,pass);
            System.out.print("Conexion establecida : ");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.print("No se puede establecer conexion error : "+ex);
        } 
        return con;
    }
}
