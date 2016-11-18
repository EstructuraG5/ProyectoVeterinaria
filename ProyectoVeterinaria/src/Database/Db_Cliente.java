/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
            String sql = "INSERT INTO vet.cliente (nombre,apellidoPaterno,apellidoMaterno,DNI,direccion,telefono)"
                + " VALUES ('"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+DNI+"','"+direccion+"','"+telefono+"'";
        
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
            String sql="SELECT nombre,ApPaterno,ApMaterno FROM vet.cliente WHERE "
                    + "nombre='"+nombre+"',ApPaterno='"+ApPaterno+"' AND ApMaterno='"+ApMaterno;
            
            ResultSet result=st.executeQuery(sql);
            if(result.next()){
                JOptionPane.showMessageDialog(null,"Se encontro un cliente");
                    //Dependiendo del tipo de usuario , ver que tipo de 
                id_cliente=result.getInt("id_Cliente");
            }
        return id_cliente;
     }
    
}