/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GerAr
 */
public class Conexion {
    private Connection conexion; 
Icon icono = new ImageIcon(getClass().getResource("/Recursos/like.png"));
    public void conectar() throws Exception {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            setConexion((Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","1234"));
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa","CONEXION",JOptionPane.PLAIN_MESSAGE,icono);
        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "No se ha iniciado la conexión con el servidor de forma exitosa","SIN CONEXION",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se ha iniciado la conexión con el servidor de forma exitosa","SIN CONEXION",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        try{
            getConexion().close();
        }catch(SQLException ex){
        }
    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}