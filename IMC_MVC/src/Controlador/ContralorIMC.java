package Controlador;

import Modelo.IMC_DAO;
import Vista.JFIMC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ContralorIMC implements ActionListener{
     private JFIMC jfimc;
     private IMC_DAO imcdao;
    
     public ContralorIMC(JFIMC jfimc, IMC_DAO imcdao) {
        this.jfimc = jfimc;
        this.imcdao = imcdao;
        
        //aqui van los botones escuchador
        this.jfimc.btncalcular.addActionListener(this);
        this.jfimc.btnguardar.addActionListener(this);
        this.jfimc.btnconsultar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       //aqui la funcion del boton calcular
       if(e.getSource()==jfimc.btncalcular){
           double peso=Double.parseDouble(jfimc.txtpeso.getText());
           double estatura=Double.parseDouble(jfimc.txtestatura.getText());
           double imc=imcdao.calcularIMC(peso, estatura);
           String estatus=imcdao.estatusIMC(imc);
           jfimc.lbresultado.setText("IMC: "+imc+"Estatus: "+estatus); 
       }
       
       //aqui la funcionalidad del boton guardar
       else if(e.getSource()==jfimc.btnguardar){
           double peso=Double.parseDouble(jfimc.txtpeso.getText());
           double estatura=Double.parseDouble(jfimc.txtestatura.getText());
           if(imcdao.guardarIMC(peso,estatura)>0){
               JOptionPane.showConfirmDialog(null,"registro exitoso");
           }
       }
       
       //aqui toda la funcionalidad del boton de consultar todo
       else if(e.getSource()==jfimc.btnconsultar){
        if (imcdao.consultartodoimc().size()>0){
            DefaultTableModel model = new DefaultTableModel();
            jfimc.tbimc.setModel(model);//jfimc de donde biene
            
            //nombre de las columnas
            model.addColumn("peso");
            model.addColumn("altura");
            model.addColumn("resultado");
            model.addColumn("IMC");
            
            //crear el objeto con un espacio de 4 columnas
            Object [] column=new Object[4];
            
            for(int i=0; i<imcdao.consultartodoimc().size(); ++i){
            column[0] = imcdao.consultartodoimc().get(i).getPeso();
            column[0] = imcdao.consultartodoimc().get(i).getEstatura();
            column[0] = imcdao.consultartodoimc().get(i).getimc();
            column[0] = imcdao.consultartodoimc().get(i).getResultado();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"no hay datos que mostrar");
        }
       }
       
       
       
    }
}