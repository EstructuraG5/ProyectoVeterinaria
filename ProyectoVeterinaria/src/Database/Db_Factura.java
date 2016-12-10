/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
 */
public class Db_Factura {
    public void insertar_factura(int idCliente,String nombre , String apPaterno, String apMaterno,
            int DNI,String direccion , int TelCel ,String DescripcionAtencion,int Costo) throws Exception{
        
        Conexion con=new Conexion();
        con.conectar();
        Statement st = con.getConexion().createStatement();
        String sql="INSERT INTO vet.factura (idCliente,nombre,apPaterno,apMaterno,DNI,direccion,TelCel,"
                + "DescripcionAtencion,Costo) VALUES('"+idCliente+"','"+nombre+"','"+apPaterno+"','"
                +apMaterno+"','"+DNI+"','"+direccion+"','"+TelCel+"','"+DescripcionAtencion+"','"+Costo+"')";
        
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Los datos se registraron correctamente en la tabla factura");
        
    }
    
    public ArrayList Devolver_datos_factura() throws Exception{
        ArrayList datos_factura = new ArrayList();
        Conexion con= new Conexion();
        con.conectar();
        Statement st=con.getConexion().createStatement();
        String sql="SELECT * FROM vet.factura";
        ResultSet resultado=st.executeQuery(sql);
        if(resultado.next()){
            datos_factura.add(resultado.getInt("idCliente"));
            datos_factura.add(resultado.getString("nombre"));
            datos_factura.add(resultado.getString("apPaterno"));
            datos_factura.add(resultado.getString("apMaterno"));
            datos_factura.add(resultado.getInt("DNI"));
            datos_factura.add(resultado.getString("direccion"));
            datos_factura.add(resultado.getInt("Tel/Cel"));
            
        }
        return datos_factura;
    }
    
}
