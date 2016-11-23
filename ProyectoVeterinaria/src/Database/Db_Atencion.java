/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Statement;

/**
 *
 * @author GerAr
 */
public class Db_Atencion {
    public void Insertar_cola(String nombreCliente,String apPaternoCliente,String apMaternoCliente,
    String paciente_mascota,String ruta_historial) throws Exception{
        Conexion con= new Conexion();
        con.conectar();
        Statement st = con.getConexion().createStatement();
        String sql = "INSERT INTO vet.atencion (nombreCliente,apPaternoCliente,apMaternoCliente,paciente,historial) "
                + "VALUES ('"+nombreCliente+"','"+apPaternoCliente+"','"+apMaternoCliente+"','"+paciente_mascota+"','"
                +ruta_historial+"')";
        
        st.executeUpdate
        (sql);
    }
    
    
}
