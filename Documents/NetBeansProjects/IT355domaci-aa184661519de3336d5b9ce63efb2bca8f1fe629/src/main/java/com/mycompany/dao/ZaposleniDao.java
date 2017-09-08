/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Zaposleni;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface ZaposleniDao {

    public int getCount();

    public Zaposleni getByID(int id);

    public boolean update(Zaposleni zaposleni);

    public List<Zaposleni> getAllZaposleni();

    public boolean addZaposleni(Zaposleni zaposleni);

    public boolean deleteZaposleni(int zap);

    public int getNextID();

	//public List<Zaposleni> getZaposlenisByName(String name);
}
