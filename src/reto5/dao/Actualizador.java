/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import reto5.modelos.Cliente;

/**
 *
 * @author jhalejandro
 */
public class Actualizador {
    public static boolean actualizar(Connection conn, Cliente cliente) throws SQLException{
        if (cliente !=null){
        String sql = "update cliente set cli_nombre=?, cli_apellido=?, cli_email=?, cli_celular=?, cli_clave=?, cli_fecha=? where cli_login=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getNombre());
        statement.setString(2, cliente.getApellido());
        statement.setString(3,cliente.getEmail());
        statement.setLong(4,cliente.getCelular());
        statement.setString(5,cliente.getClave());
        statement.setDate(6,cliente.getFecha());
        statement.setString(7, cliente.getLogin());
        
        int rowsUpdated = statement.executeUpdate();
        if(rowsUpdated>0){
            System.out.println("El registro fue actualizado correctamente");
            return true;
        }
        else return false;
        }else {
            System.out.println("El registro no fue actualizado correctamente");
            return false;
        }
    }
}
