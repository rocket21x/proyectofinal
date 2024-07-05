
package presentacion;

import dtos.PlatilloDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ControladorActualizarPlatillo;
import negocio.ControladorAdministracionSistema;
import negocio.ControladorAgregarPlatillo;
import negocio.ControladorEliminarPlatillo;

public class Inventario extends javax.swing.JFrame {

    ControladorAdministracionSistema controladorAdministracionSistema;
    ControladorAgregarPlatillo controladorAgregarPlatillo;
    ControladorActualizarPlatillo controladorActualizarPlatillo;
    ControladorEliminarPlatillo controladorEliminarPlatillo;
    
    public Inventario() {
        initComponents();
        this.controladorAgregarPlatillo = new ControladorAgregarPlatillo();
        this.controladorActualizarPlatillo = new ControladorActualizarPlatillo();
        this.controladorEliminarPlatillo = new ControladorEliminarPlatillo();
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.controladorAdministracionSistema.actualizarTablaPlatillos((DefaultTableModel) this.tablaPlatillos.getModel());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlatillos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 158, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 290, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 300, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        txtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 300, -1));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 300, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(51, 51, 51));
        txtCantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 300, -1));

        tablaPlatillos.setBackground(new java.awt.Color(255, 255, 255));
        tablaPlatillos.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        tablaPlatillos.setForeground(new java.awt.Color(51, 51, 51));
        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPlatillos.setSelectionBackground(new java.awt.Color(51, 255, 51));
        jScrollPane1.setViewportView(tablaPlatillos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 880, 550));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Platillos ingresados");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 330, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 290, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, 270, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 650, 280, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agrega platillos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        boolean validacion = this.validarDatosIngresados();

        if (!validacion) {
            System.out.println("Campos vacios.");
        } else {
            PlatilloDTO platilloDTO = new PlatilloDTO();
            platilloDTO.setNombre(txtNombre.getText());
            platilloDTO.setDescripcion(txtDescripcion.getText());
            platilloDTO.setPrecio(Double.parseDouble(txtPrecio.getText()));
            platilloDTO.setCantidad(Integer.parseInt(txtCantidad.getText()));

            this.controladorAgregarPlatillo.agregarPlatillo(platilloDTO);
            this.controladorAdministracionSistema.actualizarTablaPlatillos((DefaultTableModel) this.tablaPlatillos.getModel());
            this.limpiarCampos();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int registroSeleccionado = tablaPlatillos.getSelectedRow();
        
        if (registroSeleccionado != -1) {
            Long idPlatillo = (Long) tablaPlatillos.getValueAt(registroSeleccionado, 0);
            this.controladorEliminarPlatillo.eliminarPlatillo(idPlatillo);
            JOptionPane.showMessageDialog(this, "Se elimino el platillo correctamente.");
            this.controladorAdministracionSistema.actualizarTablaPlatillos((DefaultTableModel) this.tablaPlatillos.getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un platillo.");
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      
        int registroSeleccionado = tablaPlatillos.getSelectedRow();
        
        if (registroSeleccionado != -1) {
                 
            PlatilloDTO platilloDTO = new PlatilloDTO();
            
            platilloDTO.setId((Long) tablaPlatillos.getValueAt(registroSeleccionado, 0));
            platilloDTO.setNombre((String) tablaPlatillos.getValueAt(registroSeleccionado, 1));
            platilloDTO.setDescripcion((String) tablaPlatillos.getValueAt(registroSeleccionado, 2));
            platilloDTO.setPrecio((Double) tablaPlatillos.getValueAt(registroSeleccionado, 3));
            platilloDTO.setCantidad((int) tablaPlatillos.getValueAt(registroSeleccionado, 4));
            this.controladorEliminarPlatillo.eliminarPlatillo(platilloDTO.getId());
            this.controladorActualizarPlatillo.actualizarPlatillo(platilloDTO);
            
            JOptionPane.showMessageDialog(this, "Se actualizo el platillo correctamente.");
            this.controladorAdministracionSistema.actualizarTablaPlatillos((DefaultTableModel) this.tablaPlatillos.getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un platillo.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.controladorAdministracionSistema.abrirMenu();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public boolean validarDatosIngresados(){
        
        if (txtNombre.getText().trim().isEmpty()
                && txtDescripcion.getText().trim().isEmpty()
                && txtPrecio.getText().trim().isEmpty()
                && txtCantidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ningún campo puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; 
        }
        
        if (txtNombre.getText() == null || txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtDescripcion.getText() == null || txtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtPrecio.getText() == null || txtPrecio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El precio no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            Double.valueOf(txtPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtCantidad.getText() == null || txtCantidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cantidad no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            Integer.parseInt(txtCantidad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
        
    }
    
    
    public void limpiarCampos(){
        this.txtNombre.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
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
//            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Inventario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaPlatillos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
