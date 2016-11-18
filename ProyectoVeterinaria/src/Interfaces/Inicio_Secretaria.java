/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author GerAr
 */
public class Inicio_Secretaria extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_Secretaria
     */
    public Inicio_Secretaria() {
        initComponents();
        Toolkit mipantalla = Toolkit.getDefaultToolkit(); // nos dice el medio donde esta compilando el programa
        Dimension tampantalla = mipantalla.getScreenSize(); // devuelve la dimension de la pantalla
        int altura = tampantalla.height, ancho = tampantalla.width;
        setLocation(ancho/4, altura/8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Btn_cerrar_sesion = new javax.swing.JMenu();
        Btn_registro = new javax.swing.JMenu();
        Btn_buscar = new javax.swing.JMenu();
        Btn_cola = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Inicio_secretaria.png"))); // NOI18N
        Fondo.setAlignmentY(0.0F);
        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 102));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn_Salir.png"))); // NOI18N
        Btn_cerrar_sesion.setText("CERRAR SESIÓN");
        Btn_cerrar_sesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_cerrar_sesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_cerrar_sesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(Btn_cerrar_sesion);

        Btn_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn_Registrar.png"))); // NOI18N
        Btn_registro.setText("REGISTRO");
        Btn_registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_registro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(Btn_registro);

        Btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn_Buscar.png"))); // NOI18N
        Btn_buscar.setText("BUSCAR");
        Btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(Btn_buscar);

        Btn_cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn_Cola.png"))); // NOI18N
        Btn_cola.setText("COLA");
        Btn_cola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_cola.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(Btn_cola);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cerrar_sesionMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_Btn_cerrar_sesionMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Secretaria().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Btn_buscar;
    private javax.swing.JMenu Btn_cerrar_sesion;
    private javax.swing.JMenu Btn_cola;
    private javax.swing.JMenu Btn_registro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
