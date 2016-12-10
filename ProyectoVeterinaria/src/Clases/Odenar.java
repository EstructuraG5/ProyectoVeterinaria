package Clases;

import java.util.ArrayList;

/**
 *
 * @author Seven
 */
public class Odenar {
    public void ordenarSeleccion(ArrayList data){
        int i, k, n;
        String aux;
        n = data.size();
        for(i=1; i<n; i++){
            //aux = data(i)
            k = i - 1;
            while(k >= 0){
                // data(k+1) = data(k)
                k = k - 1;
            }
            //data(k+1) = aux
        }
    }
}
