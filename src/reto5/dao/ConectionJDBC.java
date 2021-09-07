/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import reto5.dao.CreatorConections;
import java.sql.Connection;


/**
 *
 * @author jhalejandro
 */
public class ConectionJDBC {

    

    public static void main(String[] args) {
        try {
            Connection conn = CreatorConections.crearConexion();
            //Insertador.insercion(conn);  
            //Lector.leer(conn);
            Lector.leerPorLogin(conn,"jhalejandro");
            //Actualizador.actualizar(conn);
            //Borrador.borrar(conn);
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
    }

}
