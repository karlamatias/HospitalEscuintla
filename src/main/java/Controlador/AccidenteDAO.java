/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class AccidenteDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listaPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregar(Object[] o) {
        String sql = "INSERT INTO accidente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            con = cn.conectar();
            ps = con.prepareStatement(sql);

            //Configurando los paremetros usando un ciclo for
            for (int i = 1; i < o.length; i++) {
                ps.setObject(i, o[i - 1]);
            }
            ps.executeUpdate();

        } catch (Exception e) {
            // Manejar la excepción apropiadamente
            e.printStackTrace();
            return false; // Retorna false en caso de error
        } finally {
            // Cerrar recursos (Statement y Connection) en el bloque finally
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return true;
    }

    @Override
    public boolean actualizar(Object[] o) {
        String sql = "UPDATE accidente SET "
                + "causa_accidente=?, mecanismo_accidente=?, fecha_accidente=?, "
                + "hora_accidente=?, quien_estaba_accidente=?, lugar_accidente=?, tratamiento_accidente=?, area_quemadura=?, "
                + "hospitalizacion=?, lugar_internado=?, tratamiento_previo=?, tiempo_evolucion=?, tratamiento_medico=?, procedimiento_realizado=?, "
                + "evolucion_cicatriz=?, escala_vancouver=?, tratamiento_indicado=?, observaciones=? WHERE id_accidente=?";

        try (Connection con = cn.conectar();
                PreparedStatement ps = con.prepareStatement(sql)) {

            for (int i = 0; i < o.length; i++) {
                ps.setObject(i + 1, o[i]);
            }

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(String registroMedico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
