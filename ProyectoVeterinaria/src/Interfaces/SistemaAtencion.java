package Interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Seven
 */
public class SistemaAtencion extends javax.swing.JFrame {

    /**
     * Creates new form SistemaAtencion
     */
    public SistemaAtencion() {
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

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ColaPacientes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ClienteTxt = new javax.swing.JTextField();
        PacienteTxt = new javax.swing.JTextField();
        HistorialTxt = new javax.swing.JTextField();
        btnTerminar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo.setText("SISTEMA DE ATENCION");
        getContentPane().add(Titulo);
        Titulo.setBounds(170, 10, 150, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LISTA DE PACIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 130, 14);

        ColaPacientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ColaPacientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 110, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PACIENTE EN ATENCION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 200, 150, 14);

        jLabel3.setText("CLIENTE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 230, 70, 14);

        jLabel4.setText("PACIENTE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 260, 60, 14);

        jLabel5.setText("HISTORIAL MEDICO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 290, 120, 14);

        ClienteTxt.setEditable(false);
        getContentPane().add(ClienteTxt);
        ClienteTxt.setBounds(140, 220, 270, 30);

        PacienteTxt.setEditable(false);
        getContentPane().add(PacienteTxt);
        PacienteTxt.setBounds(140, 250, 270, 30);

        HistorialTxt.setEditable(false);
        getContentPane().add(HistorialTxt);
        HistorialTxt.setBounds(140, 280, 270, 30);

        btnTerminar.setText("TERMINAR ATENCION");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminar);
        btnTerminar.setBounds(140, 330, 170, 40);

        btnAbrir.setText("ABRIR");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrir);
        btnAbrir.setBounds(420, 283, 70, 30);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(330, 330, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        inicio_Doctor doctor = new inicio_Doctor();
        doctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAtencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAtencion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClienteTxt;
    private javax.swing.JList<String> ColaPacientes;
    private javax.swing.JTextField HistorialTxt;
    private javax.swing.JTextField PacienteTxt;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}