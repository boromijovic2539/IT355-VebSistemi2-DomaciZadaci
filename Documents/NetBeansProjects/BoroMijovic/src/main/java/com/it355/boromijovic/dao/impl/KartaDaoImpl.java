/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.dao.impl;

import com.it355.boromijovic.dao.KartaDao;

/**
 *
 * @author vesna.lazarevic
 */
public class KartaDaoImpl implements KartaDao{

    @Override
    public void addKarta() {
        System.out.println("Dodajem novu kartu.");
    }

    @Override
    public String addKartaReturn() {
         System.out.println("Dodajem novu kartu.");
         return "Karta je uspesno dodata.";
    }

    @Override
    public void addKartaThrowException() throws Exception {
        System.out.println("Dodajem novu kartu i izbacujem gresku!");
        throw new Exception("GRESKAAA KARDINALE!!!");
    }

    @Override
    public void addKartaAround(String domacin, String gost) {
        System.out.println("Dodajem novu kartu za mec "+domacin+":"+gost);   
    }
    
}
