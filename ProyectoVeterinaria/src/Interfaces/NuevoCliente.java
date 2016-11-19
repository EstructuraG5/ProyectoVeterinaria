/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Cliente;
import Clases.Identificador;
import Clases.Mascota;
import Database.Db_Cliente;
import Database.Db_Mascota;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NuevoCliente extends javax.swing.JFrame {

    /**
     * Creates new form NuevoCliente
     */
    public NuevoCliente() {
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

        DatosPropietarioLbl = new javax.swing.JLabel();
        NombrePropLbl = new javax.swing.JLabel();
        NombrePropTxt = new javax.swing.JTextField();
        ApPaternoLbl = new javax.swing.JLabel();
        ApPaternoTxt = new javax.swing.JTextField();
        ApMaternoLbl = new javax.swing.JLabel();
        ApMaternoTxt = new javax.swing.JTextField();
        DniLbl = new javax.swing.JLabel();
        DniTxt = new javax.swing.JTextField();
        TelCelLbl = new javax.swing.JLabel();
        TelCelTxt = new javax.swing.JTextField();
        DireccionLbl = new javax.swing.JLabel();
        DireccionTxt = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        DatosMascotaLbl = new javax.swing.JLabel();
        EspecieLbl = new javax.swing.JLabel();
        RazaLbl = new javax.swing.JLabel();
        RazaTxt = new javax.swing.JTextField();
        NombreMascotaLbl = new javax.swing.JLabel();
        NombreMascotaTxt = new javax.swing.JTextField();
        SexoLbl = new javax.swing.JLabel();
        SexoComBox = new javax.swing.JComboBox<>();
        FechaNacimientoLbl = new javax.swing.JLabel();
        FechNaciDataChooser = new com.toedter.calendar.JDateChooser();
        RegistrarBtn = new javax.swing.JButton();
        EspecieComBox = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(420, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        DatosPropietarioLbl.setText("DATOS DEL PROPIETARIO:");
        getContentPane().add(DatosPropietarioLbl);
        DatosPropietarioLbl.setBounds(12, 12, 131, 14);

        NombrePropLbl.setText("NOMBRES:");
        getContentPane().add(NombrePropLbl);
        NombrePropLbl.setBounds(12, 42, 52, 14);
        getContentPane().add(NombrePropTxt);
        NombrePropTxt.setBounds(142, 40, 266, 20);

        ApPaternoLbl.setText("APELLIDO PATERNO:");
        getContentPane().add(ApPaternoLbl);
        ApPaternoLbl.setBounds(12, 74, 102, 14);
        getContentPane().add(ApPaternoTxt);
        ApPaternoTxt.setBounds(142, 72, 266, 20);

        ApMaternoLbl.setText("APELLIDO MATERNO:");
        getContentPane().add(ApMaternoLbl);
        ApMaternoLbl.setBounds(12, 106, 104, 14);
        getContentPane().add(ApMaternoTxt);
        ApMaternoTxt.setBounds(144, 104, 264, 20);

        DniLbl.setText("DNI:");
        getContentPane().add(DniLbl);
        DniLbl.setBounds(12, 136, 22, 14);
        getContentPane().add(DniTxt);
        DniTxt.setBounds(144, 136, 264, 20);

        TelCelLbl.setText("TELEFONO/CELULAR:");
        getContentPane().add(TelCelLbl);
        TelCelLbl.setBounds(12, 170, 104, 14);
        getContentPane().add(TelCelTxt);
        TelCelTxt.setBounds(143, 168, 265, 20);

        DireccionLbl.setText("DIRECCION:");
        getContentPane().add(DireccionLbl);
        DireccionLbl.setBounds(12, 202, 61, 14);
        getContentPane().add(DireccionTxt);
        DireccionTxt.setBounds(143, 200, 265, 20);
        getContentPane().add(Separador);
        Separador.setBounds(12, 232, 396, 10);

        DatosMascotaLbl.setText("DATOS DE LA MASCOTA:");
        getContentPane().add(DatosMascotaLbl);
        DatosMascotaLbl.setBounds(12, 248, 121, 14);

        EspecieLbl.setText("ESPECIE:");
        getContentPane().add(EspecieLbl);
        EspecieLbl.setBounds(12, 278, 45, 14);

        RazaLbl.setText("RAZA:");
        getContentPane().add(RazaLbl);
        RazaLbl.setBounds(221, 278, 31, 14);
        getContentPane().add(RazaTxt);
        RazaTxt.setBounds(273, 276, 135, 20);

        NombreMascotaLbl.setText("NOMBRE:");
        getContentPane().add(NombreMascotaLbl);
        NombreMascotaLbl.setBounds(12, 312, 46, 14);
        getContentPane().add(NombreMascotaTxt);
        NombreMascotaTxt.setBounds(83, 310, 120, 20);

        SexoLbl.setText("SEXO:");
        getContentPane().add(SexoLbl);
        SexoLbl.setBounds(221, 312, 30, 14);

        SexoComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HEMBRA", "MACHO" }));
        getContentPane().add(SexoComBox);
        SexoComBox.setBounds(274, 308, 66, 20);

        FechaNacimientoLbl.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(FechaNacimientoLbl);
        FechaNacimientoLbl.setBounds(12, 345, 120, 14);
        getContentPane().add(FechNaciDataChooser);
        FechNaciDataChooser.setBounds(156, 345, 127, 20);

        RegistrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro_opt.png"))); // NOI18N
        RegistrarBtn.setText("REGISTRAR");
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarBtn);
        RegistrarBtn.setBounds(260, 388, 139, 53);

        EspecieComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERRO", "GATO", "CONEJO", "HAMSTER", "TORTUGA", "IGUANA" }));
        getContentPane().add(EspecieComBox);
        EspecieComBox.setBounds(80, 270, 120, 20);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, -4, 440, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        Mascota mascota = new Mascota();
        Db_Cliente db_cliente = new Db_Cliente();
        Db_Mascota db_mascota = new Db_Mascota();
        Identificador id=new Identificador();
        
        //Cliente
        cliente.setNombre(NombrePropTxt.getText());
        cliente.setApellidoPaterno(ApPaternoTxt.getText());
        cliente.setApellidoMaterno(ApMaternoTxt.getText());
        cliente.setDNI(Integer.parseInt(DniTxt.getText()));
        cliente.setDireccion(DireccionTxt.getText());
        cliente.setTelefono(Integer.parseInt(TelCelTxt.getText()));
        
        //Mascota
        mascota.setNombre(NombreMascotaTxt.getText());
        mascota.setEspecie((String) EspecieComBox.getSelectedItem());
        mascota.setRaza(RazaTxt.getText());
        String formato = FechNaciDataChooser.getDateFormatString();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        int dia = sdf.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = sdf.getCalendar().get(Calendar.MONTH);
        int anio = sdf.getCalendar().get(Calendar.YEAR);
        String fecha = dia+"-"+mes+""+anio;
        mascota.setFecha(fecha);
      
        int id_cliente;
        
        try {
            db_cliente.insertar_Cliente(cliente.getNombre(),cliente.getApellidoPaterno(),
                    cliente.getApellidoMaterno(),cliente.getDNI(),cliente.getDireccion(),cliente.getTelefono());
            id_cliente = db_cliente.buscar_idCliente(cliente.getNombre(),cliente.getApellidoPaterno(),cliente.getApellidoMaterno());
            String id_mascota=id.Generar(mascota.getEspecie(), id_cliente);
            
            db_mascota.insertar_Mascota(id_mascota,id_cliente, mascota.getNombre(),mascota.getEspecie(),
                mascota.getRaza(),mascota.getSexo(),mascota.getFecha());
            
        } catch (Exception ex) {
            Logger.getLogger(NuevoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_RegistrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApMaternoLbl;
    private javax.swing.JTextField ApMaternoTxt;
    private javax.swing.JLabel ApPaternoLbl;
    private javax.swing.JTextField ApPaternoTxt;
    private javax.swing.JLabel DatosMascotaLbl;
    private javax.swing.JLabel DatosPropietarioLbl;
    private javax.swing.JLabel DireccionLbl;
    private javax.swing.JTextField DireccionTxt;
    private javax.swing.JLabel DniLbl;
    private javax.swing.JTextField DniTxt;
    private javax.swing.JComboBox<String> EspecieComBox;
    private javax.swing.JLabel EspecieLbl;
    private com.toedter.calendar.JDateChooser FechNaciDataChooser;
    private javax.swing.JLabel FechaNacimientoLbl;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NombreMascotaLbl;
    private javax.swing.JTextField NombreMascotaTxt;
    private javax.swing.JLabel NombrePropLbl;
    private javax.swing.JTextField NombrePropTxt;
    private javax.swing.JLabel RazaLbl;
    private javax.swing.JTextField RazaTxt;
    private javax.swing.JButton RegistrarBtn;
    private javax.swing.JSeparator Separador;
    private javax.swing.JComboBox<String> SexoComBox;
    private javax.swing.JLabel SexoLbl;
    private javax.swing.JLabel TelCelLbl;
    private javax.swing.JTextField TelCelTxt;
    // End of variables declaration//GEN-END:variables
}
