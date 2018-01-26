/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic;

import com.it355.hibernatecrud.dao.KardDao;
import com.it355.hibernatecrud.entity.Klub;
import com.it355.hibernatecrud.entity.Utakmica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author vesna.lazarevic
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @Autowired
    KardDao kardDao;
    
    //metoda koja prikazuje sve produkte, tipa get, a proizvode prikazuje u JSON formatu
    @RequestMapping(value = "/utakmice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Utakmica>> getUtakmice() {
        System.out.println("Fetching products");
        List<Utakmica> utakmice = kardDao.getUtakmice();
        if (utakmice.size() == 0) {
            System.out.println("utakmica list empty");
            return new ResponseEntity<List<Utakmica>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Utakmica>>(utakmice, HttpStatus.OK);
    }
    
    //metoda koja po id-ju prikazuje jedan utakmicu. 
    //na adresi http://localhost:8080/BoroMijovic/utakmica/4 pozivamo ovu metodu
    //
    @RequestMapping(value = "/utakmica/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Utakmica> getUtakmica(@PathVariable("id") int id) {
        System.out.println("Fetching utakmica with id " + id);
        Utakmica utakmica = kardDao.getUtakmicaById(id);
        if (utakmica == null) {
            System.out.println("Utakmica with " + id + " not found");
            return new ResponseEntity<Utakmica>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Utakmica>(utakmica, HttpStatus.OK);
    }
    
    //metoda koja cuva proizvod u bazu
    @RequestMapping(value = "/utakmicama", method = RequestMethod.POST)
    public ResponseEntity<Void> addUtakmica(@RequestBody Utakmica utakmica) {
        System.out.println("Adding Utakmica " + utakmica.toString());
        kardDao.addUtakmica(utakmica);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    //metoda koja uzima proizvod iz baze po id-u, menja ga i cuva ga u bazi
    @RequestMapping(value = "/utakmica/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Utakmica> updateUtakmica(@PathVariable("id") int id, @RequestBody Utakmica utakmica) {
        System.out.println("Updating Utakmica " + id);
             
        utakmica.setId_utakmica(id);
        kardDao.editUtakmica(utakmica);
        return new ResponseEntity<Utakmica>(utakmica, HttpStatus.OK);
    }
      
    //metoda koja po id-u nalazi i brise produkt iz baze
    @RequestMapping(value = "/utakmica/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Utakmica> deleteUtakmica(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting Utakmica with id " + id);
 
        Utakmica utakmica = kardDao.getUtakmicaById(id);
        if (utakmica == null) {
            System.out.println("Unable to delete. Utakmica with id " + id + " not found");
            return new ResponseEntity<Utakmica>(HttpStatus.NOT_FOUND);
        }
 
        kardDao.deleteUtakmica(utakmica);
        return new ResponseEntity<Utakmica>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/klubovi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Klub>> getKlubovi() {
        System.out.println("Fetching Klubovi");
        List<Klub> klubovi = kardDao.getKlubovi();
        if (klubovi.size() == 0) {
            System.out.println("Klub list empty");
            return new ResponseEntity<List<Klub>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Klub>>(klubovi, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/klub/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Klub> getKlub(@PathVariable("id") int id) {
        System.out.println("Fetching Klub with id " + id);
        Klub klub = kardDao.getKlubById(id);
        if (klub == null) {
            System.out.println("Klub with " + id + " not found");
            return new ResponseEntity<Klub>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Klub>(klub, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/klub/", method = RequestMethod.POST)
    public ResponseEntity<Void> addKlub(@RequestBody Klub klub) {
        System.out.println("Adding Klub " + klub.toString());
        kardDao.addKlub(klub);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    @RequestMapping(value = "/klub/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Klub> updateKlub(@PathVariable("id") int id, @RequestBody Klub klub) {
        System.out.println("Updating Klub " + id);
             
        klub.setId_klub(id);
        kardDao.editKlub(klub);
        return new ResponseEntity<Klub>(klub, HttpStatus.OK);
    }
      
    @RequestMapping(value = "/klub/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Klub> deleteKlub(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting Klub with id " + id);
 
        Klub klub = kardDao.getKlubById(id);
        if (klub == null) {
            System.out.println("Unable to delete. Klub with id " + id + " not found");
            return new ResponseEntity<Klub>(HttpStatus.NOT_FOUND);
        }
 
        kardDao.deleteKlub(klub);
        return new ResponseEntity<Klub>(HttpStatus.OK);
    }
 
    
}
