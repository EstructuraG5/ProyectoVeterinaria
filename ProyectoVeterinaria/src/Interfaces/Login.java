/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Database.Conexion;
import Database.Db_Usuarios;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Seven
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Patitas = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Patita2 = new javax.swing.JLabel();
        Constraseña = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        textContraseña = new javax.swing.JPasswordField();
        iniciarSesion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Patitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/black-paws-walking-hi.png"))); // NOI18N
        getContentPane().add(Patitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 460, -1));

        Titulo.setFont(new java.awt.Font("Eras Medium ITC", 3, 36)); // NOI18N
        Titulo.setText("PROYECTO VET");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        Patita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Pata_opt.png"))); // NOI18N
        getContentPane().add(Patita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        Constraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/key-icon-13_opt.png"))); // NOI18N
        getContentPane().add(Constraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/User_opt.png"))); // NOI18N
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        textUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 240, 30));

        textContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 240, 30));

        iniciarSesion.setText("INICIAR SESION");
        iniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 130, 40));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/unnamed_opt.png"))); // NOI18N
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 60, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login2.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 460, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void textContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContraseñaActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        // TODO add your handling code here:
        String usuario=textUsuario.getText();
        char[] pass=textContraseña.getPassword();
        String password=new String(pass);
        boolean respuesta;
        
        
        try {
            Db_Usuarios consulta=new Db_Usuarios();
            
            respuesta=consulta.buscar_Usuarios_login(usuario, password);
            if(respuesta==true){
                String tipo=consulta.tipo_Usuario(usuario, password);
                JOptionPane.showMessageDialog(null,tipo);
                
                //2 tipos de usuario : Secretaria y Veterinario , Administrador
                if(tipo.equals("Secretaria")){
                    this.dispose();
                    Inicio_Secretaria secretaria=new Inicio_Secretaria();
                    secretaria.setVisible(true);
                }else{
                    if(tipo.equals("Veterinario")){
                        this.dispose();
                        inicio_Doctor doctor=new inicio_Doctor();
                        doctor.setVisible(true);
                    }
                }
                
            }
            
            
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_iniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Conexion connect=new Conexion();
        connect.conectar();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Constraseña;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Patita2;
    private javax.swing.JLabel Patitas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JButton salir;
    public static javax.swing.JPasswordField textContraseña;
    public static javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
