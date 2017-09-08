/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.mapper.KartaMapper;
import com.mycompany.model.Karta;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vesna.lazarevic
 */
public class KartaDaoImp implements KartaDao {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM KARTA JOIN KLUB ON KARTA.ID_KLUB=KLUB.ID_KLUB";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Karta getByID(int id) {
        String sql = "SELECT * FROM KARTA WHERE ID_KARTA = ?";
        Karta karta = jdbcTemplate.queryForObject(sql, new Object[]{id}, new KartaMapper());

        return karta;
    }

    @Override
    public boolean update(Karta karta) {
        String sql = "UPDATE KARTA SET CENA_KARTA = ?, SLIKA = ? WHERE ID_KARTA = ?";
        jdbcTemplate.update(sql, new Object[]{karta.getCena_karte(), karta.getSlika(), karta.getId_karta()});
        System.out.println("UPDATEOVANO");
        return true;
    }

    @Override
    public List<Karta> getAllKarte() {
        String sql = "SELECT * FROM KARTA JOIN UTAKMICA ON KARTA.ID_UTAKMICA = UTAKMICA.ID_UTAKMICA";
        List<Karta> karta = jdbcTemplate.query(sql, new KartaMapper());
        return karta;
    }

    @Override
    public boolean addKarta(Karta karta) {
        int klub = 1;
        String sql = "INSERT INTO KARTA "
                + "(ID_KARTA, ID_KLUB, CENA_KARTE, SLIKA VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{karta.getId_karta(), klub, karta.getCena_karte(), karta.getSlika()});
        return true;
    }

    @Override
    public boolean deleteKarta(int karta) {
        String sql = "DELETE FROM KARTA WHERE ID_KARTA = ?";
        jdbcTemplate.update(sql, new Object[]{karta});
        System.out.println("OBRISANO");
        return true;
    }

    @Override
    public int getNextID() {
        String sql = "SELECT ID_KARTA FROM KARTA ORDER BY ID_KARTA DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

    @Override
    public Karta getKartaByID(int id) {
        String sql = "SELECT * FROM KARTA JOIN UTAKMICA ON KARTA.ID_UTAKMICA = UTAKMICA.ID_UTAKMICA WHERE ID_KARTA = ?";
        Karta karta = jdbcTemplate.queryForObject(sql, new Object[]{id}, new KartaMapper());

        return karta;
    }

    @Override
    public boolean kupi(int idK, int idUser, int br) {
        int kupovinaID = getNextKupovina();
        String sql = "INSERT INTO KUPOVINA "
                + "(ID_KUPOVINA, ID_KARTA, ID_KORISNIK,  BROJ_KARATA) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{kupovinaID, idK, idUser, br});
        return true;
    }

    protected int getNextKupovina() {
        String sql = "SELECT ID_KUPOVINA FROM KUPOVINA ORDER BY ID_KUPOVINA DESC LIMIT 1";
        int id = 1;
        id = jdbcTemplate.queryForObject(sql, Integer.class);
        return id+1;
    }
}
