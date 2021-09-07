/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import reto5.modelos.Cliente;

/**
 *
 * @author jhalejandro
 */
public class Insertador {
    public static int insercion(Connection conn, Cliente cliente) throws Exception {
        try {
            String sql = "INSERT INTO cliente(cli_login, cli_nombre, cli_apellido, cli_email, cli_celular, cli_clave, cli_fecha)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cliente.getLogin());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getEmail());
            statement.setLong(5, cliente.getCelular());
            statement.setString(6, cliente.getClave());
            statement.setDate(7, cliente.getFecha());
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("Insercción exitosa");
                return rowInserted;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar");
        }
        throw new Exception("Error al insertar");
    }
}
