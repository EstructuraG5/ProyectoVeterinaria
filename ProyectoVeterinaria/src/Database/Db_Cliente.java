/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Clases.Ordenar;
import Clases.ResultadosBusqueda;
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
        con.cerrarConexion();
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
        connect.cerrarConexion();
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
     
     
     
     //SIRVE PARA LA BUSQUEDA POR APELLIDOS,TOMO LA DATA DEL CLIENTE PARA BUSCAR LA MASCOTA CORRESPONDIENTE
      public ArrayList<String> Devolver_datos_mascota(int idCliente) throws Exception{
        ArrayList<String> mascota=new ArrayList<>();
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.mascota WHERE"
                    + " Cliente_idCliente='"+idCliente+"'";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                mascota.add(rs.getString("nombreMascota"));
                mascota.add(rs.getString("historial"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        connect.cerrarConexion();
        return mascota;
    }
     public ArrayList<ResultadosBusqueda> Busqueda_por_DNI(int DNI_Cliente) throws Exception{
        ArrayList<ResultadosBusqueda> Clientes_DNI=new ArrayList();
        
        Conexion connect=new Conexion();
        connect.conectar();
         
         try{
            Statement st =connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.cliente WHERE"
                     + " DNI='"+DNI_Cliente+"'";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                ResultadosBusqueda resultado=new ResultadosBusqueda();
                
                String nombre=rs.getString("nombreCliente");
                String apellido_paterno=rs.getString("apPaterno");
                String apellido_materno=rs.getString("apMaterno");
                int DNI=rs.getInt("DNI");
                
                resultado.setCliente_nombre(nombre);
                resultado.setCliente_apellidoPaterno(apellido_paterno);
                resultado.setCliente_apellidoMaterno(apellido_materno);
                resultado.setDNI(DNI);
                
                int id_cliente=buscar_idCliente(nombre,apellido_paterno,apellido_materno);
                
                
                ArrayList<String> mascota=Devolver_datos_mascota(id_cliente);
                
                resultado.setMascota_nombre(mascota.get(0));
                resultado.setCliente_historial(mascota.get(1));
                
                Clientes_DNI.add(resultado);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        connect.cerrarConexion();
        Ordenar ord = new Ordenar();
        ord.ordenarSeleccion(Clientes_DNI);
        return Clientes_DNI;
    }
      
      //BUSQUEDA POR APELLIDO PATERNO
        public ArrayList<ResultadosBusqueda> Busqueda_por_Apellido(String ApPaterno) throws Exception{
        ArrayList<ResultadosBusqueda> Clientes_apellidos=new ArrayList();
        
        Conexion connect=new Conexion();
        connect.conectar();
         
         try{
            Statement st =connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.cliente WHERE"
                     + " apPaterno='"+ApPaterno+"'";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                ResultadosBusqueda resultado=new ResultadosBusqueda();
                
                String nombre=rs.getString("nombreCliente");
                String apellido_paterno=rs.getString("apPaterno");
                String apellido_materno=rs.getString("apMaterno");
                int DNI=rs.getInt("DNI");
                
                resultado.setCliente_nombre(nombre);
                resultado.setCliente_apellidoPaterno(apellido_paterno);
                resultado.setCliente_apellidoMaterno(apellido_materno);
                resultado.setDNI(DNI);
                
                int id_cliente=buscar_idCliente(nombre,apellido_paterno,apellido_materno);
                
                
                ArrayList<String> mascota=Devolver_datos_mascota(id_cliente);
                
                resultado.setMascota_nombre(mascota.get(0));
                resultado.setCliente_historial(mascota.get(1));
                
                Clientes_apellidos.add(resultado);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        connect.cerrarConexion();
        Ordenar ord = new Ordenar();
        ord.ordenarSeleccion(Clientes_apellidos);
        return Clientes_apellidos;
    }
        
    //SIRVE PARA BUSCAR EL DUEÑO A PARTIR DE LA MASCOTA Y SU ID , DEVUELVE EL CLIENTE CORRESPONDINTE ,DUEÑO DE LA MASCOTA
        //BUSQUEDA POR MASCOTA
    public ArrayList Devolver_duenio(int Cliente_idCliente) throws Exception{
        ArrayList cliente=new ArrayList();
        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st=connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.cliente WHERE"
                    + " idCliente='"+Cliente_idCliente+"'";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                cliente.add(rs.getString("nombreCliente"));
                cliente.add(rs.getString("apPaterno"));
                cliente.add(rs.getString("apMaterno"));
                cliente.add(rs.getInt("DNI"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
        connect.cerrarConexion();
        return cliente;
    }
    
    //BUSQUEDA POR NOMBRE DE MASCOTA
    public ArrayList<ResultadosBusqueda> Busqueda_nombre_mascota(String mascota) throws Exception{
        ArrayList<ResultadosBusqueda> Mascotas=new ArrayList<ResultadosBusqueda>();

        Conexion connect=new Conexion();
        connect.conectar();
        try{
            Statement st =connect.getConexion().createStatement();
            String sql="SELECT * FROM vet.mascota WHERE"
                     + " nombreMascota='"+mascota+"'";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                ResultadosBusqueda resultado=new ResultadosBusqueda();
                
                String nombre_mascota=rs.getString("nombreMascota");
                String historial=rs.getString("historial");
                int Cliente_idCliente=rs.getInt("Cliente_idCliente");
                
                
                ArrayList cliente=Devolver_duenio(Cliente_idCliente);
                
                String nombre=(String) cliente.get(0);
                String apellidoPaterno=(String) cliente.get(1);
                String apellidoMaterno=(String) cliente.get(2);
                int DNI=(int) cliente.get(3);
                
                resultado.setCliente_nombre(nombre);
                resultado.setCliente_apellidoPaterno(apellidoPaterno);
                resultado.setCliente_apellidoMaterno(apellidoMaterno);
                resultado.setDNI(DNI);
                resultado.setMascota_nombre(nombre_mascota);
                resultado.setCliente_historial(historial);
                
                Mascotas.add(resultado);
       
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        connect.cerrarConexion();
        return Mascotas;
    }    
}