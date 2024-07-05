
package presentacion;

import dtos.UsuarioDTO;
import javax.swing.JOptionPane;
import negocio.ControladorAdministracionSistema;
import negocio.ControladorAgregarUsuario;
import static negocio.FacadeAdministracionSistema.usuarioActivo;

public class Registro extends javax.swing.JFrame {

    ControladorAdministracionSistema controladorAdministracionSistema;
    ControladorAgregarUsuario controladorAgregarUsuario;
    
    public Registro() {
        initComponents();
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.controladorAgregarUsuario = new ControladorAgregarUsuario();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbRoles = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 300, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATE!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 570, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 300, 40));

        cbRoles.setBackground(new java.awt.Color(255, 255, 255));
        cbRoles.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        cbRoles.setForeground(new java.awt.Color(51, 51, 51));
        cbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesero", "Gerente", "Cocinero" }));
        getContentPane().add(cbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 300, 40));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 300, 40));

        txtConfirmarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarContraseña.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtConfirmarContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtConfirmarContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 300, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 300, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selecciona el rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 300, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 340, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        if (usuarioActivo.getNombre().isEmpty()) {
            this.setVisible(false);
            this.controladorAdministracionSistema.abrirInicioSesion();
        }else{
            this.setVisible(false);
            this.controladorAdministracionSistema.abrirMenu();
        }
        
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        if (!(usuarioActivo.getNombre() == null)) {
            boolean validacion = this.validarDatosIngresados();

            if (!validacion) {
                System.out.println("Campos vacios.");
            } else {
                char[] contraseñaArray = txtContraseña.getPassword();
                String contraseña = new String(contraseñaArray).trim();

                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setNombre(txtNombre.getText());
                usuarioDTO.setContraseña(contraseña);
                usuarioDTO.setRol(cbRoles.getSelectedItem().toString());
                this.controladorAgregarUsuario.agregarUsuario(usuarioDTO);
                JOptionPane.showConfirmDialog(null, "Empleado registrado con exito");
                return;
            }
        } 

        boolean validacion2 = this.validarDatosIngresados();

        if (!validacion2) {
            System.out.println("Campos vacios.");
        } else {
            char[] contraseñaArray = txtContraseña.getPassword();
            String contraseña = new String(contraseñaArray).trim();

            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setNombre(txtNombre.getText());
            usuarioDTO.setContraseña(contraseña);
            usuarioDTO.setRol(cbRoles.getSelectedItem().toString());
            this.controladorAgregarUsuario.agregarUsuario(usuarioDTO);

            if (null != usuarioDTO.getRol()) {
                switch (usuarioDTO.getRol()) {
                    case "Gerente" ->
                        this.controladorAdministracionSistema.abrirMenu();
                    case "Mesero" ->
                        this.controladorAdministracionSistema.abrirMenuMesero();
                    case "Cocinero" ->
                        this.controladorAdministracionSistema.abrirMenuCocinero();
                    default -> {
                    }
                }
            }

            this.limpiarCampos();
            this.setVisible(false);
        }

        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    
    
    public boolean validarDatosIngresados(){
        String nombre = txtNombre.getText().trim();
        char[] contraseñaArray = txtContraseña.getPassword();
        String contraseña = new String(contraseñaArray).trim();
        char[] confirmarContraseñaArray = txtConfirmarContraseña.getPassword();
        String confirmarContraseña = new String(confirmarContraseñaArray).trim();
        String rol = cbRoles.getSelectedItem().toString();
        if (nombre.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty() || rol.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (contraseña.length() < 8) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
           return false;
        }
        if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(this, "La contraseña y la confirmación de la contraseña no coinciden.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void limpiarCampos(){
        this.txtNombre.setText("");
        this.txtContraseña.setText("");
        this.txtConfirmarContraseña.setText("");
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
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
