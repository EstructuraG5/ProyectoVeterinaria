/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author GerAr
 */
public class ResultadosBusqueda {
    private String cliente_nombre;
    private String cliente_apellidoPaterno;
    private String cliente_apellidoMaterno;
    private int DNI;
    private String cliente_historial;
    private String mascota_nombre;

    /**
     * @return the cliente_nombre
     */
    public String getCliente_nombre() {
        return cliente_nombre;
    }

    /**
     * @param cliente_nombre the cliente_nombre to set
     */
    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    /**
     * @return the cliente_apellidoPaterno
     */
    public String getCliente_apellidoPaterno() {
        return cliente_apellidoPaterno;
    }

    /**
     * @param cliente_apellidoPaterno the cliente_apellidoPaterno to set
     */
    public void setCliente_apellidoPaterno(String cliente_apellidoPaterno) {
        this.cliente_apellidoPaterno = cliente_apellidoPaterno;
    }

    /**
     * @return the cliente_apellidoMaterno
     */
    public String getCliente_apellidoMaterno() {
        return cliente_apellidoMaterno;
    }

    /**
     * @param cliente_apellidoMaterno the cliente_apellidoMaterno to set
     */
    public void setCliente_apellidoMaterno(String cliente_apellidoMaterno) {
        this.cliente_apellidoMaterno = cliente_apellidoMaterno;
    }

    /**
     * @return the cliente_historial
     */
    public String getCliente_historial() {
        return cliente_historial;
    }

    /**
     * @param cliente_historial the cliente_historial to set
     */
    public void setCliente_historial(String cliente_historial) {
        this.cliente_historial = cliente_historial;
    }

    /**
     * @return the mascota_nombre
     */
    public String getMascota_nombre() {
        return mascota_nombre;
    }

    /**
     * @param mascota_nombre the mascota_nombre to set
     */
    public void setMascota_nombre(String mascota_nombre) {
        this.mascota_nombre = mascota_nombre;
    }

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
}
