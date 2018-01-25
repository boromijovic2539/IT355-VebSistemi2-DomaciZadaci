/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.dao.impl;

import com.it355.boromijovic.dao.KartaDao;
import com.it355.boromijovic.model.Karta;
import com.it355.boromijovic.mapper.KartaMapper;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vesna.lazarevic
 */
public class KartaDaoImpl implements KartaDao {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addKarta() {
        System.out.println("Dodajem novu kartu.");
    }

    @Override
    public String addKartaReturn() {
        System.out.println("Dodajem novu kartu.");
        return "Karta je uspesno dodata.";
    }

    @Override
    public void addKartaThrowException() throws Exception {
        System.out.println("Dodajem novu kartu i izbacujem gresku!");
        throw new Exception("GRESKAAA KARDINALE!!!");
    }

    @Override
    public void addKartaAround(String domacin, String gost) {
        System.out.println("Dodajem novu kartu za mec " + domacin + ":" + gost);
    }
    /*               SEDMI DOMACI ZADATAK                     */

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM KORPA JOIN KORISNIK ON KORPA.ID_KORISNIK=KORISNIK.ID_KORISNIK";
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
        String sql = "UPDATE karta SET `DOMACIN`=?,`GOST`=?,`VREME_UTAKMICE`=?,"+
        "`CENA_KARTE`=?,`SEKTOR`=?,`BROJ_SEDISTA`=? WHERE ID_KARTA=?";
        jdbcTemplate.update(sql, new Object[]{karta.getDomacin(), karta.getGost(),
            karta.getVreme_utakmice(), karta.getCena_karte(), karta.getSektor(),
            karta.getBroj_sedista(), karta.getId_karta()});
        System.out.println("UPDATEOVANO");
        return true;
    }

    @Override
    public List<Karta> getAllKarte() {
        String sql = "SELECT * FROM KARTA";  // za USERNAME ide -> JOIN USERS ON KORISNIK.ID_KORISNIK=USERS.ID_KORISNIK
        List<Karta> karte = jdbcTemplate.query(sql, new KartaMapper());
        return karte;
    }

    @Override
    public boolean addKarta(Karta karta) {
        int klub = 1;
        String sql = "INSERT INTO karta (`DOMACIN`, `GOST`, `VREME_UTAKMICE`, `CENA_KARTE`, `SEKTOR`, `BROJ_SEDISTA`)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{karta.getDomacin(), karta.getGost(),
            karta.getVreme_utakmice(), karta.getCena_karte(), karta.getSektor(),
            karta.getBroj_sedista()});

        /*treba dodati u korpu*/
        return true;
    }

    @Override
    public boolean deleteKarta(int id) {
        String sql = "DELETE FROM KARTA WHERE ID_KARTA = ?";
        jdbcTemplate.update(sql, new Object[]{id});
        System.out.println("OBRISANO");
        return true;
    }

    @Override
    public int getNextID() {
        int tempID = 0;
        int provera = 0;

        String sql = "SELECT ID_KARTA FROM KARTA ORDER BY ID_KARTA DESC LIMIT 1";
        provera = jdbcTemplate.queryForObject(sql, Integer.class);

        if (provera >= tempID) {
            System.out.println("\n \tID JE: " + provera);
            return provera;
        } else {
            System.out.println("\n \tID JE: " + (tempID + 1));
            return tempID + 1;
        }
    }

}
