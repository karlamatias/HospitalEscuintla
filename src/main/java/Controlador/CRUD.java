/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

//Creare una clase interface para colocar los metodos que se utilizaran en las clases DAO
import java.util.List;

public interface CRUD {

    public List listaPacientes();
    public boolean agregar(Object[] o);
    public boolean actualizar(Object[] o);
    public boolean eliminar(String registroMedico);
}
