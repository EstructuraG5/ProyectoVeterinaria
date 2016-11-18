package Clases;

/**
 *
 * @author Seven
 */
public class ColaLista {
    protected Nodo inicio;
    protected Nodo fin;
    
    public ColaLista(){
        inicio = fin = null;
    }
    
    public void insertar(Object elemento){
        Nodo a;
        a = new Nodo(elemento);
        if(colaVacia())
            inicio = a;
        else
            fin.sgte = a;
        fin = a;
    }
    
    public Object quitar() throws Exception{
        Object aux;
        if(!colaVacia()){
            aux = inicio.elemento;
            inicio = inicio.sgte;
        }
        else
            throw new Exception("No hay clientes en espera");
        return aux;
    }
    
    public void borrarCola(){
        for(; inicio != null ;)
            inicio = inicio.sgte;
        System.gc();
    }
    
    public Object inicioCola() throws Exception{
        if(colaVacia())
            throw new Exception("Error: Cola Vacia");
        return (inicio.elemento);
    }
    
    public boolean colaVacia(){
        return (inicio == null);
    }
}
