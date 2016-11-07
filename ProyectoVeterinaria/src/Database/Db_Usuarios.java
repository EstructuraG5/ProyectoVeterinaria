/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
 */
public class Db_Usuarios {
    Connection con;
    
    public void insertar_Usuarios(String usuario, String password , String Nombres,
            String ApPaterno,String ApMaterno , String TipoUsuario) throws Exception{
        
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=con.createStatement();
            String sql = "INSERT INTO usuarios (NombreUsuario,PasswordUsuario,Nombres,ApPaterno,ApMaterno,TipoUsuario)"
                + " VALUES ("+usuario+","+password+","+Nombres+","+ApPaterno+","+ApMaterno+","+TipoUsuario+")";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los dataos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
    public void buscar_Usuarios_login(String usuario,String password) throws Exception{
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=con.createStatement();
            String sql="SELECT NombreUsuario,PasswordUsuario FROM usuarios WHERE "
                    + "NombreUsuario="+usuario+" AND PasswordUsuario="+password;
            
            ResultSet result=st.executeQuery(sql);
            if(result.next()){
                JOptionPane.showMessageDialog(null,"EL USUARIO Y PASSWORD EXISTE");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
