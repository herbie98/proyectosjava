package IMCS;

import Controlador.ContralorIMC;
import Modelo.IMC_DAO;
import Vista.JFIMC;

public class IMCMVC {
    public static void main(String[] args){
        IMC_DAO imcDAO = new IMC_DAO();
        JFIMC jfimc = new JFIMC();
        
        ContralorIMC controlIMC=new ContralorIMC(jfimc, imcDAO);
        
        jfimc.setLocationRelativeTo(null);
        jfimc.setVisible(true);
    }
}