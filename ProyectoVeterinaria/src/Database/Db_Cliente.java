/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GerAr
 */
public class Db_Cliente {
     public void insertar_Cliente(String nombre,String apellidoPaterno,String apellidoMaterno,int DNI,
             String direccion,int telefono) throws Exception{
        
        Conexion con=new Conexion();
        
        con.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO vet.cliente (nombreCliente,apPaterno,apMaterno,DNI,telefono,direccion)"
                + " VALUES ('"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+DNI+"','"+telefono+"','"+direccion+"')";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
     
     public int buscar_idCliente(String nombre,String ApPaterno, String ApMaterno) throws Exception{
        Conexion connect=new Conexion();
        connect.conectar();
        int id_cliente=0;
       
            Statement st=connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.cliente WHERE "
                    + "nombreCliente='"+nombre+"' AND apPaterno='"+ApPaterno+"' AND apMaterno='"+ApMaterno+"'";
            
            ResultSet result=st.executeQuery(sql);
            if(result.next()){
                    //Dependiendo del tipo de usuario , ver que tipo de 
                id_cliente=result.getInt("idCliente");
            }
        return id_cliente;
     }

     DefaultTableModel dtm;
     public DefaultTableModel tabla_Clientes(int DNI,JTable tabla) throws Exception{
         ArrayList cliente=new ArrayList();
         Conexion con=new Conexion();
         dtm = new DefaultTableModel();
         tabla.setModel(dtm);
         con.conectar();
         Statement st = con.getConexion().createStatement();
         String sql="SELECT * FROM vet.cliente WHERE DNI='"+DNI+"'";
         ResultSet rs = st.executeQuery(sql);
         
         dtm.setColumnIdentifiers(new Object[]{"Nombre","ApellidoPaterno","Apellido Materno","DNI","Telefono","Direccion"});
         while(rs.next()){
             dtm.addRow(new Object[]{
                    rs.getString("nombreCliente"),
                    rs.getString("apPaterno"),
                    rs.getString("apMaterno"),
                    rs.getInt("DNI"),
                    rs.getInt("telefono"),
                    rs.getString("direccion")
         });
         }
         con.cerrarConexion();
         return dtm;
     }
}