/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Zaposleni;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface ZaposleniService {

    public int getCount();

    public List<Zaposleni> getAllZaposleni();

    public boolean addZaposleni(Zaposleni zaposleni);

  //  public List<Zaposleni> getZaposleniByName(String name);
}
