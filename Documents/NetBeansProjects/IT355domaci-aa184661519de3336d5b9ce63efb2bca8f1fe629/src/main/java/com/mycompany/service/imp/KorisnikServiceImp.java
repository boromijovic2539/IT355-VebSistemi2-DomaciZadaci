/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service.imp;

import com.mycompany.dao.KorisnikDao;
import com.mycompany.model.Korisnik;
import com.mycompany.service.KorisnikService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vesna.lazarevic
 */
@Service("korisnikService")
public class KorisnikServiceImp implements KorisnikService {

    @Autowired
    KorisnikDao korisnikDao;

    @Override
    public int getCount() {
        return korisnikDao.getCount();
    }

    @Override
    public List<Korisnik> getAllKorisnici() {
        return korisnikDao.getAllKorisnici();
    }

    @Override
    public boolean addKorisnik(Korisnik korisnik) {
        return korisnikDao.addKorisnik(korisnik);
    }

    /*
     @Override
     public List<Zaposleni> getZaposleniByName(String name) {
     return zaposleniDao.getZaposlenisByName(name);
     }*/
}
