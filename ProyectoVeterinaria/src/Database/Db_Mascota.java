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
     public void insertar_Mascota(String nombre, String especie , String raza, String fecha_nacimiento,String sexo ,
             int Cliente_DNI,String codigo_identificador ,int codigo_IdCliente) throws Exception{
        
        Conexion con=new Conexion();
        
        con.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO vet.mascota (nombre,especie,raza,edad,sexo,Cliente_DNI)"
                + " VALUES ('"+nombre+"','"+especie+"','"+raza+"','"+fecha_nacimiento+"','"+sexo+"','"+Cliente_DNI+"','"+
                    codigo_identificador+"','"+codigo_IdCliente+")";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
}
