/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
 */
public class Db_Usuarios {
    Icon icono = new ImageIcon(getClass().getResource("/Recursos/descarga_opt.png"));
    
    public void insertar_Usuarios(String usuario, String password , String Nombres, String ApPaterno,String ApMaterno , String TipoUsuario) throws Exception{
        
        Conexion con=new Conexion();
        
        con.conectar();
        try{
            Statement st=con.getConexion().createStatement();
            String sql = "INSERT INTO vet.usuarios (NombreUsuario,PasswordUsuario,Nombres,ApPaterno,ApMaterno,TipoUsuario)"
                + " VALUES ('"+usuario+"','"+password+"','"+Nombres+"','"+ApPaterno+"','"+ApMaterno+"','"+TipoUsuario+"')";
        
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"El usuario se registró correctamente");
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
                

                JOptionPane.showMessageDialog(null," Has ingresado satisfactoriamente al sistema","Bienvenido",JOptionPane.INFORMATION_MESSAGE,icono);
                //Dependiendo del tipo de usuario , ver que tipo de 
                respuesta=true;
            }else{
                JOptionPane.showMessageDialog(null,"Por favor ingrese un usuario y/o contraseña correctos","Acceso denegado",JOptionPane.ERROR_MESSAGE);

                //Dependiendo del tipo de usuario , ver que tipo de 
                
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
