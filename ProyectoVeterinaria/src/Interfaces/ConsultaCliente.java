/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Cliente;
import Clases.ResultadosBusqueda;
import Database.Consulta;
import Database.DB_ColaSecretaria;
import Database.Db_Atencion;
import Database.Db_Cliente;
import Database.Db_Mascota;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoEl BeJaR MaLLmA
 */
public class ConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarProducto
     */
    public ConsultaCliente() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        Buscar_ComboBox = new javax.swing.JComboBox<>();
        BuscaTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnAtender = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(520, 370));
        setPreferredSize(new java.awt.Dimension(520, 370));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Cliente"));

        btnBuscar.setText("BUSCAR ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        Buscar_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apellido", "DNI", "NombreMascota" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buscar_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BuscaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 455, 90);

        tablaCliente.setBackground(new java.awt.Color(255, 255, 204));
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCliente.setFocusable(false);
        jScrollPane1.setViewportView(tablaCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 452, 89);

        btnAtender.setText("ATENDER CLIENTE");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtender);
        btnAtender.setBounds(340, 250, 142, 43);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 520, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        Db_Cliente db_cliente = new Db_Cliente();
        ArrayList datos_cliente=new ArrayList();
        String opcion=(String) Buscar_ComboBox.getSelectedItem();
        
        if(opcion.equals("DNI")){
            int DNI=Integer.parseInt(BuscaTxt.getText());
            try {
//                db_cliente.tabla_Clientes(DNI,tablaCliente);
                    ArrayList<ResultadosBusqueda> lista_coincidencia = new ArrayList();
                    lista_coincidencia = db_cliente.Busqueda_por_DNI(DNI);
                    
                    Consulta consulta = new Consulta();
                    consulta.llenarTabla(tablaCliente, lista_coincidencia);
                
            } catch (Exception ex) {
                Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
            if(opcion.equals("Apellido")){
                
                try{
                    ArrayList<ResultadosBusqueda> lista_coincidencia = new ArrayList();
                    lista_coincidencia = db_cliente.Busqueda_por_Apellido(BuscaTxt.getText());
                    
                    Consulta consulta = new Consulta();
                    consulta.llenarTabla(tablaCliente, lista_coincidencia);
                    
                }catch (Exception ex) {
                Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(opcion.equals("NombreMascota")){
                    try{
                        ArrayList<ResultadosBusqueda> lista_coincidencia = new ArrayList();
                        lista_coincidencia = db_cliente.Busqueda_nombre_mascota(BuscaTxt.getText());

                        Consulta consulta = new Consulta();
                        consulta.llenarTabla(tablaCliente, lista_coincidencia);

                    }catch (Exception ex) {
                    Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        // TODO add your handling code here:
        String combo=(String)Buscar_ComboBox.getSelectedItem();
        DB_ColaSecretaria cola_secretaria=new DB_ColaSecretaria();
        Db_Atencion cola_atencion=new Db_Atencion();
        Db_Cliente db_cliente=new Db_Cliente();
        Db_Mascota db_mascota=new Db_Mascota();
        ArrayList<String> buscar=new ArrayList<String>();
        if(combo=="DNI"){
            int dni=Integer.parseInt(BuscaTxt.getText());
            try {
                buscar=cola_secretaria.seleccionar_cliente(dni);
                String nombre=buscar.get(0);
                String apellidoPaterno=buscar.get(1);
                String apellidoMaterno=buscar.get(2);
                int idCliente=db_cliente.buscar_idCliente(nombre, apellidoPaterno, apellidoMaterno);
                
                String mascota=db_mascota.devolver_mascota(idCliente);
                
                String historial=db_mascota.devolver_historial(idCliente);
                
                cola_atencion.Insertar_cola(nombre, apellidoPaterno, apellidoMaterno,mascota, historial);
                
            } catch (Exception ex) {
                Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAtenderActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscaTxt;
    private javax.swing.JComboBox<String> Buscar_ComboBox;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
