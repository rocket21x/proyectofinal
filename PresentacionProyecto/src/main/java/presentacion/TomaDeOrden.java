
package presentacion;

import dtos.OrdenDTO;
import dtos.PlatilloDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ControladorAdministracionSistema;
import negocio.FacadeAdministracionSistema;


public class TomaDeOrden extends javax.swing.JFrame {

    ControladorAdministracionSistema controladorAdministracionSistema;
    public static Double total = 0.0;
    
    public TomaDeOrden() {
        initComponents();
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.controladorAdministracionSistema.actualizarTablaPlatillos((DefaultTableModel) this.tablaPlatillosOrden.getModel());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlatillosOrden = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOrdenPlatillos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnAgregarPlatillo = new javax.swing.JButton();
        btnRestarCantidad = new javax.swing.JButton();
        btnSumarCantidad = new javax.swing.JButton();
        btnTerminarOrden = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        lblNumeroMesa = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPlatillosOrden.setBackground(new java.awt.Color(255, 255, 255));
        tablaPlatillosOrden.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tablaPlatillosOrden.setForeground(new java.awt.Color(51, 51, 51));
        tablaPlatillosOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Platillo", "Nombre", "Descripcion", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPlatillosOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 550, -1));

        tablaOrdenPlatillos.setBackground(new java.awt.Color(255, 255, 255));
        tablaOrdenPlatillos.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tablaOrdenPlatillos.setForeground(new java.awt.Color(51, 51, 51));
        tablaOrdenPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Platillo", "Nombre", "Descripcion", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaOrdenPlatillos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 500, 430));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione los platillos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 18, 320, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Platillos de la orden:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 280, -1));

        btnMesa2.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa2.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa2.setText("2");
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 129, 73));

        btnMesa3.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa3.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa3.setText("3");
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 129, 73));

        btnMesa1.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa1.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa1.setText("1");
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 129, 73));

        btnMesa5.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa5.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa5.setText("5");
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 129, 73));

        btnMesa6.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa6.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa6.setText("6");
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 129, 73));

        btnMesa4.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnMesa4.setForeground(new java.awt.Color(51, 51, 51));
        btnMesa4.setText("4");
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 129, 73));

        btnAgregarPlatillo.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarPlatillo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnAgregarPlatillo.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregarPlatillo.setText("Agregar platillo");
        btnAgregarPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlatilloActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 180, 40));

        btnRestarCantidad.setBackground(new java.awt.Color(255, 255, 255));
        btnRestarCantidad.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnRestarCantidad.setForeground(new java.awt.Color(51, 51, 51));
        btnRestarCantidad.setText("-");
        btnRestarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, 140, 40));

        btnSumarCantidad.setBackground(new java.awt.Color(255, 255, 255));
        btnSumarCantidad.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnSumarCantidad.setForeground(new java.awt.Color(51, 51, 51));
        btnSumarCantidad.setText("+");
        btnSumarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnSumarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 140, 40));

        btnTerminarOrden.setBackground(new java.awt.Color(255, 255, 255));
        btnTerminarOrden.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnTerminarOrden.setForeground(new java.awt.Color(51, 51, 51));
        btnTerminarOrden.setText("Terminar orden");
        btnTerminarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 180, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 70, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agregar Nota adicional:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, -1, -1));

        txtNota.setBackground(new java.awt.Color(255, 255, 255));
        txtNota.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtNota.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, 290, 40));

        lblNumeroMesa.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblNumeroMesa.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 50, 30));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, 180, 40));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccionar Mesa:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 180, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlatilloActionPerformed

        int registro = this.tablaPlatillosOrden.getSelectedRow();

        if (registro != -1) {

            DefaultTableModel model = (DefaultTableModel) this.tablaPlatillosOrden.getModel();

            Long idPlatillo = (Long) model.getValueAt(registro, 0);
            String nombre = (String) model.getValueAt(registro, 1);
            String descripcion = (String) model.getValueAt(registro, 2);
            Double precio = (Double) model.getValueAt(registro, 3);
            
            PlatilloDTO platilloDTO = new PlatilloDTO();
            platilloDTO.setId(idPlatillo);
            platilloDTO.setNombre(nombre);
            platilloDTO.setPrecio(precio);
            platilloDTO.setCantidad(1);
            platilloDTO.setDescripcion(descripcion);

            this.sumarTotal(platilloDTO.getPrecio());
            this.controladorAdministracionSistema.agregarPlatilloSeleccionado(platilloDTO);
            this.controladorAdministracionSistema.actualizarTablaPlatillosSeleccionados((DefaultTableModel) this.tablaOrdenPlatillos.getModel());
        } else {

            JOptionPane.showMessageDialog(this, "Por favor, selecciona un platillo de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarPlatilloActionPerformed

    private void btnTerminarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarOrdenActionPerformed
        
        if (lblNumeroMesa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona una mesa para continuar.");
            return;
        }

        if (lblTotal.getText().isEmpty() || !isNumeric(lblTotal.getText())) {
            JOptionPane.showMessageDialog(this, "El total no es válido.");
            return;
        }

        if (tablaOrdenPlatillos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Debe haber al menos un platillo en la orden.");
            return;
        }

        int numMesa = Integer.parseInt(this.lblNumeroMesa.getText());
        int numeroOrden = (int) (System.currentTimeMillis() & 0xffffff);

        OrdenDTO ordenDTO = new OrdenDTO();
        ordenDTO.setNumeroMesa(numMesa);
        ordenDTO.setNumeroOrden(numeroOrden);
        ordenDTO.setNotas(txtNota.getText());
        ordenDTO.setEstado("Ingresada");
        ordenDTO.setTotal(Double.valueOf(this.lblTotal.getText()));
        ordenDTO.setOrdenPlatillos(new ArrayList<>());

        this.controladorAdministracionSistema.terminarOrden(ordenDTO);

        DefaultTableModel model = (DefaultTableModel) tablaOrdenPlatillos.getModel();
        model.setRowCount(0);

        lblNumeroMesa.setText("");
        txtNota.setText("");
        lblTotal.setText("0.00");
        this.total = 0.0;

    }//GEN-LAST:event_btnTerminarOrdenActionPerformed

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void btnSumarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarCantidadActionPerformed
        
        int registro = this.tablaOrdenPlatillos.getSelectedRow();
        
         if (registro != -1) {

            DefaultTableModel model = (DefaultTableModel) this.tablaOrdenPlatillos.getModel();

            Long idPlatillo = (Long) model.getValueAt(registro, 0);
            String nombre = (String) model.getValueAt(registro, 1);
            String descripcion = (String) model.getValueAt(registro, 2);
            Double precio = (Double) model.getValueAt(registro, 3);
            int cantidad = (int) model.getValueAt(registro, 4);
            
            PlatilloDTO platilloDTO = new PlatilloDTO();
            platilloDTO.setId(idPlatillo);
            platilloDTO.setNombre(nombre);
            platilloDTO.setPrecio(precio);
            platilloDTO.setCantidad(cantidad +1);
            platilloDTO.setDescripcion(descripcion);
            
            this.controladorAdministracionSistema.sumarPlatilloCantidad(platilloDTO);
            this.controladorAdministracionSistema.actualizarTablaPlatillosSeleccionados((DefaultTableModel) this.tablaOrdenPlatillos.getModel());
         }
    }//GEN-LAST:event_btnSumarCantidadActionPerformed

    private void btnRestarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarCantidadActionPerformed
        
        int registro = this.tablaOrdenPlatillos.getSelectedRow();

        if (registro != -1) {

            DefaultTableModel model = (DefaultTableModel) this.tablaOrdenPlatillos.getModel();

            Long idPlatillo = (Long) model.getValueAt(registro, 0);
            String nombre = (String) model.getValueAt(registro, 1);
            String descripcion = (String) model.getValueAt(registro, 2);
            Double precio = (Double) model.getValueAt(registro, 3);
            int cantidad = (int) model.getValueAt(registro, 4);

            
            PlatilloDTO platilloDTO = new PlatilloDTO();
            platilloDTO.setId(idPlatillo);
            platilloDTO.setNombre(nombre);
            platilloDTO.setPrecio(precio);
            platilloDTO.setCantidad(cantidad - 1);
            platilloDTO.setDescripcion(descripcion);
            
            this.restarTotal(platilloDTO.getPrecio());
            
            if (cantidad <= 1) {
                this.controladorAdministracionSistema.eliminarPlatilloSeleccionado(platilloDTO);
                this.controladorAdministracionSistema.actualizarTablaPlatillosSeleccionados((DefaultTableModel) this.tablaOrdenPlatillos.getModel());
            }
            this.controladorAdministracionSistema.restarPlatilloCantidad(platilloDTO);
            this.controladorAdministracionSistema.actualizarTablaPlatillosSeleccionados((DefaultTableModel) this.tablaOrdenPlatillos.getModel());
        }
    }//GEN-LAST:event_btnRestarCantidadActionPerformed

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        this.lblNumeroMesa.setText("1");
    }//GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        this.lblNumeroMesa.setText("2");
    }//GEN-LAST:event_btnMesa2ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        this.lblNumeroMesa.setText("3");
    }//GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        this.lblNumeroMesa.setText("4");
    }//GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        this.lblNumeroMesa.setText("5");
    }//GEN-LAST:event_btnMesa5ActionPerformed

    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
       this.lblNumeroMesa.setText("6");
    }//GEN-LAST:event_btnMesa6ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       
        if ("Gerente".equals(FacadeAdministracionSistema.usuarioActivo.getRol())) {
             this.setVisible(false);
            this.controladorAdministracionSistema.abrirMenu();
        }else{
            this.setVisible(false);
        this.controladorAdministracionSistema.abrirMenuMesero();

        }
        
    }//GEN-LAST:event_btnVolverActionPerformed

    public void sumarTotal(Double precio) {
        this.total += precio;
        this.lblTotal.setText(String.format("%.2f", total));
    }

    public void restarTotal(Double precio) {
        this.total -= precio;
        this.lblTotal.setText(String.format("%.2f", total));
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
//            java.util.logging.Logger.getLogger(TomaDeOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TomaDeOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TomaDeOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TomaDeOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TomaDeOrden().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPlatillo;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnRestarCantidad;
    private javax.swing.JButton btnSumarCantidad;
    private javax.swing.JButton btnTerminarOrden;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumeroMesa;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaOrdenPlatillos;
    public static javax.swing.JTable tablaPlatillosOrden;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
