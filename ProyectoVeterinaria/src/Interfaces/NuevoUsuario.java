
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
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
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

        lbRegistro = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbApPaterno = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lbApMaterno = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lbClave = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 450));
        setPreferredSize(new java.awt.Dimension(500, 440));
        getContentPane().setLayout(null);

        lbRegistro.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbRegistro.setText("REGISTRO NUEVO USUARIO:");
        getContentPane().add(lbRegistro);
        lbRegistro.setBounds(12, 12, 162, 17);

        lbNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombre.setText("NOMBRES:");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(12, 48, 60, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(204, 47, 225, 20);

        lbApPaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApPaterno.setText("APELLIDO PATERNO:");
        getContentPane().add(lbApPaterno);
        lbApPaterno.setBounds(12, 85, 115, 17);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(204, 84, 225, 20);

        lbApMaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApMaterno.setText("APELLIDO MATERNO:");
        getContentPane().add(lbApMaterno);
        lbApMaterno.setBounds(12, 122, 119, 17);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(204, 121, 225, 20);

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbUsuario.setText("USUARIO:");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(12, 159, 57, 17);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(204, 158, 225, 20);

        lbClave.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbClave.setText("PASSWORD:");
        getContentPane().add(lbClave);
        lbClave.setBounds(12, 196, 69, 17);

        lbTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTipo.setText("TIPO:");
        getContentPane().add(lbTipo);
        lbTipo.setBounds(12, 237, 31, 17);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(204, 195, 225, 20);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario(a)", "Secretaria(o)" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 240, 101, 23);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro_opt.png"))); // NOI18N
        jButton1.setText("REGISTRAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(305, 309, 139, 53);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -5, 500, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbApMaterno;
    private javax.swing.JLabel lbApPaterno;
    private javax.swing.JLabel lbClave;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
