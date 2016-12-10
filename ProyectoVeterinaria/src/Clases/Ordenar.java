package Clases;

import java.util.ArrayList;

/**
 *
 * @author Seven
 */
public class Ordenar {
    
    public void ordenarInsercion(ArrayList<ResultadosBusqueda> data){
        int n, i, k;
        String aux;
        ResultadosBusqueda resp = new ResultadosBusqueda();
        n = data.size();
        for(i=1; i<n; i++){
            aux = data.get(i).getCliente_apellidoMaterno();
            k = i - 1;
            while(k >=0 && aux.compareTo(data.get(k).getCliente_apellidoMaterno())<0){
                
                //data(k+1) = data(k)
                k = k - 1;
            }
            //data(k+1) = aux
        }
    }
}
