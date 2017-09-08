/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Igrac;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface IgracDao {
    
    
    public int getCount();

    public Igrac getByID(int id);

    public boolean update(Igrac igrac);

    public List<Igrac> getAllIgraci();

    public boolean addIgrac(Igrac igrac);

    public boolean deleteIgrac(int igrac);

    public int getNextID();
    
}
