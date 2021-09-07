/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import reto5.modelos.Cliente;

/**
 *
 * @author jhalejandro
 */
public class Lector {
    public static void leer(Connection conn) throws Exception{
        String sql = "Select * from cliente";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        
        int count=0;
        while(result.next()){
            String login = result.getString(1);
            String nombre = result.getString(2);
            String apellido = result.getString(3);
            String email = result.getString(4);
            String celular = result.getString(5);
            Date fecha = result.getDate(7);
            
            System.out.println("Login:"+ login+"  nombre:"+nombre+"  apellido:"+apellido
            +"  Email:"+email+"  Celular:"+celular+"  Fecha:"+fecha);
        }
    }
    
    public static Cliente leerPorLogin(Connection conn, String loginaLeer) throws Exception{
        String sql = "Select * from cliente where cli_login= ?";
        PreparedStatement statement = conn .prepareStatement(sql);
        statement.setString(1, loginaLeer);
        ResultSet result = statement.executeQuery();
        
        int count=0;
            result.next();
            String login = result.getString(1);
            String nombre = result.getString(2);
            String apellido = result.getString(3);
            String email = result.getString(4);
            Long celular = result.getLong(5);
            String clave = result.getString(6);
            Date fecha = result.getDate(7);
            
            Cliente cliente = new Cliente();
            cliente.setLogin(login);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setCelular(celular);
            cliente.setClave(clave);
            cliente.setFecha(fecha);
            
            System.out.println("Login:"+ login+"  nombre:"+nombre+"  apellido:"+apellido
            +"  Email:"+email+"  Celular:"+celular+"  Fecha:"+fecha);
            return cliente;
    }
    
}
