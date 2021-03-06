/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seven
 */
public class DB_ColaSecretaria {
    DefaultTableModel dtm;
    public DefaultTableModel llenarTabla(JTable tabla) throws Exception{
        Conexion con = new Conexion();
        con.conectar();
        String sql = "SELECT * FROM vet.atencion";
        Statement st = con.getConexion().createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        dtm = new DefaultTableModel();
        tabla.setModel(dtm);
        dtm.setColumnIdentifiers(new Object[]{"Cliente","Paciente", "Historial"});
        
        while(rs.next()){
            dtm.addRow(new Object[]{rs.getString("nombreCliente")+" "+rs.getString("apPaternoCliente")+" "+rs.getString("apMaternoCliente")
                    , rs.getString("paciente"), rs.getString("historial")});
        }
        con.cerrarConexion();
        return dtm;
    }
    
    public ArrayList<String> seleccionar_cliente(int DNI) throws Exception{
        Conexion con=new Conexion();
        ArrayList<String> datos=new ArrayList<String>();
        con.conectar();
        Statement st = con.getConexion().createStatement();
        String sql="SELECT * FROM vet.cliente WHERE DNI='"+DNI+"'";
        ResultSet resultado = st.executeQuery(sql);
        if(resultado.next()){
            datos.add(resultado.getString("nombreCliente"));
            datos.add(resultado.getString("apPaterno"));
            datos.add(resultado.getString("apMaterno"));
        }
        con.cerrarConexion();
        return datos;
    }
}
