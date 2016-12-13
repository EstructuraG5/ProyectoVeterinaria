/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Database.Conexion_Factura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BuscarCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCliente
     */
    Conexion_Factura con = new Conexion_Factura();
    DefaultTableModel modelo;
    Connection cn = con.conexion();
    public BuscarCliente() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarCliente("");
    }
    void mostrarCliente(String valor){
        mostrarTitulos();
        String [] registro = new String [6];
        String sql = "";
        if(valor.equals("")){
            sql = "SELECT * FROM vet.cliente";
        }else{
            sql = "SELECT * FROM  vet.cliente WHERE CONCAT (DNI, nombreCliente, apPaterno, apMaterno) LIKE '%"+valor+"%'";
        }
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0] = rs.getString("nombreCliente");
                registro[1] = rs.getString("apPaterno");
                registro[2] = rs.getString("apMaterno");
                registro[3] = rs.getString("DNI");
                registro[4] = rs.getString("telefono");
                registro[5] = rs.getString("direccion");
                modelo.addRow(registro);
                
            }
            Tabla.setModel(modelo);
        }catch(SQLException e){
            System.out.println();
        }
    }
    void mostrarTitulos(){
        String [] titulos = {"NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "DNI", "TELEFONO", "DIRECCION"};
        String datos [][] = {};
        modelo = new DefaultTableModel(datos, titulos);
        Tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        BuscarCLiente = new javax.swing.JLabel();
        BuscarClinete_Txt = new javax.swing.JTextField();
        Buscar_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("Enviar Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarCLiente.setText("BUSCAR CLIENTE:");
        getContentPane().add(BuscarCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, -1, -1));
        getContentPane().add(BuscarClinete_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 20, 144, -1));

        Buscar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BuscarCliente_ParaFactura.jpg"))); // NOI18N
        Buscar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 20, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 54, 375, 275));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo Historial -  medico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 430, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buscar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_BtnActionPerformed
        // TODO add your handling code here:
        mostrarCliente(BuscarClinete_Txt.getText());
        BuscarClinete_Txt.setText("");
    }//GEN-LAST:event_Buscar_BtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String nom = "", pater = "", mater = "", DNI = "", telCel = "", direc = "";
        int fil = Tabla.getSelectedRow();
        try{
            if(fil == -1){
                JOptionPane.showMessageDialog(null, "NO SELECCIONÓ NINGUN DATO");
            }else{
                nom = (String) Tabla.getValueAt(fil, 0);
                pater = (String) Tabla.getValueAt(fil, 1);
                mater = (String) Tabla.getValueAt(fil, 2);
                DNI = (String) Tabla.getValueAt(fil, 3);
                telCel = (String) Tabla.getValueAt(fil, 4);
                direc = (String) Tabla.getValueAt(fil, 5);
                Factura.Nombre_Txt.setText(nom);
                Factura.ApPaterno_Txt.setText(pater);
                Factura.ApMaterno_Txt.setText(mater);
                Factura.Dni_Txt.setText(DNI);
                Factura.Direccion_Txt.setText(direc);
                Factura.TelCel_Txt.setText(telCel);
                this.dispose();
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarCLiente;
    private javax.swing.JTextField BuscarClinete_Txt;
    private javax.swing.JButton Buscar_Btn;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}