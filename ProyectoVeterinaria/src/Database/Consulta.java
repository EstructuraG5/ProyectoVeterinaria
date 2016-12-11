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
        
        for(int i = 0 ; i<n ; i++){
            String nombre=lista.get(i).getCliente_nombre();
            String apellido_paterno=lista.get(i).getCliente_apellidoPaterno();
            String apellido_materno=lista.get(i).getCliente_apellidoMaterno();
            int DNI= lista.get(i).getDNI();
            String mascota=lista.get(i).getMascota_nombre();
            String historial=lista.get(i).getCliente_historial();
            dtm.addRow(new Object[]{nombre,apellido_paterno,apellido_materno,DNI,mascota,historial});
        }
        return dtm;
    }
}
