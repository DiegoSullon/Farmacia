/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia.Interfaz;

import Farmacia.Empleado;
import Farmacia.Farmacia;
import Farmacia.Medicamento;
import Farmacia.RegistroClientes;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Diego Sullon
 */
public class TomarPedido extends javax.swing.JFrame {

    //Lista de medicamentos
    DefaultListModel jlist = new DefaultListModel();
    //Lista de compras
    DefaultListModel listaVenta = new DefaultListModel();
    ArrayList<String> detalles = new ArrayList<String>();
    //Tipo de cliente por defecto
    //Pedido creado
    private boolean pedido = false;
    //validadores
    ArrayList<String> validador = new ArrayList<String>();
    //Contador para lista de venta
    int c = 0;

    Farmacia farmacia;
    Empleado actual;
    RegistroClientes registroClientes;

    public TomarPedido(Empleado actual, Farmacia farmacia, RegistroClientes registroClientes) {
        this.registroClientes = registroClientes;
        this.actual = actual;
        this.farmacia = farmacia;
        initComponents();
        jlist = new DefaultListModel();
        lista.setModel(jlist);
        listaVenta = new DefaultListModel();
        venta.setModel(listaVenta);
        validador.add("client");
        validador.add("00000000");
        obtenerLista(this.farmacia.getInventario().getMedicamentos());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public TomarPedido() {
        initComponents();
        jlist = new DefaultListModel();
        lista.setModel(jlist);
        listaVenta = new DefaultListModel();
        venta.setModel(listaVenta);
    }

    private void obtenerLista(ArrayList<Medicamento> medicamentos) {
        for (int i = 0; i < medicamentos.size(); i++) {
            jlist.addElement(medicamentos.get(i).getCodigo() + "    " + medicamentos.get(i).getNombre() + "    " + medicamentos.get(i).getCantidad() + "unid.    S/." + medicamentos.get(i).getPrecio());
        }
        if (medicamentos.isEmpty()) {
            jlist.addElement("No hay medicamentos registrados.");
        }
    }

    private void obtenerVenta(ArrayList<String> detalles) {
        c = 0;
        for (int i = 0; i < detalles.size(); i++) {
            listaVenta.addElement(detalles.get(i));
            c++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        venta = new javax.swing.JList<>();
        deleteButton = new javax.swing.JButton();
        findClientButton = new javax.swing.JButton();
        addClientButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        chargeBoletaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chargeFacturaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lista);

        addButton.setText("Añadir");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        venta.setEnabled(false);
        jScrollPane3.setViewportView(venta);

        deleteButton.setText("Eliminar ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        findClientButton.setText("Cliente registrado");
        findClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findClientButtonActionPerformed(evt);
            }
        });

        addClientButton.setText("Nuevo cliente");
        addClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        chargeBoletaButton.setText("Boleta");
        chargeBoletaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeBoletaButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Venta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Medicamentos");

        chargeFacturaButton.setText("Factura");
        chargeFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeFacturaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chargeFacturaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chargeBoletaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(findClientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(287, 287, 287))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chargeBoletaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chargeFacturaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if (lista.getSelectedValue() != null) {
            if (!pedido) {
                
                if (validador.get(0).equals("persona")) {
                    actual.generarPedidoP(validador.get(1), lista.getSelectedValue().substring(0, 3), registroClientes);
                } else if (validador.get(0).equals("empresa")) {
                    actual.generarPedidoE(validador.get(1), lista.getSelectedValue().substring(0, 3), registroClientes);
                } else {
                    actual.generarPedidoP("00000000", lista.getSelectedValue().substring(0, 3), registroClientes);
                }
                pedido = true;
            } else {
                actual.getPedido().agregarProducto(lista.getSelectedValue().substring(0, 3));
            }
            listaVenta.clear();
            obtenerVenta(actual.getPedido().getDetalles());
            jlist.clear();
            obtenerLista(this.farmacia.getInventario().getMedicamentos());

        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (c != 0) {
            actual.getPedido().eliminarProducto();
            listaVenta.clear();
            obtenerVenta(actual.getPedido().getDetalles());
            jlist.clear();
            obtenerLista(this.farmacia.getInventario().getMedicamentos());
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void findClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findClientButtonActionPerformed
        if (!pedido) {
            MostrarClientes mc = new MostrarClientes(registroClientes, validador);
            mc.setVisible(true);
            System.out.println(validador.get(0));
        } else {
            AdvertenciaPedido advertencia = new AdvertenciaPedido(this, true);
            advertencia.setVisible(true);
            System.out.println("Pedido en curso");
        }
    }//GEN-LAST:event_findClientButtonActionPerformed

    private void addClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientButtonActionPerformed
        if (!pedido) {
            RegistrarCliente rc = new RegistrarCliente(registroClientes, validador);
            rc.setVisible(true);
            System.out.println(validador.get(0));
        } else {
            AdvertenciaPedido advertencia = new AdvertenciaPedido(this, true);
            advertencia.setVisible(true);
            System.out.println("Pedido en curso");
        }

    }//GEN-LAST:event_addClientButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        for (int i = 0; i <= listaVenta.getSize(); i++) {
            if (c != 0) {
                actual.getPedido().eliminarProducto();
                listaVenta.clear();
                obtenerVenta(actual.getPedido().getDetalles());
                jlist.clear();
                obtenerLista(this.farmacia.getInventario().getMedicamentos());
            }
        }
        if (c != 0) {
            actual.getPedido().eliminarProducto();
            listaVenta.clear();
            obtenerVenta(actual.getPedido().getDetalles());
            jlist.clear();
            obtenerLista(this.farmacia.getInventario().getMedicamentos());
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void chargeBoletaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeBoletaButtonActionPerformed
        if (listaVenta.getSize() > 0) {
            actual.getPedido().realizarVenta(actual.getPedido(), 0, false);
            actual.getPedido().getVenta().generarComprobante(farmacia, false);
            actual.registrarVenta(actual.getPedido().getVenta());
            //imprimir boleta
            actual.getPedido().getVenta().getBoleta().imprimir(farmacia, actual.getPedido().getVenta());
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_chargeBoletaButtonActionPerformed

    private void chargeFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeFacturaButtonActionPerformed
        if (listaVenta.getSize() > 0) {
            actual.getPedido().realizarVenta(actual.getPedido(), 0, true);
            actual.getPedido().getVenta().generarComprobante(farmacia, true);
            actual.registrarVenta(actual.getPedido().getVenta());
            System.out.println("registrado en tp");
            //imprimir factura
            actual.getPedido().getVenta().getFactura().imprimir(farmacia, actual.getPedido().getVenta());
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_chargeFacturaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TomarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TomarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addClientButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton chargeBoletaButton;
    private javax.swing.JButton chargeFacturaButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findClientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JList<String> venta;
    // End of variables declaration//GEN-END:variables
}
