/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapper;

import com.mycompany.model.Korisnik;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vesna.lazarevic
 */
public class KorisnikMapper implements RowMapper<Korisnik> {

    @Override
    public Korisnik mapRow(ResultSet rs, int arg1) throws SQLException {

        Korisnik korisnik = new Korisnik();
        korisnik.setId_korisnik(rs.getInt("id_korisnik"));
        korisnik.setIme_korisnik(rs.getString("ime_korisnik"));
        korisnik.setPrezime_korisnik(rs.getString("prezime_korisnik"));
        korisnik.setAdresa_korisnik(rs.getString("adresa_korisnik"));
        korisnik.setTelefon_korisnik(rs.getString("telefon_korisnik"));
        korisnik.setEmail_korisnik(rs.getString("email_korisnik"));
        korisnik.setGrad_korisnik(rs.getString("grad_korisnik"));
        korisnik.setDrzava_korisnik(rs.getString("drzava_korisnik"));

        return korisnik;
    }
}
