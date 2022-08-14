
package reto_5.vista;


import reto_5.model.vo.PrimerInformeBancoVo;
import reto_5.model.vo.SegundoInformeBancoVo;
import java.util.List;
import reto_5.Controldaor.ReportesController;
import reto_5.model.vo.TercerInformeBancoVo;


/**
 *
 * @author Ivan
 */
public class ReporteView extends javax.swing.JFrame {

    public static final ReportesController informe1=new ReportesController();
    public static final ReportesController informe2=new ReportesController();
    public static final ReportesController informe3=new ReportesController();
   
    public ReporteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo = new javax.swing.JTextArea();
        jbutton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Proyecto Vivienda");

        jButton2.setText("Primer Informe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primerinfo(evt);
            }
        });

        campo.setColumns(20);
        campo.setRows(5);
        jScrollPane2.setViewportView(campo);

        jbutton1.setText("Segundo Informe");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Segundoinfo(evt);
            }
        });

        jButton3.setText("Tercer Informe");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tercerinfo(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbutton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jbutton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Primerinfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primerinfo
         try{
            List<PrimerInformeBancoVo> proyecto=informe1.listarPrimerInformeBanco();
            String imprimir="Primer Informe"+"\n"+"\n";
                 
            for(PrimerInformeBancoVo proyec:proyecto){
            imprimir+=proyec.getId();
            imprimir+="\t";
            imprimir+=proyec.getNombre();
            imprimir+="\t";
            imprimir+=proyec.getPrimerApellido();
            imprimir+="\t";
            imprimir+=proyec.getCiudadResidencia();
            imprimir+="\n";
            }
            campo.setText(imprimir);
        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
            
    }//GEN-LAST:event_Primerinfo

    private void Segundoinfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Segundoinfo
        try{
            List<SegundoInformeBancoVo> proyecto = informe2.listarSegundoInformeBanco();
            String imprimir="Segundo Informe"+"\n"+"\n";
                 
            for(SegundoInformeBancoVo proyec:proyecto){
            imprimir+=proyec.getId();
            imprimir+="\t";
            imprimir+=proyec.getConstructora();
            imprimir+="\t";
            imprimir+=proyec.getNumeroHabitaciones();
            imprimir+="\t";
            imprimir+=proyec.getCiudad();
            imprimir+="\n";
            }
            campo.setText(imprimir);
        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
            
                         

    }//GEN-LAST:event_Segundoinfo

    private void Tercerinfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tercerinfo
        try{
            List<TercerInformeBancoVo> proyecto = informe3.listarTercerInformeBanco();
            String imprimir="Segundo Informe"+"\n"+"\n";
                 
            for(TercerInformeBancoVo proyec:proyecto){
            imprimir+=proyec.getId();
            imprimir+="\t";
            imprimir+=proyec.getConstructora();
            imprimir+="\t";
            imprimir+=proyec.getBancoVinculado();
            imprimir+="\t";
            imprimir+="\n";
            }
            campo.setText(imprimir);
        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_Tercerinfo

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbutton1;
    // End of variables declaration//GEN-END:variables
}
