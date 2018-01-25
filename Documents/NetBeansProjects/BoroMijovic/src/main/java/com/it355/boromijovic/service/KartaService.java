/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.service;

import com.it355.boromijovic.model.Karta;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface KartaService {

    public int getCount();

    public List<Karta> getAllKarte();

    public boolean addKarta(Karta karta);

}
