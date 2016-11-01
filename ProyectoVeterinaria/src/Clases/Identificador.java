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
    String codigo[];
    
    public void Generar(String especie){
        String esp = especie.toLowerCase();
        switch(especie){
            case "perro": codigo[0]="P";
                          codigo[1]="R";break;
                          
            case "gato": codigo[0]="G";
                         codigo[1]="T";break;
                         
            case "conejo": codigo[0]="C";
                           codigo[1]="J";break;
                           
            case "tortuga": codigo[0]="T";
                            codigo[1]="G";break;
                            
            case "hamster": codigo[0]="H";
                            codigo[1]="M";break;
                            
            case "iguana": codigo[0]="I";
                           codigo[1]="G";break;
        }
        
        
    }
}
