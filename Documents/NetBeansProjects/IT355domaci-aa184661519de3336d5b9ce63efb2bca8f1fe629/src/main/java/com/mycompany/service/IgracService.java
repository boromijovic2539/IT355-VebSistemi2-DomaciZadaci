/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Igrac;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface IgracService {
    
    public int getCount();

    public List<Igrac> getAllIgraci();

    public boolean addIgrac(Igrac igrac);

  //  public List<Zaposleni> getZaposleniByName(String name);
}
