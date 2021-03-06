/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia.Interfaz;


import Farmacia.Empleado;
import Farmacia.Farmacia;
import Farmacia.Medicamento;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;

/**
 *
 * @author Diego Sullon
 */
public class RegistrarMedicamentos extends javax.swing.JFrame {

    private Farmacia farmacia;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMMM/dd");
    
    public RegistrarMedicamentos(Empleado empleado, Farmacia farmacia) {
        this.farmacia = farmacia;
//        farmacia.getInventario().añadirMedicamento("ASD", "001", 12F, "MARCA", 2, 5, 6);
//        farmacia.getInventario().añadirMedicamento("qwe", "002", 12F, "MARCA", 2, 5, 6);
//        farmacia.getInventario().añadirMedicamento("zxc", "003", 12F, "MARCA", 2, 5, 6);
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public RegistrarMedicamentos() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inNombre = new javax.swing.JTextField();
        inMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inCantidad = new javax.swing.JSpinner();
        inPrecio = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        inFechaVencimiento = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        inCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 128, 45));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Precio:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("F.V:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Marca:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        inNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNombreActionPerformed(evt);
            }
        });
        jPanel2.add(inNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 157, 22));

        inMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(inMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 157, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Nuevo medicamento");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        inCantidad.setModel(new javax.swing.SpinnerNumberModel(5, null, null, 1));
        jPanel2.add(inCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 20));

        inPrecio.setModel(new javax.swing.SpinnerNumberModel(20.3f, null, null, 1.0f));
        jPanel2.add(inPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        inFechaVencimiento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1592248096324L), null, null, java.util.Calendar.YEAR));
        jPanel2.add(inFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Código:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        inCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(inCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 157, 22));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNombreActionPerformed

    private void inMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inMarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Medicamento med=null;
        String nombre = inNombre.getText();
        String codigo = inCodigo.getText();
        String marca = inMarca.getText();
        float precio = (float) inPrecio.getValue();
        int cantidad = (int) inCantidad.getValue();
        med=farmacia.getInventario().buscarMedicamento(codigo);
        if(!nombre.isEmpty()&&!codigo.isEmpty()&&!marca.isEmpty()&&med==null&&codigo.length()==3){
            farmacia.getInventario().añadirMedicamentos(nombre, codigo, precio, marca, cantidad, null,null);
            this.setVisible(false);
            this.dispose();
        }

        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void inCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner inCantidad;
    private javax.swing.JTextField inCodigo;
    private javax.swing.JSpinner inFechaVencimiento;
    private javax.swing.JTextField inMarca;
    private javax.swing.JTextField inNombre;
    private javax.swing.JSpinner inPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
