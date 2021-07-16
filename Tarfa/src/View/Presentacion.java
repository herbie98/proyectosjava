package View;
//importamos la carpeta controller y extraemos datos del archivo pesoAereo
import Cotroller.PesoAereo;


public class Presentacion extends javax.swing.JFrame {

    public Presentacion() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Altura_L = new javax.swing.JLabel();
        Altura_C = new javax.swing.JTextField();
        Ancho_L = new javax.swing.JLabel();
        Ancho_C = new javax.swing.JTextField();
        Largo_L = new javax.swing.JLabel();
        Largo_C = new javax.swing.JTextField();
        PesoBascula_L = new javax.swing.JLabel();
        PesoBascula_C = new javax.swing.JTextField();
        Costo_L = new javax.swing.JLabel();
        CostoB_C = new javax.swing.JTextField();
        CalcularMethod = new javax.swing.JToggleButton();
        Resultado_L = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Altura_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Altura_L.setText("Altura");

        Ancho_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Ancho_L.setText("Ancho");

        Largo_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Largo_L.setText("Largo");

        PesoBascula_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PesoBascula_L.setText("Peso Bascula");

        Costo_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Costo_L.setText("Costo KG");

        CalcularMethod.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CalcularMethod.setText("Calcular");
        CalcularMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularMethodActionPerformed(evt);
            }
        });

        Resultado_L.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Resultado_L.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Ancho_L)
                                    .addGap(106, 106, 106)
                                    .addComponent(Ancho_C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Altura_L)
                                    .addGap(106, 106, 106)
                                    .addComponent(Altura_C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Largo_L)
                                    .addGap(106, 106, 106)
                                    .addComponent(Largo_C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(PesoBascula_L)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PesoBascula_C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CostoB_C, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Costo_L)
                            .addComponent(CalcularMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Resultado_L)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Altura_L)
                    .addComponent(Altura_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ancho_L)
                    .addComponent(Ancho_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Largo_L)
                    .addComponent(Largo_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesoBascula_L)
                    .addComponent(PesoBascula_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Costo_L)
                    .addComponent(CostoB_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(CalcularMethod)
                .addGap(50, 50, 50)
                .addComponent(Resultado_L)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularMethodActionPerformed
       String Altura_ = Altura_C.getText();//datos recibidos de los campo de texto
       String Ancho_ = Ancho_C.getText();
       String Costo_ = CostoB_C.getText();
       String Largo_ = Largo_C.getText();
       String PesoBascula_ = PesoBascula_C.getText();
       
       float Altura = Float.parseFloat(Altura_);//convertir los datos a float en vez de cadena
       float Ancho = Float.parseFloat(Ancho_);
       float CostoB = Float.parseFloat(Costo_);
       float Largo = Float.parseFloat(Largo_);
       float PesoBascula = Float.parseFloat(PesoBascula_);
       
       PesoAereo Obj = new PesoAereo();//instanciamos un objeto llamado obj
       Obj.setAltura(Altura);
       Obj.setAncho(Ancho);
       Obj.setCosto(CostoB);
       Obj.setPBascula(PesoBascula);
       Obj.setLargo(Largo);
       Resultado_L.setText(Obj.CalcularCosto());
       
       
    }//GEN-LAST:event_CalcularMethodActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura_C;
    private javax.swing.JLabel Altura_L;
    private javax.swing.JTextField Ancho_C;
    private javax.swing.JLabel Ancho_L;
    private javax.swing.JToggleButton CalcularMethod;
    private javax.swing.JTextField CostoB_C;
    private javax.swing.JLabel Costo_L;
    private javax.swing.JTextField Largo_C;
    private javax.swing.JLabel Largo_L;
    private javax.swing.JTextField PesoBascula_C;
    private javax.swing.JLabel PesoBascula_L;
    private javax.swing.JLabel Resultado_L;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
