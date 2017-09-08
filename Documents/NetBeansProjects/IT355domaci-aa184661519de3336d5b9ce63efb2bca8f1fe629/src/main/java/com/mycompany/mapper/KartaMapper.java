/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapper;

import com.mycompany.model.Karta;
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
        karta.setCena_karte(rs.getDouble("cena_karte"));
        karta.setSlika(rs.getString("slika"));
        karta.setId_utakmica(rs.getInt("id_utakmica"));
        karta.setGostujuci_tim(rs.getString("gostujuci_tim"));
        karta.setVreme_utakmice(rs.getString("vreme_utakmice"));

        return karta;
    }

}
