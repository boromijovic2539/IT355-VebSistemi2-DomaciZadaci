/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service.imp;

import com.mycompany.dao.IgracDao;
import com.mycompany.model.Igrac;
import com.mycompany.service.IgracService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vesna.lazarevic
 */
@Service("igracService")
public class IgracServiceImp implements IgracService {
    
    @Autowired
    IgracDao igracDao;
    
    @Override
    public int getCount() {
        return igracDao.getCount();
    }
    
    @Override
    public List<Igrac> getAllIgraci() {
        return igracDao.getAllIgraci();
    }
    
    @Override
    public boolean addIgrac(Igrac igrac) {
        return igracDao.addIgrac(igrac);
    }
    
}
