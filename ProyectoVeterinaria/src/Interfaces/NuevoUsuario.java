/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Seven
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

        jLabel1 = new javax.swing.JLabel();
        ApMaternoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        UsuarioTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ApPaternoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 100, 15);
        getContentPane().add(ApMaternoTxt);
        ApMaternoTxt.setBounds(160, 110, 240, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 90, 14);
        getContentPane().add(UsuarioTxt);
        UsuarioTxt.setBounds(160, 140, 240, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 120, 14);
        getContentPane().add(NombreTxt);
        NombreTxt.setBounds(160, 50, 240, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 120, 14);
        getContentPane().add(ApPaternoTxt);
        ApPaternoTxt.setBounds(160, 80, 240, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 110, 14);
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(160, 170, 240, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 110, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario(a)", "Secretaria(o)" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 200, 110, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 200, 60, 14);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro_opt.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(263, 260, 100, 90);

        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/277126-fondo_Clínica_Veterinaria_Trabazosaa.png"))); // NOI18N
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 450, 400);

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
    private javax.swing.JTextField ApMaternoTxt;
    private javax.swing.JTextField ApPaternoTxt;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField UsuarioTxt;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
