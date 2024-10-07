/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;
import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PacienteDAO implements CRUD {

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
        String sql = "INSERT INTO paciente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            con = cn.conectar();
            ps = con.prepareStatement(sql);

            //Configurando los paremetros usando un ciclo for
            for (int i = 1; i <= o.length; i++) {
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

    //Metodo para buscar un paciente y poder realizar su hoja de historial 
    public Paciente BuscarPaciente(String registro_medico) {
        Paciente paciente = new Paciente();
        String sql = "SELECT * FROM paciente WHERE registro_medico=?";

        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, registro_medico);
            rs = ps.executeQuery();

            if (rs.next()) {
                asignarValoresAPaciente(paciente, rs);
            }

        } catch (Exception e) {
            // Manejar la excepción apropiadamente
            e.printStackTrace();
        } finally {
            // Cerrar recursos en el bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
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

        return paciente;
    }

    private void asignarValoresAPaciente(Paciente paciente, ResultSet rs) throws SQLException {
        paciente.setRegistro_medico(rs.getString("registro_medico"));
        paciente.setFecha_ingreso_hospital(rs.getString("fecha_ingreso_h"));
        paciente.setFecha_ingreso_unidad(rs.getString("fecha_ingreso_unidad"));
        paciente.setFecha_egreso_unidad(rs.getString("fecha_egreso_unidad"));
        paciente.setNombre_paciente(rs.getString("nombre_paciente"));
        paciente.setApellido_paciente(rs.getString("apellido_paciente"));
        paciente.setEdad_paciente(rs.getInt("edad_paciente"));
        paciente.setSexo_paciente(rs.getString("sexo_paciente"));
        paciente.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
        paciente.setDireccion_paciente(rs.getString("direccion_paciente"));
        paciente.setAldea(rs.getString("aldea"));
        paciente.setMunicipio(rs.getString("municipio"));
        paciente.setDepartamento(rs.getString("departamento"));
        paciente.setTelefono(rs.getInt("telefono"));
        paciente.setMiembros_familia(rs.getInt("miembros_familia"));
        paciente.setAdultos(rs.getInt("adultos"));
        paciente.setNinos(rs.getInt("ninos"));
        paciente.setNo_hijos(rs.getInt("no_hijos"));
        paciente.setLugar_ocupa(rs.getInt("lugar_ocupa"));
        paciente.setIngreso_mensual(rs.getInt("ingreso_mensual"));
        paciente.setReferido_por(rs.getString("referido_por"));
        paciente.setEncargado(rs.getString("encargado"));
        paciente.setParentesco(rs.getString("parentesco"));
        paciente.setEdad_encargado(rs.getInt("edad_encargado"));
        paciente.setEscolaridad(rs.getString("escolaridad"));
        paciente.setOcupacion(rs.getString("ocupacion"));
    }

    @Override
    public boolean actualizar(Object[] o) {
        String sql = "UPDATE paciente SET "
                + "fecha_ingreso_hospital=?, fecha_ingreso_unidad=?, fecha_egreso_unidad=?, "
                + "nombre_paciente=?, apellido_paciente=?, edad_paciente=?, sexo_paciente=?, fecha_nacimiento=?, "
                + "direccion_paciente=?, aldea=?, municipio=?, departamento=?, telefono=?, miembros_familia=?, "
                + "adultos=?, ninos=?, no_hijos=?, lugar_ocupa=?, ingreso_mensual=?, referido_por=?, "
                + "encargado=?, parentesco=?, edad_encargado=?, escolaridad=?, ocupacion=? WHERE registro_medico=?";

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
        String sql = "DELETE FROM paciente WHERE registro_medico=?";

        try (Connection con = cn.conectar();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, registroMedico);

            int filasAfectadas = ps.executeUpdate();

            // Verifica si se eliminó al menos una fila
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
