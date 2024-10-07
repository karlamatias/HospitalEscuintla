/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Paciente {
    String registro_medico;
    String fecha_ingreso_hospital;
    String fecha_ingreso_unidad;
    String fecha_egreso_unidad;
    String nombre_paciente;
    String apellido_paciente;
    int edad_paciente;
    String sexo_paciente;
    String fecha_nacimiento;
    String direccion_paciente;
    String aldea;
    String municipio;
    String departamento;
    int telefono;
    int miembros_familia;
    int adultos;
    int ninos;
    int no_hijos;
    int lugar_ocupa;
    int ingreso_mensual;
    String referido_por;
    String encargado;
    String parentesco;
    int edad_encargado;
    String escolaridad;
    String ocupacion;

    public Paciente() {
    }

    public Paciente(String registro_medico, String fecha_ingreso_hospital, String fecha_ingreso_unidad, String fecha_egreso_unidad, String nombre_paciente, String apellido_paciente, int edad_paciente, String sexo_paciente, String fecha_nacimiento, String direccion_paciente, String aldea, String municipio, String departamento, int telefono, int miembros_familia, int adultos, int ninos, int no_hijos, int lugar_ocupa, int ingreso_mensual, String referido_por, String encargado, String parentesco, int edad_encargado, String escolaridad, String ocupacion) {
        this.registro_medico = registro_medico;
        this.fecha_ingreso_hospital = fecha_ingreso_hospital;
        this.fecha_ingreso_unidad = fecha_ingreso_unidad;
        this.fecha_egreso_unidad = fecha_egreso_unidad;
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.edad_paciente = edad_paciente;
        this.sexo_paciente = sexo_paciente;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion_paciente = direccion_paciente;
        this.aldea = aldea;
        this.municipio = municipio;
        this.departamento = departamento;
        this.telefono = telefono;
        this.miembros_familia = miembros_familia;
        this.adultos = adultos;
        this.ninos = ninos;
        this.no_hijos = no_hijos;
        this.lugar_ocupa = lugar_ocupa;
        this.ingreso_mensual = ingreso_mensual;
        this.referido_por = referido_por;
        this.encargado = encargado;
        this.parentesco = parentesco;
        this.edad_encargado = edad_encargado;
        this.escolaridad = escolaridad;
        this.ocupacion = ocupacion;
    }

    public String getRegistro_medico() {
        return registro_medico;
    }

    public void setRegistro_medico(String registro_medico) {
        this.registro_medico = registro_medico;
    }

    public String getFecha_ingreso_hospital() {
        return fecha_ingreso_hospital;
    }

    public void setFecha_ingreso_hospital(String fecha_ingreso_hospital) {
        this.fecha_ingreso_hospital = fecha_ingreso_hospital;
    }

    public String getFecha_ingreso_unidad() {
        return fecha_ingreso_unidad;
    }

    public void setFecha_ingreso_unidad(String fecha_ingreso_unidad) {
        this.fecha_ingreso_unidad = fecha_ingreso_unidad;
    }

    public String getFecha_egreso_unidad() {
        return fecha_egreso_unidad;
    }

    public void setFecha_egreso_unidad(String fecha_egreso_unidad) {
        this.fecha_egreso_unidad = fecha_egreso_unidad;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(int edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public String getSexo_paciente() {
        return sexo_paciente;
    }

    public void setSexo_paciente(String sexo_paciente) {
        this.sexo_paciente = sexo_paciente;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion_paciente() {
        return direccion_paciente;
    }

    public void setDireccion_paciente(String direccion_paciente) {
        this.direccion_paciente = direccion_paciente;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMiembros_familia() {
        return miembros_familia;
    }

    public void setMiembros_familia(int miembros_familia) {
        this.miembros_familia = miembros_familia;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getNinos() {
        return ninos;
    }

    public void setNinos(int ninos) {
        this.ninos = ninos;
    }

    public int getNo_hijos() {
        return no_hijos;
    }

    public void setNo_hijos(int no_hijos) {
        this.no_hijos = no_hijos;
    }

    public int getLugar_ocupa() {
        return lugar_ocupa;
    }

    public void setLugar_ocupa(int lugar_ocupa) {
        this.lugar_ocupa = lugar_ocupa;
    }

    public int getIngreso_mensual() {
        return ingreso_mensual;
    }

    public void setIngreso_mensual(int ingreso_mensual) {
        this.ingreso_mensual = ingreso_mensual;
    }

    public String getReferido_por() {
        return referido_por;
    }

    public void setReferido_por(String referido_por) {
        this.referido_por = referido_por;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad_encargado() {
        return edad_encargado;
    }

    public void setEdad_encargado(int edad_encargado) {
        this.edad_encargado = edad_encargado;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    
}
