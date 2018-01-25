/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.dao;

import com.it355.boromijovic.model.Karta;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface KartaDao {

    public void addKarta();

    public String addKartaReturn();

    public void addKartaThrowException() throws Exception;

    public void addKartaAround(String domacin, String gost);

    /*SEDMI DOMACI ZADATAK*/
    
    public int getCount();

    public Karta getByID(int id);

    public boolean update(Karta karta);

    public List<Karta> getAllKarte();

    public boolean addKarta(Karta karta);

    public boolean deleteKarta(int id);

    public int getNextID();
}
