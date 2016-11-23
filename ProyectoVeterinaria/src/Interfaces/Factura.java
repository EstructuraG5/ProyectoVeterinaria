/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author User
 */
public class Factura extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form Factura
     */
    public Factura() {
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

        Cliente_Lbl = new javax.swing.JLabel();
        NombreCliente_Lbl = new javax.swing.JLabel();
        Nombre_Txt = new javax.swing.JTextField();
        ApPaterno_Lbl = new javax.swing.JLabel();
        ApPaterno_Txt = new javax.swing.JTextField();
        ApMaterno_Lbl = new javax.swing.JLabel();
        ApMaterno_Txt = new javax.swing.JTextField();
        Dni_Lbl = new javax.swing.JLabel();
        Dni_Txt = new javax.swing.JTextField();
        Direccion_Lbl = new javax.swing.JLabel();
        Direccion_Txt = new javax.swing.JTextField();
        TelCel_Lbl = new javax.swing.JLabel();
        TelCel_Txt = new javax.swing.JTextField();
        Mascota_Lbl = new javax.swing.JLabel();
        NombreMascota_Lbl = new javax.swing.JLabel();
        NombreMascota_Txt = new javax.swing.JTextField();
        Especie_Lbl = new javax.swing.JLabel();
        Especie_Txt = new javax.swing.JTextField();
        Raza_Lbl = new javax.swing.JLabel();
        Raza_Txt = new javax.swing.JTextField();
        Sexo_Lbl = new javax.swing.JLabel();
        Sexo_Txt = new javax.swing.JTextField();
        Id_Lbl = new javax.swing.JLabel();
        Id_Txt = new javax.swing.JTextField();
        FechaNac_Lbl = new javax.swing.JLabel();
        FechNacimiento_Txt = new javax.swing.JTextField();
        DesAtencion_Lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesAtencion_TxtArea = new javax.swing.JTextArea();
        Precio_Lbl = new javax.swing.JLabel();
        Precio_Txt = new javax.swing.JTextField();
        Total_Lbl = new javax.swing.JLabel();
        Total_Txt = new javax.swing.JTextField();
        Salir_Btn = new javax.swing.JButton();
        Imprimir_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cliente_Lbl.setText("CLIENTE:");
        getContentPane().add(Cliente_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        NombreCliente_Lbl.setText("NOMBRE:");
        getContentPane().add(NombreCliente_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));

        Nombre_Txt.setEditable(false);
        getContentPane().add(Nombre_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 40, 130, -1));

        ApPaterno_Lbl.setText("APELLIDO PATERNO:");
        getContentPane().add(ApPaterno_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 42, -1, -1));

        ApPaterno_Txt.setEditable(false);
        ApPaterno_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApPaterno_TxtActionPerformed(evt);
            }
        });
        getContentPane().add(ApPaterno_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 40, 130, -1));

        ApMaterno_Lbl.setText("APELLIDO MATERNO:");
        getContentPane().add(ApMaterno_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 42, -1, -1));

        ApMaterno_Txt.setEditable(false);
        getContentPane().add(ApMaterno_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 130, -1));

        Dni_Lbl.setText("DNI:");
        getContentPane().add(Dni_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        Dni_Txt.setEditable(false);
        getContentPane().add(Dni_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 72, 130, -1));

        Direccion_Lbl.setText("DIRECCION:");
        getContentPane().add(Direccion_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 74, -1, -1));

        Direccion_Txt.setEditable(false);
        getContentPane().add(Direccion_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 72, 177, -1));

        TelCel_Lbl.setText("TELEFONO/CELULAR:");
        getContentPane().add(TelCel_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 74, -1, -1));

        TelCel_Txt.setEditable(false);
        getContentPane().add(TelCel_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 72, 136, -1));

        Mascota_Lbl.setText("MASCOTA:");
        getContentPane().add(Mascota_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, -1, -1));

        NombreMascota_Lbl.setText("NOMBRE:");
        getContentPane().add(NombreMascota_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, -1, -1));

        NombreMascota_Txt.setEditable(false);
        getContentPane().add(NombreMascota_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 132, 123, -1));

        Especie_Lbl.setText("ESPECIE:");
        getContentPane().add(Especie_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 134, -1, -1));

        Especie_Txt.setEditable(false);
        getContentPane().add(Especie_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 132, 131, -1));

        Raza_Lbl.setText("RAZA:");
        getContentPane().add(Raza_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 134, -1, -1));

        Raza_Txt.setEditable(false);
        getContentPane().add(Raza_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 132, 125, -1));

        Sexo_Lbl.setText("SEXO:");
        getContentPane().add(Sexo_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 134, -1, -1));

        Sexo_Txt.setEditable(false);
        getContentPane().add(Sexo_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 132, 101, -1));

        Id_Lbl.setText("ID:");
        getContentPane().add(Id_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, -1, -1));

        Id_Txt.setEditable(false);
        getContentPane().add(Id_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 170, 123, -1));

        FechaNac_Lbl.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(FechaNac_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 172, -1, -1));

        FechNacimiento_Txt.setEditable(false);
        getContentPane().add(FechNacimiento_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 170, 114, -1));

        DesAtencion_Lbl.setText("DESCRIPCION DE ATENCION:");
        getContentPane().add(DesAtencion_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, -1, -1));

        DesAtencion_TxtArea.setColumns(20);
        DesAtencion_TxtArea.setRows(5);
        jScrollPane1.setViewportView(DesAtencion_TxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, 490, -1));

        Precio_Lbl.setText("PRECIO");
        getContentPane().add(Precio_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 208, -1, -1));
        getContentPane().add(Precio_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 253, 72, -1));

        Total_Lbl.setText("TOTAL:");
        getContentPane().add(Total_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 326, -1, -1));
        getContentPane().add(Total_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 324, 72, -1));

        Salir_Btn.setText("SALIR");
        Salir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Salir_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        Imprimir_Btn.setText("IMPRIMIR");
        Imprimir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Imprimir_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo-mediano.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_BtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Salir_BtnActionPerformed

    private void Imprimir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir_BtnActionPerformed
        // TODO add your handling code here:
        PrinterJob imprimir = PrinterJob.getPrinterJob();
        imprimir.setPrintable(this);
        if(imprimir.printDialog()){
            try{
                imprimir.print();
            }catch(PrinterException ex){
                System.out.println("ERROR" + ex);
            }
        }
    }//GEN-LAST:event_Imprimir_BtnActionPerformed

    private void ApPaterno_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApPaterno_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApPaterno_TxtActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }
     public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
        if(pageIndex == 0){
            Graphics2D g2D = (Graphics2D) graphics;
            g2D.translate(pageFormat.getImageableX()+30, pageFormat.getImageableY()+30);
            g2D.scale(0.5, 0.5);
            this.printAll(graphics);
            return PAGE_EXISTS;
        }else return NO_SUCH_PAGE;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApMaterno_Lbl;
    private javax.swing.JTextField ApMaterno_Txt;
    private javax.swing.JLabel ApPaterno_Lbl;
    private javax.swing.JTextField ApPaterno_Txt;
    private javax.swing.JLabel Cliente_Lbl;
    private javax.swing.JLabel DesAtencion_Lbl;
    private javax.swing.JTextArea DesAtencion_TxtArea;
    private javax.swing.JLabel Direccion_Lbl;
    private javax.swing.JTextField Direccion_Txt;
    private javax.swing.JLabel Dni_Lbl;
    private javax.swing.JTextField Dni_Txt;
    private javax.swing.JLabel Especie_Lbl;
    private javax.swing.JTextField Especie_Txt;
    private javax.swing.JTextField FechNacimiento_Txt;
    private javax.swing.JLabel FechaNac_Lbl;
    private javax.swing.JLabel Id_Lbl;
    private javax.swing.JTextField Id_Txt;
    private javax.swing.JButton Imprimir_Btn;
    private javax.swing.JLabel Mascota_Lbl;
    private javax.swing.JLabel NombreCliente_Lbl;
    private javax.swing.JLabel NombreMascota_Lbl;
    private javax.swing.JTextField NombreMascota_Txt;
    private javax.swing.JTextField Nombre_Txt;
    private javax.swing.JLabel Precio_Lbl;
    private javax.swing.JTextField Precio_Txt;
    private javax.swing.JLabel Raza_Lbl;
    private javax.swing.JTextField Raza_Txt;
    private javax.swing.JButton Salir_Btn;
    private javax.swing.JLabel Sexo_Lbl;
    private javax.swing.JTextField Sexo_Txt;
    private javax.swing.JLabel TelCel_Lbl;
    private javax.swing.JTextField TelCel_Txt;
    private javax.swing.JLabel Total_Lbl;
    private javax.swing.JTextField Total_Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
