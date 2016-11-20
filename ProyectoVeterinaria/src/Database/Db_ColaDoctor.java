package Database;

import java.sql.ResultSet;
import java.sql.Statement;
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
            dtm.addRow(new Object[]{rs.getString("cliente"), rs.getString("paciente"), rs.getString("historial")});
        }
        con.cerrarConexion();
        return dtm;
    }
    
    //falta eliminra luego de terminar atencion
}
