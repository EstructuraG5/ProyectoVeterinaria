
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Usuario;
import Database.Db_Usuarios;
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD

import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.event.KeyEvent;

=======
>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
=======
>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
>>>>>>> 33c373575dd8133901dac1419b5cf18d05d4ab26
import java.util.logging.Level;
import java.util.logging.Logger;

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
        JNombre = new javax.swing.JTextField();
        lbApPaterno = new javax.swing.JLabel();
        JApPaterno = new javax.swing.JTextField();
        lbApMaterno = new javax.swing.JLabel();
        JApMaterno = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        JUsuario = new javax.swing.JTextField();
        lbClave = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        JTipoUsuario = new javax.swing.JComboBox<>();
        JRegistrar = new javax.swing.JButton();
        JPassword = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        lbRegistro.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbRegistro.setText("REGISTRO NUEVO USUARIO:");
        getContentPane().add(lbRegistro);
        lbRegistro.setBounds(12, 12, 162, 17);

        lbNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombre.setText("NOMBRES:");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(12, 48, 60, 17);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

        JNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
<<<<<<< HEAD
=======
=======

>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
=======

>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 33c373575dd8133901dac1419b5cf18d05d4ab26
        JNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JNombreKeyTyped(evt);
            }
        });
>>>>>>> origin/master
=======
>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
=======
>>>>>>> parent of 0423b5b... InterfazNuevoUsuario
        getContentPane().add(JNombre);
        JNombre.setBounds(204, 47, 225, 20);

        lbApPaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApPaterno.setText("APELLIDO PATERNO:");
        getContentPane().add(lbApPaterno);
        lbApPaterno.setBounds(12, 85, 115, 17);
        getContentPane().add(JApPaterno);
        JApPaterno.setBounds(204, 84, 225, 20);

        lbApMaterno.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApMaterno.setText("APELLIDO MATERNO:");
        getContentPane().add(lbApMaterno);
        lbApMaterno.setBounds(12, 122, 119, 17);
        getContentPane().add(JApMaterno);
        JApMaterno.setBounds(204, 121, 225, 20);

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbUsuario.setText("USUARIO:");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(12, 159, 57, 17);
        getContentPane().add(JUsuario);
        JUsuario.setBounds(204, 158, 225, 20);

        lbClave.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbClave.setText("PASSWORD:");
        getContentPane().add(lbClave);
        lbClave.setBounds(12, 196, 69, 17);

        lbTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTipo.setText("TIPO:");
        getContentPane().add(lbTipo);
        lbTipo.setBounds(12, 237, 31, 17);

        JTipoUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        JTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinario(a)", "Secretaria(o)" }));
        getContentPane().add(JTipoUsuario);
        JTipoUsuario.setBounds(210, 240, 101, 26);

        JRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro_opt.png"))); // NOI18N
        JRegistrar.setText("REGISTRAR");
        JRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(JRegistrar);
        JRegistrar.setBounds(305, 309, 148, 55);
        getContentPane().add(JPassword);
        JPassword.setBounds(210, 200, 220, 20);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, -5, 500, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void JRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRegistrarActionPerformed
        // TODO add your handling code here:
        Usuario user= new Usuario();
        Db_Usuarios Insert=new Db_Usuarios();
        char[] pass = JPassword.getPassword();
        String password  = new String(pass);
        
        user.setNombre(JNombre.getText());
        user.setApMaterno(JApMaterno.getText());
        user.setApPaterno(JApPaterno.getText());
        user.setUsuario(JUsuario.getText());
        user.setPassword(password);
        user.setTipoUsuario((String) JTipoUsuario.getSelectedItem());
        System.out.println(user.getUsuario()+" "+user.getPassword()+" "+
                user.getNombre()+" "+user.getApMaterno()+" "+user.getApPaterno()+" "+
                user.getTipoUsuario());
        
        try {
            Insert.insertar_Usuarios(user.getUsuario(),user.getPassword(),user.getNombre(),user.getApPaterno()
                    , user.getApMaterno(),user.getTipoUsuario());
        } catch (Exception ex) {
            Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JRegistrarActionPerformed

    private void JNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JNombreKeyTyped

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
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField JApMaterno;
    private javax.swing.JTextField JApPaterno;
    private javax.swing.JTextField JNombre;
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JButton JRegistrar;
    private javax.swing.JComboBox<String> JTipoUsuario;
    private javax.swing.JTextField JUsuario;
    private javax.swing.JLabel lbApMaterno;
    private javax.swing.JLabel lbApPaterno;
    private javax.swing.JLabel lbClave;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
