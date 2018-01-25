/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.mapper;

import com.it355.boromijovic.model.Karta;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vesna.lazarevic
 */
public class KartaMapper implements RowMapper<Karta> {

    @Override
    public Karta mapRow(ResultSet rs, int arg1) throws SQLException {

        Karta karta = new Karta();
        karta.setId_karta(rs.getInt("id_karta"));
        karta.setDomacin(rs.getString("domacin"));
        karta.setGost(rs.getString("gost"));
        karta.setVreme_utakmice(rs.getString("vreme_utakmice"));
        karta.setCena_karte(rs.getString("cena_karte"));
        karta.setSektor(rs.getString("sektor"));
        karta.setBroj_sedista(rs.getString("broj_sedista"));
        //skarta.setKolicina(rs.getInt("kolicina"));
        
        return karta;
    }

}
