/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
 */
public class Db_Cliente {
     public void insertar_Cliente(int DNI,String nombre ,String ApellidoPaterno,String ApellidoMaterno,
             int telefono , String direccion) throws Exception{
        
        Conexion con=new Conexion();
        
        con.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO vet.cliente (DNI,nombre,ApellidoPaterno,ApellidoMaterno,telefono,direccion)"
                + " VALUES ('"+DNI+"','"+nombre+"','"+ApellidoPaterno+"','"+ApellidoMaterno+"','"+telefono+"','"+direccion+"'";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
}
