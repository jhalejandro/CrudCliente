/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelos;

import java.sql.Date;

/**
 *
 * @author jhalejandro
 */
public class Cliente {
    String login;
    String nombre;
    String apellido;
    String email;
    Long celular;
    String clave;
    Date fecha;
    public Cliente(){
        
    }
    public Cliente(String login, String nombre, String apellido, String email, Long celular, String clave) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.clave = clave;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Long getCelular() {
        return celular;
    }

    public String getClave() {
        return clave;
    }

    public Date getFecha() {
        return fecha;
    }
}
