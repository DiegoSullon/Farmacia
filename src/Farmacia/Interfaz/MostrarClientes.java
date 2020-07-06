/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia.Interfaz;

import Farmacia.Empresa;
import Farmacia.Persona;
import Farmacia.RegistroClientes;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Diego Sullon
 */
public class MostrarClientes extends javax.swing.JFrame {

    //Listas de clientes
    DefaultListModel modelListPersonas = new DefaultListModel();
    DefaultListModel modelListEmpresas = new DefaultListModel();
    
    RegistroClientes registroClientes;
    //validadores
    ArrayList<String> validador;

    public MostrarClientes(RegistroClientes registroClientes, ArrayList<String> validador) {
        this.registroClientes = registroClientes;
        this.validador = validador;
        initComponents();
        //set listas
        modelListPersonas=new DefaultListModel();
        listaPersonas.setModel(modelListPersonas);
        modelListEmpresas=new DefaultListModel();
        listaEmpresas.setModel(modelListEmpresas);
        //se obtiene los datos de los registros
        obtenerListaPersonas(registroClientes.getPersonas());
        obtenerListaEmpresas(registroClientes.getEmpresas());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public MostrarClientes() {
        initComponents();
        modelListPersonas=new DefaultListModel();
        listaPersonas.setModel(modelListPersonas);
        modelListEmpresas=new DefaultListModel();
        listaEmpresas.setModel(modelListEmpresas);
        modelListPersonas.addElement("75594802 ");
        
    }

    private void obtenerListaPersonas(ArrayList<Persona> personas) {
        for (int i = 0; i < personas.size(); i++) {
            modelListPersonas.addElement(personas.get(i).getDni() + "    "+personas.get(i).getNombre()+ "    "+personas.get(i).getPuntos());
        }
        if (personas.isEmpty()) {
            modelListPersonas.addElement("No hay personas registradas.");
        }
    }
    private void obtenerListaEmpresas(ArrayList<Empresa> empresas) {
        for (int i = 0; i < empresas.size(); i++) {
            modelListEmpresas.addElement(empresas.get(i).getRuc() + "    "+empresas.get(i).getNombre()+ "    "+empresas.get(i).getPuntos());
        }
        if (empresas.isEmpty()) {
            modelListEmpresas.addElement("No hay personas registradas.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpresas = new javax.swing.JList<>();
        seleccionarPersonaButton = new javax.swing.JButton();
        inDni = new javax.swing.JTextField();
        buscarDniButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPersonas = new javax.swing.JList<>();
        seleccionarEmpresaButton = new javax.swing.JButton();
        inRuc = new javax.swing.JTextField();
        buscarRucButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        listaEmpresas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaEmpresas);

        seleccionarPersonaButton.setText("Seleccionar");
        seleccionarPersonaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarPersonaButtonActionPerformed(evt);
            }
        });

        inDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inDni.setToolTipText("");
        inDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDniActionPerformed(evt);
            }
        });

        buscarDniButton.setText("Buscar:");
        buscarDniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("DNI");

        listaPersonas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaPersonas);

        seleccionarEmpresaButton.setText("Seleccionar");
        seleccionarEmpresaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarEmpresaButtonActionPerformed(evt);
            }
        });

        inRuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inRuc.setToolTipText("");
        inRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inRucActionPerformed(evt);
            }
        });

        buscarRucButton.setText("Buscar:");
        buscarRucButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRucButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("RUC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(seleccionarPersonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seleccionarEmpresaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarDniButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inDni, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarRucButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(seleccionarPersonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarDniButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionarEmpresaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarRucButton))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inDniActionPerformed

    private void inRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inRucActionPerformed

    private void seleccionarPersonaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarPersonaButtonActionPerformed
        String dni;
        if(listaPersonas.getSelectedValue()!=null){
            dni=listaPersonas.getSelectedValue().substring(0,listaPersonas.getSelectedValue().indexOf(" "));
            validador.set(1,dni);
            validador.set(0, "persona");
            this.setVisible(false);
            this.dispose();
            System.out.println(dni+"D");
        }
    }//GEN-LAST:event_seleccionarPersonaButtonActionPerformed

    private void seleccionarEmpresaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarEmpresaButtonActionPerformed
        String ruc;
        if(listaEmpresas.getSelectedValue()!=null){
            ruc=listaEmpresas.getSelectedValue().substring(0,listaEmpresas.getSelectedValue().indexOf(" "));
            validador.set(1,ruc);
            validador.set(0, "empresa");
            this.setVisible(false);
            this.dispose();
            System.out.println(ruc+"R");
        }
    }//GEN-LAST:event_seleccionarEmpresaButtonActionPerformed

    private void buscarDniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniButtonActionPerformed
        Persona persona=registroClientes.buscarPersona(inDni.getText());
        if(persona!=null){
            validador.set(1,persona.getDni());
            validador.set(0, "persona");
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_buscarDniButtonActionPerformed

    private void buscarRucButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRucButtonActionPerformed
        Empresa empresa=registroClientes.buscarEmpresa(inRuc.getText());
        if(empresa!=null){
            validador.set(1,empresa.getRuc());
            validador.set(0, "empresa");
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_buscarRucButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarDniButton;
    private javax.swing.JButton buscarRucButton;
    private javax.swing.JTextField inDni;
    private javax.swing.JTextField inRuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaEmpresas;
    private javax.swing.JList<String> listaPersonas;
    private javax.swing.JButton seleccionarEmpresaButton;
    private javax.swing.JButton seleccionarPersonaButton;
    // End of variables declaration//GEN-END:variables
}
