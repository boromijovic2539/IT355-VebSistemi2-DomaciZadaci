/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapper;

import com.mycompany.model.Igrac;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author vesna.lazarevic
 */
public class IgracMapper implements RowMapper<Igrac> {

    @Override
    public Igrac mapRow(ResultSet rs, int arg1) throws SQLException {

        Igrac igraci = new Igrac();
        igraci.setId_igrac(rs.getInt("id_igrac"));
        igraci.setIme_igrac(rs.getString("ime_igrac"));
        igraci.setPrezime_igrac(rs.getString("prezime_igrac"));
        igraci.setMesto_rodjenja(rs.getString("mesto_rodjenja"));
        igraci.setPozicija(rs.getString("pozicija"));
        igraci.setNacionalnost(rs.getString("nacionalnost"));

        return igraci;
    }
}
