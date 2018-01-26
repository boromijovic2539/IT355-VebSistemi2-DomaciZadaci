/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.converter;

import com.it355.hibernatecrud.dao.KardDao;
import com.it355.hibernatecrud.entity.Klub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author vesna.lazarevic
 */
@Component
final public class IntegerToKlub implements Converter<String , Klub>{

    @Autowired
    KardDao kartaDao;

    @Override
    public Klub convert(String  s) {
        if(s.isEmpty()){
            return null;
        }
        Integer valeu = Integer.valueOf(s);
        System.out.println("Konvertujem u kategoriju");
        Klub cat = kartaDao.getKlubById(valeu);
        return cat;
    }
}
