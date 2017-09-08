/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.mapper.ZaposleniMapper;
import com.mycompany.model.Zaposleni;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vesna.lazarevic
 */
public class ZaposleniDaoImp implements ZaposleniDao {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM ZAPOSLENI JOIN KLUB ON ZAPOSLENI.ID_KLUB=KLUB.ID_KLUB";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Zaposleni> getAllZaposleni() {
        String sql = "SELECT * FROM ZAPOSLENI";
        List<Zaposleni> zaposleni = jdbcTemplate.query(sql, new ZaposleniMapper());
        return zaposleni;
    }

    @Override
    @Transactional
    public boolean addZaposleni(Zaposleni zaposlen) {
        int klub = 1;
        String sql = "INSERT INTO ZAPOSLENI "
                + "(ID_ZAPOSLENI, ID_KLUB, IME_ZAPOSLENI, PREZIME_ZAPOSLENI, ADRESA_ZAPOSLENI, "
                + "TELEFON_ZAPOSLENI, ZANIMANJE) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{zaposlen.getId_zaposleni(), klub, zaposlen.getIme_zaposleni(), zaposlen.getPrezime_zaposleni(), zaposlen.getAdresa_zaposleni(),
            zaposlen.getTelefon_zaposleni(), zaposlen.getZanimanje()});
        return true;
    }

    @Override
    public boolean deleteZaposleni(int zap) {
        String sql = "DELETE FROM ZAPOSLENI WHERE ID_ZAPOSLENI = ?";
        jdbcTemplate.update(sql, new Object[]{zap});
        System.out.println("OBRISANO");
        return true;
    }

    @Override
    public int getNextID() {
        String sql = "SELECT ID_ZAPOSLENI FROM ZAPOSLENI ORDER BY ID_ZAPOSLENI DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

    @Override
    public Zaposleni getByID(int id) {
        String sql = "SELECT * FROM ZAPOSLENI WHERE ID_ZAPOSLENI = ?";
        Zaposleni zaposleni = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ZaposleniMapper());

        return zaposleni;
    }

    @Override
    public boolean update(Zaposleni zaposleni) {
        String sql = "UPDATE ZAPOSLENI SET IME_ZAPOSLENI = ?, PREZIME_ZAPOSLENI = ?, ADRESA_ZAPOSLENI = ?, TELEFON_ZAPOSLENI = ?, ZANIMANJE = ? WHERE ID_ZAPOSLENI = ?";
        jdbcTemplate.update(sql, new Object[]{zaposleni.getIme_zaposleni(), zaposleni.getPrezime_zaposleni(),
            zaposleni.getAdresa_zaposleni(), zaposleni.getTelefon_zaposleni(), zaposleni.getZanimanje(),
            zaposleni.getId_zaposleni()});
        System.out.println("UPDATEOVANO");
        return true;
    }

}
