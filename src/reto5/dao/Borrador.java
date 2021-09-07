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
public class Borrador {
    public static boolean borrar(Connection conn, Cliente cliente) throws SQLException{
        String sql = "delete from cliente  where cli_login=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setString(1, cliente.getLogin());
        
        int rowsDeleted = statement.executeUpdate();
        if(rowsDeleted> 0){
            System.out.println("Borrado exitoso");
            return true;
        }
        else return false;
        
    }
}
