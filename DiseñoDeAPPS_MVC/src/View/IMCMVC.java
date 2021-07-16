
package View;

import Controller.ControladorIMC;
import Model.IMD_DAO;


public class IMCMVC {
    
    
    public static void main(String[] args){        
        IMD_DAO imcDAO = new IMD_DAO();
        IMC jfimc = new IMC();
        ControladorIMC controladorIMC = new ControladorIMC(imcDAO,jfimc);
        
        jfimc.setLocationRelativeTo(null);
        jfimc.setVisible(true);
    }
}
