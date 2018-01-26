/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.dao.impl;

import com.it355.hibernatecrud.dao.KardDao;
import com.it355.hibernatecrud.entity.Karta;
import com.it355.hibernatecrud.entity.Klub;
import com.it355.hibernatecrud.entity.Utakmica;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author vesna.lazarevic
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class KardDaoImplTest {

    @Autowired
    KardDao instance;

    @Autowired
    ApplicationContext context;

    @Before
    public void setUp() {
    }

    /**
     * Test of getUtakmicaById method, of class KardDaoImpl.
     */
    @Test
    public void testGetUtakmicaById() {
        System.out.println("getUtakmicaById");
        int id = 2;
        Utakmica expResult = new Utakmica();
        expResult.setId_utakmica(2);
        expResult.setGostujuci_tim("Atalanta");
        expResult.setVreme_utakmice("14:30");
        Klub a = new Klub();
        a.setId_klub(6);
        a.setAdresa_klub("Leonardo da Vinci");
        a.setKontakt_telefon("+311441815");
        a.setNaziv_klub("Fiorentina");
        a.setNaziv_stadion("Artemio Franchi");
        expResult.setKlub(a);

        Utakmica result = instance.getUtakmicaById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getKlubovi method, of class KardDaoImpl.
     */
    @Test
    public void testGetKlubovi() {
        System.out.println("getKlubovi");
        KardDaoImpl instance = new KardDaoImpl();
        List<Klub> expResult = null;
        List<Klub> result = instance.getKlubovi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKlubById method, of class KardDaoImpl.
     */
    @Test
    public void testGetKlubById() {
        System.out.println("getKlubById");
        int id = 6;
        Klub expResult = new Klub();
        expResult.setId_klub(6);
        expResult.setAdresa_klub("Leonardo da Vinci");
        expResult.setKontakt_telefon("+311441815");
        expResult.setNaziv_klub("Fiorentina");
        expResult.setNaziv_stadion("Artemio Franchi");

        Klub result = instance.getKlubById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addKlub method, of class KardDaoImpl.
     */
    @Test
    public void testAddKlub() {
        System.out.println("addKlub");
        Klub klub = new Klub();
        klub.setId_klub(10);
        klub.setAdresa_klub("Ljutice Bogdana");
        klub.setKontakt_telefon("5455454");
        klub.setNaziv_klub("Crvena Zvezda");
        klub.setNaziv_stadion("Marakana");
        instance.addKlub(klub);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getKartaById method, of class KardDaoImpl.
     */
    @Test
    public void testGetKartaById() {
        System.out.println("getKartaById");
        Integer id = 4;
        Karta expResult = new Karta();
        expResult.setCena_karte("350");
        expResult.setId_karta(4);
        Utakmica utak = new Utakmica();
        utak.setId_utakmica(2);
        utak.setGostujuci_tim("Atalanta");
        utak.setVreme_utakmice("14:30");
        Klub a = new Klub();
        a.setId_klub(6);
        a.setAdresa_klub("Leonardo da Vinci");
        a.setKontakt_telefon("+311441815");
        a.setNaziv_klub("Fiorentina");
        a.setNaziv_stadion("Artemio Franchi");
        utak.setKlub(a);
        expResult.setUtakmica(utak);

        Karta result = instance.getKartaById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCountUtakmiceInKlub method, of class KardDaoImpl.
     */
    @Test
    public void testGetCountUtakmiceInKlub() {
        System.out.println("getCountUtakmiceInKlub");
        int klubId = 5;
        int expResult = 0;
        int result = instance.getCountUtakmiceInKlub(klubId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCountUtakmice method, of class KardDaoImpl.
     */
    @Test
    public void testGetCountUtakmice() {
        System.out.println("getCountUtakmice");
        int expResult = 2;
        int result = instance.getCountUtakmice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteUtakmica method, of class KardDaoImpl.
     */
    @Test
    public void testDeleteUtakmica() {
        System.out.println("deleteUtakmica");
        Utakmica utakmica = new Utakmica();
        utakmica.setId_utakmica(2);
        utakmica.setGostujuci_tim("Atalanta");
        utakmica.setVreme_utakmice("14:30");
        Klub a = new Klub();
        a.setId_klub(6);
        a.setAdresa_klub("Leonardo da Vinci");
        a.setKontakt_telefon("+311441815");
        a.setNaziv_klub("Fiorentina");
        a.setNaziv_stadion("Artemio Franchi");
        utakmica.setKlub(a);

        instance.deleteUtakmica(utakmica);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteKlub method, of class KardDaoImpl.
     */
    @Test
    public void testDeleteKlub() {
        System.out.println("deleteKlub");
        Klub klub = new Klub();
        klub.setId_klub(6);
        klub.setAdresa_klub("Via Regolleta");
        klub.setKontakt_telefon("7878774");
        klub.setNaziv_klub("Inter");
        klub.setNaziv_stadion("Giuzeppe Meazza");
        instance.deleteKlub(klub);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteKarta method, of class KardDaoImpl.
     */
    @Test
    public void testDeleteKarta() {
        System.out.println("deleteKarta");
        Karta karta = new Karta();
        karta.setId_karta(2);
        karta.setCena_karte("400");
        instance.deleteKarta(karta);
        // TODO review the generated test code and remove the default call to fail.
    }

}
