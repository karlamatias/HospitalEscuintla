/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    public static Connection dbConnection;
    public static String url = "jdbc:postgresql://localhost:5432/hospital";
    public static  String usuario = "admin1";
    public static  String clave = "admin1234";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, clave);
    }
}
