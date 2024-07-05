package presentacion;

import daos.OrdenDaoImpl;
import entidades.OrdenEntity;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Optional;
import negocio.ControladorAdministracionSistema;

public class PagoInicio extends javax.swing.JFrame {

    private OrdenDaoImpl ordenDAO;
    ControladorAdministracionSistema controladorAdministracionSistema;
            
    

    public PagoInicio() {
        initComponents();
//        transparenciaBtn();
        setLocationRelativeTo(null);
        this.controladorAdministracionSistema = new ControladorAdministracionSistema();
        this.controladorAdministracionSistema.actualizarTablaOrdenes((DefaultTableModel) tablaPago.getModel());
        this.ordenDAO = new OrdenDaoImpl();
        //cargarOrden();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEfectivo = new javax.swing.JButton();
        BtnTarjeta = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AEfectivoBtn.png"))); // NOI18N
        BtnEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/efectivoBtn.png"))); // NOI18N
        BtnEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEfectivoMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, 70));

        BtnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/ATarjetaBtn.png"))); // NOI18N
        BtnTarjeta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/tarjetaBtn.png"))); // NOI18N
        BtnTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTarjetaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 140, 70));

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Apagado/AAtrasBtn2.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/M/atrasBtn2.png"))); // NOI18N
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 140, 70));

        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tablaPago);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 310));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/M/pago_Individual.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEfectivoMouseClicked

//        int filaSeleccionada = TablaPago.getSelectedRow();
//
//        if (filaSeleccionada != -1) {
//            int ordenId = (int) TablaPago.getValueAt(filaSeleccionada, 0);
//            try {
//                Optional<OrdenEntity> ordenOptional = ordenDAO.obtenerPorId(ordenId);
//                if (ordenOptional.isPresent()) {
//                    OrdenEntity orden = ordenOptional.get();
//                    Efectivo efectivo = new Efectivo(orden);
//                    efectivo.setVisible(true);
//                    this.setVisible(false);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Orden no encontrada.");
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Error al cargar la orden: " + e.getMessage());
//                e.printStackTrace();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
//        }
    }//GEN-LAST:event_BtnEfectivoMouseClicked

    private void BtnTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTarjetaMouseClicked
//        int filaSeleccionada = TablaPago.getSelectedRow();
//
//        if (filaSeleccionada != -1) {
//            int ordenId = (int) TablaPago.getValueAt(filaSeleccionada, 0);
//            try {
//                Optional<OrdenEntity> ordenOptional = ordenDAO.obtenerPorId(ordenId);
//                if (ordenOptional.isPresent()) {
//                    OrdenEntity orden = ordenOptional.get();
//                    Tarjeta tarjeta = new Tarjeta(orden);
//                    tarjeta.setVisible(true);
//                    this.setVisible(false);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Orden no encontrada.");
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Error al cargar la orden: " + e.getMessage());
//                e.printStackTrace();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecciona una fila primero");
//        }

    }//GEN-LAST:event_BtnTarjetaMouseClicked

//    public JTable getTablaPago() {
////        return TablaPago;
//    }

//    public void transparenciaBtn() {
//        BtnEfectivo.setOpaque(false);
//        BtnEfectivo.setContentAreaFilled(false);
//        BtnEfectivo.setBorderPainted(false);
//        BtnSalir.setOpaque(false);
//        BtnSalir.setContentAreaFilled(false);
//        BtnSalir.setBorderPainted(false);
//        BtnTarjeta.setOpaque(false);
//        BtnTarjeta.setContentAreaFilled(false);
//        BtnTarjeta.setBorderPainted(false);
//        TablaPago.setOpaque(false);
//        jScrollPane1.setOpaque(false);
//    }
/**
    public void cargarOrden() {
        DefaultTableModel modelo = (DefaultTableModel) TablaPago.getModel();
        modelo.setRowCount(0);
        try {
            List<OrdenEntity> ordenes = ordenDAO.obtenerTodos();
            for (OrdenEntity orden : ordenes) {
                //modelo.addRow(new Object[]{orden.getId(), orden.getNumeroMesa(), orden.getPlatillos(), orden.getTotal()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las órdenes: " + e.getMessage());
            e.printStackTrace();
        }

    }
**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEfectivo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTarjeta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPago;
    // End of variables declaration//GEN-END:variables
}
