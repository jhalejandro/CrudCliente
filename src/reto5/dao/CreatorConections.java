/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhalejandro
 */
public class CreatorConections {
    public static Connection crearConexion(){
       String dbURL = "jdbc:mysql://localhost:3306/restaurante";
        String username = "root";
        String password = "jhon9707";
        try{
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn != null){
                System.out.println("Conectado");
                return conn;
            }
        }
        catch(SQLException ex){
        }
        return null;
    }
    
}
