/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.Date;
import reto5.dao.Actualizador;
import reto5.dao.Borrador;
import reto5.dao.CreatorConections;
import reto5.dao.Insertador;
import reto5.dao.Lector;
import reto5.modelos.Cliente;
import reto5.vista.JFramePrincipal;

/**
 *
 * @author jhalejandro
 */
public class ControladorPrincipal {
    JFramePrincipal jFramePrincipal;
    Connection conn;

    public ControladorPrincipal(JFramePrincipal jFramePrincipal) throws Exception{
        this.jFramePrincipal = jFramePrincipal;
        conn = CreatorConections.crearConexion();
    }

    public void btnCrear() {
       Cliente cliente = new Cliente();
       cliente.setLogin(jFramePrincipal.getTfLogin().getText());
       cliente.setNombre(jFramePrincipal.getTfNombre().getText());
       cliente.setApellido(jFramePrincipal.getTfApellido().getText());
       cliente.setEmail(jFramePrincipal.getTfEmail().getText());
       cliente.setCelular(Long.parseLong(jFramePrincipal.getTfCelular().getText()));
       cliente.setClave(jFramePrincipal.getTfClave().getText());
       cliente.setFecha(Date.valueOf(jFramePrincipal.getTfFecha().getText()));
       try{
       Insertador.insercion(conn, cliente);
       }
       catch(Exception e){
           StringWriter sw = new StringWriter();
           e.printStackTrace(new PrintWriter(sw));
           String exceptionsDetails = sw.toString();
           jFramePrincipal.getTaErrores().setText(exceptionsDetails);
       }
    }

    public void actualizar() {
       Cliente cliente = new Cliente();
       cliente.setLogin(jFramePrincipal.getTfLogin().getText());
       cliente.setNombre(jFramePrincipal.getTfNombre().getText());
       cliente.setApellido(jFramePrincipal.getTfApellido().getText());
       cliente.setEmail(jFramePrincipal.getTfEmail().getText());
       cliente.setCelular(Long.parseLong(jFramePrincipal.getTfCelular().getText()));
       cliente.setClave(jFramePrincipal.getTfClave().getText());
       cliente.setFecha(Date.valueOf(jFramePrincipal.getTfFecha().getText()));
       try{
       Actualizador.actualizar(conn, cliente);
       }
       catch(Exception e){
           StringWriter sw = new StringWriter();
           e.printStackTrace(new PrintWriter(sw));
           String exceptionsDetails = sw.toString();
           jFramePrincipal.getTaErrores().setText(exceptionsDetails);
       }
    }

    public void consultar() {
        try{
        String login = jFramePrincipal.getTfLogin().getText();
        Cliente cliente = Lector.leerPorLogin(conn, login);
        jFramePrincipal.getTfLogin().setText(cliente.getLogin());
        jFramePrincipal.getTfNombre().setText(cliente.getNombre());
        jFramePrincipal.getTfApellido().setText(cliente.getApellido());
        jFramePrincipal.getTfEmail().setText(cliente.getEmail());
        jFramePrincipal.getTfCelular().setText(cliente.getCelular().toString());
        jFramePrincipal.getTfClave().setText(cliente.getClave());
        jFramePrincipal.getTfFecha().setText(cliente.getFecha().toString());
        }
        catch(Exception e ){
             StringWriter sw = new StringWriter();
           e.printStackTrace(new PrintWriter(sw));
           String exceptionsDetails = sw.toString();
           jFramePrincipal.getTaErrores().setText(exceptionsDetails);
        }
    }

    public void borrar() {
         try{
        String login = jFramePrincipal.getTfLogin().getText();
        Cliente cliente = new Cliente();
        Borrador.borrar(conn, login);
             System.err.println("El borrado ha sido exitoso");
        }
        catch(Exception e ){
             StringWriter sw = new StringWriter();
           e.printStackTrace(new PrintWriter(sw));
           String exceptionsDetails = sw.toString();
           jFramePrincipal.getTaErrores().setText(exceptionsDetails);
        }
    }
}
