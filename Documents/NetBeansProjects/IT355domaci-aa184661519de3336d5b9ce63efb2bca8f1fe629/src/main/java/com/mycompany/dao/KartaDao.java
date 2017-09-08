/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Karta;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface KartaDao {

    public int getCount();

    public Karta getByID(int id);

    public boolean update(Karta karta);

    public List<Karta> getAllKarte();

    public boolean addKarta(Karta karta);

    public boolean deleteKarta(int karta);

    public int getNextID();
    
    public Karta getKartaByID(int id);

    public boolean kupi(int idK, int idUser, int br);
}
