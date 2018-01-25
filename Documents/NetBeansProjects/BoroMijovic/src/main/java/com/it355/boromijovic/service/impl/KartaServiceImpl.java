/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.service.impl;

import com.it355.boromijovic.dao.KartaDao;
import com.it355.boromijovic.model.Karta;
import com.it355.boromijovic.service.KartaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vesna.lazarevic
 */
@Service("kartaService")
public class KartaServiceImpl implements KartaService {

    @Autowired
    KartaDao kartaDao;

    @Override
    public int getCount() {
        return kartaDao.getCount();
    }

    @Override
    public List<Karta> getAllKarte() {
        return kartaDao.getAllKarte();
    }

    @Override
    public boolean addKarta(Karta karta) {
        return kartaDao.addKarta(karta);
    }

}
