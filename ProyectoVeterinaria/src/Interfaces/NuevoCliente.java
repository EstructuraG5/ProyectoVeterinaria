/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author User
 */
public class NuevoCliente extends javax.swing.JFrame {

    /**
     * Creates new form NuevoCliente
     */
    public NuevoCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPropietario = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbApellidos = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        getContentPane().setLayout(null);

        lbPropietario.setText("PROPIETARIO:");
        getContentPane().add(lbPropietario);
        lbPropietario.setBounds(29, 12, 69, 15);

        lbNombre.setText("NOMBRES:");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(29, 41, 53, 15);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(124, 39, 536, 19);

        lbApellidos.setText("APELLIDOS:");
        getContentPane().add(lbApellidos);
        lbApellidos.setBounds(29, 78, 59, 15);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(124, 76, 536, 19);

        jLabel1.setText("DNI:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 115, 19, 15);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(124, 113, 210, 19);

        jLabel2.setText("TELEFONO/CELULAR:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(352, 115, 106, 15);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(476, 113, 184, 19);

        jLabel3.setText("DIRECCION:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(29, 152, 56, 15);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(124, 150, 536, 19);

        jLabel4.setText("MASCOTA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 187, 55, 15);

        jLabel5.setText("ESPECIE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(29, 225, 43, 15);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(124, 223, 175, 19);

        jLabel6.setText("RAZA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(317, 225, 33, 15);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(362, 223, 175, 19);

        jLabel7.setText("SEXO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(555, 225, 31, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MACHO", "HEMBRA" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(589, 220, 71, 24);

        jLabel8.setText("NOMBRE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(29, 264, 46, 15);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(124, 262, 211, 19);

        jLabel9.setText("COLOR:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(353, 264, 39, 15);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(410, 262, 250, 19);

        jLabel10.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(29, 301, 117, 15);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(164, 299, 215, 19);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro_opt.png"))); // NOI18N
        jButton1.setText("REGISTRAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(519, 336, 141, 55);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 391, 0, 0);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 680, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPropietario;
    // End of variables declaration//GEN-END:variables
}
