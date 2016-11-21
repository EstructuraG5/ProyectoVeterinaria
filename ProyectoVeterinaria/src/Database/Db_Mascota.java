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
public class Db_Mascota {
     public void insertar_Mascota(String codigo_mascota,int Cliente_idCliente, String nombre, String especie,String raza ,
             String sexo,String fechaNacimiento,String historial) throws Exception{
        
        Conexion con=new Conexion();
        
        con.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO vet.mascota (Codigo_mascota,cliente_idCliente,nombreMascota,especie,raza,sexo,fechaNacimiento,historial)"
                + " VALUES ('"+codigo_mascota+"','"+Cliente_idCliente+"','"+nombre+"','"+especie+"','"+raza+"','"+sexo+"','"+
                    fechaNacimiento+"','"+historial+"')";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
}
