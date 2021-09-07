/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.dao;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 *
 * @author jhalejandro
 */
public class CreatorConectionsTest {
    
    public CreatorConectionsTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of crearConexion method, of class CreatorConections.
     */
    @org.junit.Test
    public void testCrearConexion() {
        System.out.println("crearConexion");
        Connection expResult = null;
        Connection result = CreatorConections.crearConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
