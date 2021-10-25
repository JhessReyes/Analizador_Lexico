/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Essau Reyes Riveiro
 */
public class MainIT {
    
    public MainIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Outp method, of class Main.
     */
    @Test
    public void testOutp() throws Exception {
        System.out.println("Outp");
        Main instance = new Main();
        instance.Outp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Errores method, of class Main.
     */
    @Test
    public void testErrores() {
        System.out.println("Errores");
        Main instance = new Main();
        instance.Errores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ErroresTipos method, of class Main.
     */
    @Test
    public void testErroresTipos() {
        System.out.println("ErroresTipos");
        Main instance = new Main();
        instance.ErroresTipos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeclaraciones method, of class Main.
     */
    @Test
    public void testGetDeclaraciones() {
        System.out.println("getDeclaraciones");
        Main instance = new Main();
        Declaraciones expResult = null;
        Declaraciones result = instance.getDeclaraciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeclaraciones method, of class Main.
     */
    @Test
    public void testSetDeclaraciones() {
        System.out.println("setDeclaraciones");
        Declaraciones Declaraciones = null;
        Main instance = new Main();
        instance.setDeclaraciones(Declaraciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeclaracionPrevia method, of class Main.
     */
    @Test
    public void testDeclaracionPrevia() {
        System.out.println("DeclaracionPrevia");
        Main instance = new Main();
        instance.DeclaracionPrevia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSimbo method, of class Main.
     */
    @Test
    public void testSetSimbo() {
        System.out.println("setSimbo");
        ArrayList<Simbolos> Simbo = null;
        Main instance = new Main();
        instance.setSimbo(Simbo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSimbo method, of class Main.
     */
    @Test
    public void testGetSimbo() {
        System.out.println("getSimbo");
        Main instance = new Main();
        ArrayList<Simbolos> expResult = null;
        ArrayList<Simbolos> result = instance.getSimbo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class Main.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        Main instance = new Main();
        ArrayList<Tablas> expResult = null;
        ArrayList<Tablas> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLista method, of class Main.
     */
    @Test
    public void testSetLista() {
        System.out.println("setLista");
        ArrayList<Tablas> Lista = null;
        Main instance = new Main();
        instance.setLista(Lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Lector method, of class Main.
     */
    @Test
    public void testLector() {
        System.out.println("Lector");
        File a = null;
        Main instance = new Main();
        String expResult = "";
        String result = instance.Lector(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Main.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        String texto = "";
        File a = null;
        Main instance = new Main();
        instance.guardar(texto, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Abrir method, of class Main.
     */
    @Test
    public void testAbrir() {
        System.out.println("Abrir");
        File F = null;
        Main instance = new Main();
        instance.Abrir(F);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fase1 method, of class Main.
     */
    @Test
    public void testFase1() {
        System.out.println("fase1");
        File arch = null;
        Main instance = new Main();
        instance.fase1(arch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarDatos method, of class Main.
     */
    @Test
    public void testAgregarDatos() {
        System.out.println("AgregarDatos");
        File f = null;
        ArrayList<Tablas> List = null;
        Main instance = new Main();
        instance.AgregarDatos(f, List);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveDatos method, of class Main.
     */
    @Test
    public void testRemoveDatos() {
        System.out.println("RemoveDatos");
        JTable tb = null;
        DefaultTableModel db = null;
        Main instance = new Main();
        instance.RemoveDatos(tb, db);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OptSeparadorDouble method, of class Main.
     */
    @Test
    public void testOptSeparadorDouble() {
        System.out.println("OptSeparadorDouble");
        Main instance = new Main();
        instance.OptSeparadorDouble();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OptSeparadorPuertos method, of class Main.
     */
    @Test
    public void testOptSeparadorPuertos() {
        System.out.println("OptSeparadorPuertos");
        Main instance = new Main();
        instance.OptSeparadorPuertos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OptSeparadorCaracteres method, of class Main.
     */
    @Test
    public void testOptSeparadorCaracteres() {
        System.out.println("OptSeparadorCaracteres");
        Main instance = new Main();
        instance.OptSeparadorCaracteres();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OptSeparadorChar method, of class Main.
     */
    @Test
    public void testOptSeparadorChar() {
        System.out.println("OptSeparadorChar");
        Main instance = new Main();
        instance.OptSeparadorChar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ide method, of class Main.
     */
    @Test
    public void testIde() {
        System.out.println("ide");
        int x = 0;
        Main instance = new Main();
        String expResult = "";
        String result = instance.ide(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Declaradoen method, of class Main.
     */
    @Test
    public void testDeclaradoen() {
        System.out.println("Declaradoen");
        int x = 0;
        Main instance = new Main();
        String expResult = "";
        String result = instance.Declaradoen(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Devices method, of class Main.
     */
    @Test
    public void testDevices() {
        System.out.println("Devices");
        int x = 0;
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Devices(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of END method, of class Main.
     */
    @Test
    public void testEND() {
        System.out.println("END");
        int x = 0;
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.END(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PORT method, of class Main.
     */
    @Test
    public void testPORT() {
        System.out.println("PORT");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.PORT(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of STATUSPORT method, of class Main.
     */
    @Test
    public void testSTATUSPORT() {
        System.out.println("STATUSPORT");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.STATUSPORT(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Identificador method, of class Main.
     */
    @Test
    public void testIdentificador() {
        System.out.println("Identificador");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Identificador(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Numero method, of class Main.
     */
    @Test
    public void testNumero() {
        System.out.println("Numero");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Numero(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Double method, of class Main.
     */
    @Test
    public void testDouble() {
        System.out.println("Double");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Double(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Caracteres method, of class Main.
     */
    @Test
    public void testCaracteres() {
        System.out.println("Caracteres");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Caracteres(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Char method, of class Main.
     */
    @Test
    public void testChar() {
        System.out.println("Char");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Char(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comentario method, of class Main.
     */
    @Test
    public void testComentario() {
        System.out.println("Comentario");
        String lexema = "";
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.Comentario(lexema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobacion method, of class Main.
     */
    @Test
    public void testComprobacion() {
        System.out.println("Comprobacion");
        Main instance = new Main();
        instance.Comprobacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TabSimb method, of class Main.
     */
    @Test
    public void testTabSimb() {
        System.out.println("TabSimb");
        int x = 0;
        Main instance = new Main();
        instance.TabSimb(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Juntar method, of class Main.
     */
    @Test
    public void testJuntar() {
        System.out.println("Juntar");
        int x = 0;
        Main instance = new Main();
        instance.Juntar(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WordR method, of class Main.
     */
    @Test
    public void testWordR() {
        System.out.println("WordR");
        int i = 0;
        Main instance = new Main();
        instance.WordR(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Scope method, of class Main.
     */
    @Test
    public void testScope() {
        System.out.println("Scope");
        int i = 0;
        int j = 0;
        Main instance = new Main();
        instance.Scope(i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CodigoHEX method, of class Main.
     */
    @Test
    public void testCodigoHEX() {
        System.out.println("CodigoHEX");
        String nombre = "";
        Main instance = new Main();
        instance.CodigoHEX(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArchivoHEX method, of class Main.
     */
    @Test
    public void testArchivoHEX() {
        System.out.println("ArchivoHEX");
        Main instance = new Main();
        String expResult = "";
        String result = instance.ArchivoHEX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumador method, of class Main.
     */
    @Test
    public void testSumador() {
        System.out.println("Sumador");
        String conteo = "";
        String linea = "";
        String datos = "";
        Main instance = new Main();
        String expResult = "";
        String result = instance.Sumador(conteo, linea, datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Acumulador method, of class Main.
     */
    @Test
    public void testAcumulador() {
        System.out.println("Acumulador");
        String arch = "";
        Main instance = new Main();
        instance.Acumulador(arch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GeneradorCodigoPuertos method, of class Main.
     */
    @Test
    public void testGeneradorCodigoPuertos() {
        System.out.println("GeneradorCodigoPuertos");
        Main instance = new Main();
        instance.GeneradorCodigoPuertos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
