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
public class Cliente {
    String DNI;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int telefono;
    String direccion;
    
    public Cliente (String DNI, String nom, String apPat, String apMat,
            int telefono, String direccion){
        this.DNI = DNI;
        this.nombre = nom;
        this.apellidoPaterno = apPat;
        this.apellidoMaterno = apMat;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
