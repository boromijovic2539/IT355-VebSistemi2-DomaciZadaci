/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service.imp;

import com.mycompany.service.ZaposleniService;
import com.mycompany.dao.ZaposleniDao;
import com.mycompany.model.Zaposleni;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vesna.lazarevic
 */
@Service("zaposleniService")
public class ZaposleniServiceImp implements ZaposleniService {

    @Autowired
    ZaposleniDao zaposleniDao;

    @Override
    public int getCount() {
        return zaposleniDao.getCount();
    }

    @Override
    public List<Zaposleni> getAllZaposleni() {
        return zaposleniDao.getAllZaposleni();
    }

    @Override
    public boolean addZaposleni(Zaposleni zaposlen) {
        return zaposleniDao.addZaposleni(zaposlen);
    }

    /*
     @Override
     public List<Zaposleni> getZaposleniByName(String name) {
     return zaposleniDao.getZaposlenisByName(name);
     }*/
}
