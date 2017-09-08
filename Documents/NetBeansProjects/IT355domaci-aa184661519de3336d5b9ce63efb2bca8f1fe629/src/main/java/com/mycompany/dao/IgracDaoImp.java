/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.mapper.IgracMapper;
import com.mycompany.model.Igrac;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vesna.lazarevic
 */
public class IgracDaoImp implements IgracDao {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM IGRAC JOIN KLUB ON IGRAC.ID_KLUB=KLUB.ID_KLUB";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Igrac getByID(int id) {
        String sql = "SELECT * FROM IGRAC WHERE ID_IGRAC = ?";
        Igrac igrac = jdbcTemplate.queryForObject(sql, new Object[]{id}, new IgracMapper());

        return igrac;
    }

    @Override
    public boolean update(Igrac igrac) {
        String sql = "UPDATE IGRAC SET IME_IGRAC = ?, PREZIME_IGRAC = ?, MESTO_RODJENJA = ?, POZICIJA = ?, NACIONALNOST = ? WHERE ID_IGRAC = ?";
        jdbcTemplate.update(sql, new Object[]{igrac.getIme_igrac(), igrac.getPrezime_igrac(),
            igrac.getMesto_rodjenja(), igrac.getPozicija(), igrac.getNacionalnost(),
            igrac.getId_igrac()});
        System.out.println("UPDATEOVANO");
        return true;}

    @Override
    public List<Igrac> getAllIgraci() {
        String sql = "SELECT * FROM IGRAC";
        List<Igrac> igraci = jdbcTemplate.query(sql, new IgracMapper());
        return igraci;
    }

    @Override
    public boolean addIgrac(Igrac igrac) {
        int klub = 1;
        String sql = "INSERT INTO IGRAC "
                + "(ID_IGRAC, ID_KLUB, IME_IGRAC, PREZIME_IGRAC, MESTO_RODJENJA, POZICIJA, NACIONALNOST, "
                + "TELEFON_ZAPOSLENI, ZANIMANJE) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{igrac.getId_igrac(), klub, igrac.getIme_igrac(), igrac.getPrezime_igrac(), igrac.getMesto_rodjenja(),
            igrac.getPozicija(), igrac.getNacionalnost()});
        return true;
    }

    @Override
    public boolean deleteIgrac(int igrac) {
        String sql = "DELETE FROM IGRAC WHERE ID_IGRAC = ?";
        jdbcTemplate.update(sql, new Object[]{igrac});
        System.out.println("OBRISANO");
        return true;
    }

    @Override
    public int getNextID() {
        String sql = "SELECT ID_IGRAC FROM IGRAC ORDER BY ID_IGRAC DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

}
