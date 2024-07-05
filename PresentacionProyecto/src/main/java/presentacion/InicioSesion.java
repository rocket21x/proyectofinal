
package presentacion;

import dtos.UsuarioDTO;
import javax.swing.JOptionPane;
import negocio.ControladorAdministracionSistema;

public class InicioSesion extends javax.swing.JFrame {

      ControladorAdministracionSistema controladorAdministracionSistema;
    
    public InicioSesion() {
        initComponents();
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 180, 280, 40));

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/RegUsuarioA.png"))); // NOI18N
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/RegUsuarioA.png"))); // NOI18N
        btnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/RegUsuarioP.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/ISesionA.png"))); // NOI18N
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/ISesionA.png"))); // NOI18N
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BtnInicio/ISesionP.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, 80));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 280, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.controladorAdministracionSistema.abrirRegistro();
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        boolean validacion = this.validarDatosIngresados();

        if (!validacion) {
            System.out.println("Campos vacios.");
        } else {

            char[] contraseñaArray = txtContraseña.getPassword();
            String contraseña = new String(contraseñaArray).trim();

            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setNombre(txtUsuario.getText());
            usuarioDTO.setContraseña(contraseña);

            this.controladorAdministracionSistema.iniciarSesion(usuarioDTO);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public boolean validarDatosIngresados(){
        
        String nombre = txtUsuario.getText().trim();
        char[] contraseñaArray = txtContraseña.getPassword();
        String contraseña = new String(contraseñaArray).trim();
     
        if (nombre.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void limpiarCampos(){
        this.txtUsuario.setText("");
        this.txtContraseña.setText("");
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
