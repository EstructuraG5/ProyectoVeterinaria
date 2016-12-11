package Clases;

import java.util.ArrayList;

/**
 *
 * @author Seven
 */
public class Ordenar {
    
    public void ordenarSeleccion(ArrayList<ResultadosBusqueda> lista){ // ordenar por apellido
        int i, j, k, n;
        String menor = null, aux_sgte;
        n = lista.size(); // tamaño del arrayList
        for(i=0; i<n-1; i++){
            ResultadosBusqueda resp = new ResultadosBusqueda();
            iniciar(resp, lista, i); // guardamos en resp los datos de la posicion i de la lista(posible menor)
            menor = lista.get(i).getCliente_apellidoMaterno(); // menor es el dato a comparar, en este caso ApMaterno
            k = i;
            for(j=i+1; j<n; j++){
                aux_sgte = lista.get(j).getCliente_apellidoMaterno(); // en esta variable asignamos el valor siguiente a menor
                if(aux_sgte.compareTo(menor)<0){ // localizamos si es que existe un menor
                    menor = lista.get(j).getCliente_apellidoMaterno(); // cambiamos el valor de menor
                    iniciar(resp, lista, j); // modificamos los datos del objeto resp
                    k = j;
                }
            }
            lista.set(k, lista.get(i));
            lista.set(i, resp);
        }
    }
    
    public void iniciar(ResultadosBusqueda aux_datos, ArrayList<ResultadosBusqueda> data, int indice){
        aux_datos.setCliente_nombre(data.get(indice).getCliente_nombre());
        aux_datos.setCliente_apellidoPaterno(data.get(indice).getCliente_apellidoPaterno());
        aux_datos.setCliente_apellidoMaterno(data.get(indice).getCliente_apellidoMaterno());
        aux_datos.setMascota_nombre(data.get(indice).getMascota_nombre());
        aux_datos.setCliente_historial(data.get(indice).getCliente_historial());
    }
}
