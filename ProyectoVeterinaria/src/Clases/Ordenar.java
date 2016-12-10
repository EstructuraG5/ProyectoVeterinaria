package Clases;

import java.util.ArrayList;

/**
 *
 * @author Seven
 */
public class Ordenar {
    
    public void ordenarInsercion(ArrayList data){
        int n, i, k;
        String aux;
        n = data.size();
        for(i=1; i<n; i++){
            //aux = data(k)
            k = i - 1;
            while(k >=0){ // && aux < data(k) uso de equals
                //data(k+1) = data(k)
                k = k - 1;
            }
            //data(k+1) = aux
        }
    }
}
