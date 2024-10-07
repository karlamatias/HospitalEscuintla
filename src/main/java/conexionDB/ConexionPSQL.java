/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionDB;

import Vistas.Login;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConexionPSQL {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        /*try {
            Connection conexion = Conexion.conectar();

            // Si la conexión se estableció con éxito, imprime un mensaje
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos");
                // Cierra la conexión después de la prueba
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al intentar conectar con la base de datos solicitada: " + e.getMessage());
            e.printStackTrace();
        }*/

    }
}
