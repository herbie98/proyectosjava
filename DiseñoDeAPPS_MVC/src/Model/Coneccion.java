package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
     private Connection con = null;
    private String servidor = "localhost:3306";
    private String bd = "empresa";
    private String usuario = "root";
        private String pass ="cagg199324";
    private String url = "jdbc:mysql://" + servidor + "/" + bd;
	
     public Connection abrir(){
            try{           
            Class.forName("com.mysql.jdbc.Driver");            
            this.con = DriverManager.getConnection(url,usuario,pass);
            System.out.print("Coneccion establecida : ");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.print("Coneccion No establecida  error es : "+ex);
        } 
        return con;
    }
}
