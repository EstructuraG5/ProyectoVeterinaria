/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Usuario;
import Database.Db_Usuarios;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
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
        NombreTxt = new javax.swing.JTextField();
        ApPaternoTxt = new javax.swing.JTextField();
        ApMaternoTxt = new javax.swing.JTextField();
        UsuarioTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NUEVO USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 12, -1, -1));
        getContentPane().add(NombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 56, 200, -1));
        getContentPane().add(ApPaternoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 81, 200, -1));
        getContentPane().add(ApMaternoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 107, 200, -1));
        getContentPane().add(UsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 133, 200, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 58, -1, -1));

        jLabel3.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, -1, -1));

        jLabel4.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 109, -1, -1));

        jLabel5.setText("USUARIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 135, -1, -1));
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 159, 200, -1));

        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 159, -1, -1));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 234, 138, 56));

        jLabel7.setText("TIPOUSUARIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 195, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario", "Secretaria" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 191, 200, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Usuario user=new Usuario();
        Db_Usuarios db_usuario = new Db_Usuarios();
        
        user.setNombre(UsuarioTxt.getText());
        user.setApMaterno(ApMaternoTxt.getText());
        user.setApPaterno(ApPaternoTxt.getText());
        user.setUsuario(UsuarioTxt.getText());
        char[] pass=PasswordTxt.getPassword();
        String password = new String(pass);
        user.setPassword(password);
        user.setTipoUsuario(jComboBox1.getSelectedItem().toString());
        
        if(user.getNombre().length()==0 || user.getApPaterno().length()== 0 || user.getApMaterno().length()==0 ||
                user.getUsuario().length()==0 || user.getPassword().length()==0){
            JOptionPane.showMessageDialog(null,"Uno de los campos esta vacío, por favor complete todos los campos.");
        }else{
            try {
                db_usuario.insertar_Usuarios(user.getUsuario(),user.getPassword(),user.getNombre(),
                    user.getApPaterno(),user.getApMaterno(),user.getTipoUsuario());
                this.dispose();
            }catch (Exception ex) {
                Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
  
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
    private javax.swing.JPasswordField PasswordTxt;
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
