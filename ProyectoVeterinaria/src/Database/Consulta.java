package Database;

import Clases.ResultadosBusqueda;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seven
 */
public class Consulta {
    DefaultTableModel dtm;
    public DefaultTableModel llenarTabla(JTable tabla, ArrayList<ResultadosBusqueda> lista){ 
         dtm = new DefaultTableModel();
        tabla.setModel(dtm);
        dtm.setColumnIdentifiers(new Object[]{"Cliente","Apellido Paterno", "Apellido Materno", 
            "DNI", "Nombre Mascota", "Historial"});
        int n = lista.size();
        while(n>0){
            dtm.addRow(new Object[]{lista.get(n).getCliente_nombre(), lista.get(n).getCliente_apellidoPaterno()
                    , lista.get(n).getCliente_apellidoMaterno(), lista.get(n).getDNI(), lista.get(n).getMascota_nombre()
                    , lista.get(n).getCliente_historial()});
            n--;
        }
        return dtm;
    }
}
