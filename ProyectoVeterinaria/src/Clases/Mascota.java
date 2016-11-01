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
public class Mascota {
    String nombre;
    String especie;
    String raza;
    String color;
    int edad;
    String sexo;
    
    public Mascota(String nom, String esp, String raza, String color, 
            int edad, String sexo){
        this.nombre = nom;
        this.especie = esp;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.sexo = sexo;
    }
}
