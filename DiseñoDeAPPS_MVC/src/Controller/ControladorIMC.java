
package Controller;

import Model.IMD_DAO;
import View.IMC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorIMC implements ActionListener{
    private IMD_DAO imcDAO;
    private IMC jdimc;

    public ControladorIMC(IMD_DAO imcDAO, IMC jdimc) {
        this.imcDAO = imcDAO;
        this.jdimc = jdimc;
        this.jdimc.BTNGuardar.addActionListener(this);
        this.jdimc.Calcular_IMC2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                
        if(e.getSource() == jdimc.BTNGuardar){
            double Peso = Double.parseDouble(this.jdimc.Peso_C.getText());
            double Estatura = Double.parseDouble(this.jdimc.Estatura_C1.getText());
            double imc = this.imcDAO.calcularIMC(Peso, Estatura);
            String Estatus = this.imcDAO.statusIMC(imc);            
            jdimc.Respuesta_L.setText("IMC :  "+imc+"");
             
         }else if (e.getSource() == jdimc.BTNGuardar){
             
            double Peso = Double.parseDouble(this.jdimc.Peso_C.getText());
            double Estatura = Double.parseDouble(this.jdimc.Estatura_C1.getText());
            
            try {
                if(this.imcDAO.guardarIMC(Peso, Estatura)>0 ){
                    JOptionPane.showMessageDialog(null, " Datos Guardados");
                }else{
                    JOptionPane.showMessageDialog(null, " Daots no GUardados");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorIMC.class.getName()).log(Level.SEVERE, null, ex);
            }    
         }
    
           
     }
 }
    
    
   

