/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Database.Conexion;
import Database.Db_Usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

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
        Toolkit mipantalla = Toolkit.getDefaultToolkit(); // nos dice el medio donde esta compilando el programa
        Dimension tampantalla = mipantalla.getScreenSize(); // devuelve la dimension de la pantalla
        int altura = tampantalla.height, ancho = tampantalla.width;
        setLocation(ancho/3, altura/8);
        
        
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
        textUsuario = new javax.swing.JTextField();
        textContraseña = new javax.swing.JPasswordField();
        iniciarSesion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        Patitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/black-paws-walking-hi.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 330));
        setMinimumSize(new java.awt.Dimension(600, 330));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, 30));

        textContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContraseñaActionPerformed(evt);
            }
        });
        textContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 30));

        iniciarSesion.setText("INICIAR SESION");
        iniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 130, 40));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/unnamed_opt.png"))); // NOI18N
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Login_Fondo.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(600, 337));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
                if(tipo.equals("Secretaria"))
                     JOptionPane.showMessageDialog(null,"Bienvenido "+tipo,"Tipo de Usuario",JOptionPane.INFORMATION_MESSAGE);
                else
                     if(tipo.equals("Veterinario"))
                                 JOptionPane.showMessageDialog(null,"Bienvenido "+tipo,"Tipo de Usuario",JOptionPane.INFORMATION_MESSAGE);

               
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
                
            }else{
                if(respuesta==false){
                    textUsuario.setText("");
                    textContraseña.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void textUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyPressed
        // TODO add your handling code here:
        char cTeclaPresionada =evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            iniciarSesion.doClick();
        }
    }//GEN-LAST:event_textUsuarioKeyPressed

    private void textContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyPressed
        // TODO add your handling code here:
         char cTeclaPresionada =evt.getKeyChar();
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            iniciarSesion.doClick();
        }
    }//GEN-LAST:event_textContraseñaKeyPressed

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
                Login nuevo = new Login();
                nuevo.setVisible(true);
                nuevo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Patitas;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JButton salir;
    public static javax.swing.JPasswordField textContraseña;
    public static javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
