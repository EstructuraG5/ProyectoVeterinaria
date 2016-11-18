/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Juan Eneque
 */
public class Identificador {
    String codigo;
    
    public String Generar(String codigo,int id_Cliente){
        String id = codigo.toLowerCase();
        switch(id){
            case "perro": this.codigo = "PR" + Aumentar(id_Cliente);break;
                          
            case "gato": this.codigo="GT" + Aumentar(id_Cliente);break;
                         
            case "conejo": this.codigo="CJ" + Aumentar(id_Cliente);break;
                           
            case "tortuga": this.codigo="TG" + Aumentar(id_Cliente);break;
                            
            case "hamster": this.codigo="HM" + Aumentar(id_Cliente);break;
                            
            case "iguana": this.codigo="IG" + Aumentar(id_Cliente);break;
        }
        return this.codigo;
    }
    
    public String Aumentar(int id_Cliente){
        String num;
        
        if(id_Cliente<10)
            num = "00" + String.valueOf(id_Cliente);
        else
            if(id_Cliente<100)
                num = "0" + String.valueOf(id_Cliente);
            else
                num = String.valueOf(id_Cliente);
        return num;
    }
}
