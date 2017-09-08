/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapper;

import com.mycompany.model.Zaposleni;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vesna.lazarevic
 */
public class ZaposleniMapper implements RowMapper<Zaposleni> {

    @Override
    public Zaposleni mapRow(ResultSet rs, int arg1) throws SQLException {

        Zaposleni zaposleni = new Zaposleni();
        zaposleni.setId_zaposleni(rs.getInt("id_zaposleni"));
        zaposleni.setIme_zaposleni(rs.getString("ime_zaposleni"));
        zaposleni.setPrezime_zaposleni(rs.getString("prezime_zaposleni"));
        zaposleni.setAdresa_zaposleni(rs.getString("adresa_zaposleni"));
        zaposleni.setTelefon_zaposleni(rs.getString("telefon_zaposleni"));
        zaposleni.setZanimanje(rs.getString("zanimanje"));

        return zaposleni;
    }

}