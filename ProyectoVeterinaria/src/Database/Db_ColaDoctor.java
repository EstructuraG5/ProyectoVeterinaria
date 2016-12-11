package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seven
 */
public class Db_ColaDoctor {
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
    
    //falta eliminra luego de terminar atencion
    public ArrayList datos_factura() throws SQLException, Exception{
        ArrayList datos =new ArrayList();
        Conexion con=new Conexion();
        con.conectar();
        Statement st=con.getConexion().createStatement();
        String sql = "SELECT * FROM vet.atencion";
        ResultSet rs=st.executeQuery(sql);
        
        if(rs.next()){
            datos.add(rs.getString("nombreCliente"));
            datos.add(rs.getString("apPaternoCliente"));
            datos.add(rs.getString("apMaternoCliente"));
            datos.add(rs.getString("paciente"));
            
        }
        con.cerrarConexion();
        return datos;
    }
}
