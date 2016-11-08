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
    
    
    public void insertar_Usuarios(String usuario, String password , String Nombres,
            String ApPaterno,String ApMaterno , String TipoUsuario) throws Exception{
        
        Conexion con=new Conexion();
        
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO usuarios (NombreUsuario,PasswordUsuario,Nombres,ApPaterno,ApMaterno,TipoUsuario)"
                + " VALUES ("+usuario+","+password+","+Nombres+","+ApPaterno+","+ApMaterno+","+TipoUsuario+")";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
    public boolean buscar_Usuarios_login(String usuario,String password) throws Exception{
        Conexion connect=new Conexion();
        connect.conectar();
        boolean respuesta=false;
        try{
            Statement st=connect.getConexion().createStatement();
            String sql="SELECT NombreUsuario,PasswordUsuario FROM vet.usuarios WHERE "
                    + "NombreUsuario='"+usuario+"' AND PasswordUsuario='"+password+"'";
            
            ResultSet result=st.executeQuery(sql);
            if(result.next()){
                JOptionPane.showMessageDialog(null,"EL USUARIO Y PASSWORD EXISTE");
                //Dependiendo del tipo de usuario , ver que tipo de 
                respuesta=true;
            }else{
                JOptionPane.showMessageDialog(null,"Usuario y contraseña incorrecto");
                respuesta=false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return respuesta;
    }
    
    public String tipo_Usuario(String usuario , String Password) throws SQLException, Exception{
        String tipo=null;
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=connect.getConexion().createStatement();
        
            String sql="SELECT TipoUsuario FROM vet.usuarios WHERE NombreUsuario='"+usuario+"' AND PasswordUsuario='"+Password+"'";
            ResultSet result=st.executeQuery(sql);
            if(result.next()){
                tipo=result.getString("TipoUsuario");
            }
        }catch(SQLException ex){
            
        }
        
    return tipo;
    }
    
}
