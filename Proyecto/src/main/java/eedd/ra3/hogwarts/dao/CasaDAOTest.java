package eedd.ra3.hogwarts.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import eedd.ra3.hogwarts.vo.Casa;
import eedd.ra3.hogwarts.dao.impl.CasaDaoArray;

class CasaDaoArrayTest {

    private CasaDaoArray dao;

    @BeforeEach
    void setUp() {
        dao = new CasaDaoArray();
    }

    @Test
    void testNombreExiste() {
        List<Casa> lista = dao.obtenerCasaPorNombre("Gryffindor");

        assertNotNull(lista);
        assertEquals(1, lista.size());
        assertEquals("Gryffindor", lista.get(0).getNombre());
    }

    @Test
    void testNombreIgnoreCase() {
        List<Casa> lista = dao.obtenerCasaPorNombre("gryffindor");

        assertNotNull(lista);
        assertEquals("Gryffindor", lista.get(0).getNombre());
    }

    @Test
    void testNombreNoExiste() {
        List<Casa> lista = dao.obtenerCasaPorNombre("CasaInexistente");

        assertTrue(lista == null || lista.isEmpty());
    }
}
