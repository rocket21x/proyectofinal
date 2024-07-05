/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import daos.PagoDaoImpl;
import entidades.OrdenEntity;
import entidades.PagoEntity;


public class Confirmacion extends javax.swing.JFrame {

    private PagoDaoImpl pagoDAO;
    private OrdenEntity orden;
    private boolean tipo;    

    public Confirmacion(OrdenEntity orden, boolean tipo) {
        initComponents();
        this.tipo = tipo;
        this.pagoDAO = new PagoDaoImpl();
        
        this.orden = orden;
        setLocationRelativeTo(null);
        transparenciaBtn();
        
        // Mostrar detalles de la orden en el campo de texto
        txtNoOrden.setText(String.valueOf(orden.getId()));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAceptar = new javax.swing.JButton();
        txtNoOrden = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAceptarBtn.png"))); // NOI18N
        BtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAceptarBtn.png"))); // NOI18N
        BtnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/AceptarBtn.png"))); // NOI18N
        BtnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAceptarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 90));

        txtNoOrden.setEditable(false);
        txtNoOrden.setBackground(new java.awt.Color(255, 255, 255));
        txtNoOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        txtNoOrden.setForeground(new java.awt.Color(0, 0, 0));
        txtNoOrden.setText("#");
        txtNoOrden.setBorder(null);
        getContentPane().add(txtNoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_Confirmado.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAceptarMouseClicked
        String metodo;
        if (tipo) {
            metodo = "Efectivo";
        } else {
            metodo = "Tarjeta";
        }
        // Crear el objeto Pago y guardarlo usando el DAO
        double monto = orden.getTotal();
        String descripcion = "Pago de orden " + orden.getId();

        PagoEntity nuevoPago = new PagoEntity(0, (float) monto, metodo, descripcion, "2023-06-28"); // El ID se asignará automáticamente
        nuevoPago.setMetodoPago(metodo);
//        pagoDAO.crear(nuevoPago);

        new PagoInicio().setVisible(true);
        dispose();

    }//GEN-LAST:event_BtnAceptarMouseClicked

    public void transparenciaBtn() {
        BtnAceptar.setOpaque(false);
        BtnAceptar.setContentAreaFilled(false);
        BtnAceptar.setBorderPainted(false);
        txtNoOrden.setOpaque(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField txtNoOrden;
    // End of variables declaration//GEN-END:variables
}
