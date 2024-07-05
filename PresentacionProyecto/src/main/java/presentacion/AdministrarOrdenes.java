package presentacion;

import dtos.OrdenDTO;
import dtos.OrdenPlatilloDTO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import negocio.ControladorAdministracionSistema;

public class AdministrarOrdenes extends javax.swing.JFrame {

    ControladorAdministracionSistema controladorAdministracionSistema;

    public AdministrarOrdenes() {
        initComponents();
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.controladorAdministracionSistema.actualizarTablaOrdenes((DefaultTableModel) tablaOrdenes.getModel());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPlatillosOrden = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnListoParaServir = new javax.swing.JButton();
        btnPendiente = new javax.swing.JButton();
        btnPreparando = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaOrdenes.setBackground(new java.awt.Color(255, 255, 255));
        tablaOrdenes.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tablaOrdenes.setForeground(new java.awt.Color(51, 51, 51));
        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idOrden", "Numero Mesa", "Numero Orden", "Notas", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaOrdenes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 369));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ordenes activas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, -1));

        tablaPlatillosOrden.setBackground(new java.awt.Color(255, 255, 255));
        tablaPlatillosOrden.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tablaPlatillosOrden.setForeground(new java.awt.Color(51, 51, 51));
        tablaPlatillosOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Orden", "Platillo"
            }
        ));
        jScrollPane2.setViewportView(tablaPlatillosOrden);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 520, 369));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Platillos de la orden");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 400, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 200, 100));

        btnListoParaServir.setBackground(new java.awt.Color(255, 255, 255));
        btnListoParaServir.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnListoParaServir.setForeground(new java.awt.Color(51, 51, 51));
        btnListoParaServir.setText("Listo para Servir");
        btnListoParaServir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListoParaServir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoParaServirActionPerformed(evt);
            }
        });
        getContentPane().add(btnListoParaServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 290, 110));

        btnPendiente.setBackground(new java.awt.Color(255, 255, 255));
        btnPendiente.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnPendiente.setForeground(new java.awt.Color(51, 51, 51));
        btnPendiente.setText("Pendiente");
        btnPendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 310, 100));

        btnPreparando.setBackground(new java.awt.Color(255, 255, 255));
        btnPreparando.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnPreparando.setForeground(new java.awt.Color(51, 51, 51));
        btnPreparando.setText("Preparando");
        btnPreparando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPreparando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreparandoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreparando, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 290, 100));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("Cancelado");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 310, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteActionPerformed
      
        int registroSeleccionado = tablaOrdenes.getSelectedRow();
        if (registroSeleccionado != -1) {
            DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();

            Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
            Integer numeroMesa = (Integer) model.getValueAt(registroSeleccionado, 1);
            Integer numeroOrden = (Integer) model.getValueAt(registroSeleccionado, 2);
            String notas = (String) model.getValueAt(registroSeleccionado, 3);

            OrdenDTO ordenDTO = new OrdenDTO();

            ordenDTO.setId(idOrden);
            ordenDTO.setNumeroMesa(numeroMesa);
            ordenDTO.setNumeroOrden(numeroOrden);
            ordenDTO.setNotas(notas);
            ordenDTO.setEstado("Pendiente");

            this.controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
            this.controladorAdministracionSistema.actualizarOrden(ordenDTO);
            this.controladorAdministracionSistema.actualizarTablaOrdenes(model);

    }//GEN-LAST:event_btnPendienteActionPerformed

        tablaOrdenes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && tablaOrdenes.getSelectedRow() != -1) {
                    // Llamar a la acción de la selección de fila
                    DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();
                    Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
                    controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
                    
                }
            }
        });
    }

    private void btnPreparandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreparandoActionPerformed
       
        int registroSeleccionado = tablaOrdenes.getSelectedRow();
        if (registroSeleccionado != -1) {
            DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();

            Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
            Integer numeroMesa = (Integer) model.getValueAt(registroSeleccionado, 1);
            Integer numeroOrden = (Integer) model.getValueAt(registroSeleccionado, 2);
            String notas = (String) model.getValueAt(registroSeleccionado, 3);

            OrdenDTO ordenDTO = new OrdenDTO();

            ordenDTO.setId(idOrden);
            ordenDTO.setNumeroMesa(numeroMesa);
            ordenDTO.setNumeroOrden(numeroOrden);
            ordenDTO.setNotas(notas);
            ordenDTO.setEstado("Preparando");

            this.controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
            this.controladorAdministracionSistema.actualizarOrden(ordenDTO);
            this.controladorAdministracionSistema.actualizarTablaOrdenes(model);
    }//GEN-LAST:event_btnPreparandoActionPerformed
}
    private void btnListoParaServirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoParaServirActionPerformed
        // TODO add your handling code here:
        int registroSeleccionado = tablaOrdenes.getSelectedRow();
        if (registroSeleccionado != -1) {
            DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();

            Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
            Integer numeroMesa = (Integer) model.getValueAt(registroSeleccionado, 1);
            Integer numeroOrden = (Integer) model.getValueAt(registroSeleccionado, 2);
            String notas = (String) model.getValueAt(registroSeleccionado, 3);

            OrdenDTO ordenDTO = new OrdenDTO();

            ordenDTO.setId(idOrden);
            ordenDTO.setNumeroMesa(numeroMesa);
            ordenDTO.setNumeroOrden(numeroOrden);
            ordenDTO.setNotas(notas);
            ordenDTO.setEstado("Listo");

            this.controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
            this.controladorAdministracionSistema.actualizarOrden(ordenDTO);
            this.controladorAdministracionSistema.actualizarTablaOrdenes(model);
    }//GEN-LAST:event_btnListoParaServirActionPerformed
}
    private void tablaOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrdenesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();
        int registroSeleccionado = tablaOrdenes.getSelectedRow();
                    Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
                    controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
    }//GEN-LAST:event_tablaOrdenesMouseClicked
    

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        this.controladorAdministracionSistema.abrirMenuCocinero();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int registroSeleccionado = tablaOrdenes.getSelectedRow();
        if (registroSeleccionado != -1) {
            DefaultTableModel model = (DefaultTableModel) tablaOrdenes.getModel();

            Long idOrden = (Long) model.getValueAt(registroSeleccionado, 0);
            Integer numeroMesa = (Integer) model.getValueAt(registroSeleccionado, 1);
            Integer numeroOrden = (Integer) model.getValueAt(registroSeleccionado, 2);
            String notas = (String) model.getValueAt(registroSeleccionado, 3);

            OrdenDTO ordenDTO = new OrdenDTO();

            ordenDTO.setId(idOrden);
            ordenDTO.setNumeroMesa(numeroMesa);
            ordenDTO.setNumeroOrden(numeroOrden);
            ordenDTO.setNotas(notas);
            ordenDTO.setEstado("Cancelado");

            this.controladorAdministracionSistema.actualizarTablaOrdenPlatillo((DefaultTableModel) tablaPlatillosOrden.getModel(), idOrden);
            this.controladorAdministracionSistema.actualizarOrden(ordenDTO);
            this.controladorAdministracionSistema.actualizarTablaOrdenes(model);
    }//GEN-LAST:event_btnCancelarActionPerformed
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InicioSesion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListoParaServir;
    private javax.swing.JButton btnPendiente;
    private javax.swing.JButton btnPreparando;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tablaOrdenes;
    public static javax.swing.JTable tablaPlatillosOrden;
    // End of variables declaration//GEN-END:variables
}
