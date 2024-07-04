
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Cantidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaPlatillos);

        jLabel5.setText("Platillos");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre)
                        .addComponent(txtDescripcion)
                        .addComponent(txtPrecio)
                        .addComponent(txtCantidad)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnVolver))
                .addContainerGap(27, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

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
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaPlatillos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
