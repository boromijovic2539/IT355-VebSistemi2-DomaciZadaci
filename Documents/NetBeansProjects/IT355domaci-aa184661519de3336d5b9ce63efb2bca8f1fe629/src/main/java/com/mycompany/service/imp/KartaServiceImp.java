/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service.imp;

import com.mycompany.dao.KartaDao;
import com.mycompany.model.Karta;
import com.mycompany.service.KartaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vesna.lazarevic
 */
@Service("kartaService")
public class KartaServiceImp implements KartaService {

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
