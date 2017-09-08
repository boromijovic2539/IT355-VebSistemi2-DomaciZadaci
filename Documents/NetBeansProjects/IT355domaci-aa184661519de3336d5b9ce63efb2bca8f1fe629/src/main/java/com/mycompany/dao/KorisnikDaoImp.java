


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.mapper.KorisnikMapper;
import com.mycompany.model.Korisnik;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vesna.lazarevic
 */
public class KorisnikDaoImp implements KorisnikDao {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM KORISNIK";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Korisnik> getAllKorisnici() {
        String sql = "SELECT * FROM KORISNIK";  // za USERNAME ide -> JOIN USERS ON KORISNIK.ID_KORISNIK=USERS.ID_KORISNIK
        List<Korisnik> korisnici = jdbcTemplate.query(sql, new KorisnikMapper());
        return korisnici;
    }

    @Override
    @Transactional
    public boolean addKorisnik(Korisnik korisnik) {
        String sql = "INSERT INTO KORISNIK "
                + "(ID_KORISNIK, IME_KORISNIK, PREZIME_KORISNIK, "
                + "ADRESA_KORISNIK, TELEFON_KORISNIK, EMAIL_KORISNIK, GRAD_KORISNIK, DRZAVA_KORISNIK) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{korisnik.getId_korisnik(), korisnik.getIme_korisnik(), korisnik.getPrezime_korisnik(),
            korisnik.getAdresa_korisnik(), korisnik.getTelefon_korisnik(), korisnik.getEmail_korisnik(),
            korisnik.getGrad_korisnik(), korisnik.getDrzava_korisnik()});
        return true;
    }

    @Override
    public boolean deleteKorisnik(int kor) {
        String sql = "DELETE FROM KORISNIK WHERE ID_KORISNIK = ?";
        jdbcTemplate.update(sql, new Object[]{kor});
        System.out.println("OBRISANO");
        return true;
    }

    @Override
    public int getNextID() {
        String sql = "SELECT ID_KORISNIK FROM KORISNIK ORDER BY ID_KORISNIK DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

    @Override
    public Korisnik getByID(int id) {
        String sql = "SELECT * FROM KORISNIK WHERE ID_KORISNIK = ?";
        Korisnik korisnik = jdbcTemplate.queryForObject(sql, new Object[]{id}, new KorisnikMapper());

        return korisnik;
    }

    @Override
    public boolean update(Korisnik korisnik) {
        String sql = "UPDATE KORISNIK SET IME_KORISNIK = ?, PREZIME_KORISNIK = ?, ADRESA_KORISNIK = ?, TELEFON_KORISNIK = ?, EMAIL_KORISNIK = ?, GRAD_KORISNIK = ?, DRZAVA_KORISNIK = ? WHERE ID_KORISNIK = ?";
        jdbcTemplate.update(sql, new Object[]{korisnik.getIme_korisnik(), korisnik.getPrezime_korisnik(),
            korisnik.getAdresa_korisnik(), korisnik.getTelefon_korisnik(), korisnik.getEmail_korisnik(),
            korisnik.getGrad_korisnik(), korisnik.getDrzava_korisnik(), korisnik.getId_korisnik()});
        System.out.println("UPDATEOVANO");
        return true;
    }

    @Override
    public boolean addUser(int idKor, String username, String password) {
        int enabled = 1;
        int id = getNextIDUser();

        String sql = "INSERT INTO USERS "
                + "(ID_USER, ID_KORISNIK, USERNAME, "
                + "PASSWORD, ENABLED) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{id, idKor, username,
            password, enabled});
        return true;
    }

    @Override
    public int getNextIDUser() {
        String sql = "SELECT ID_USER FROM USERS ORDER BY ID_USER DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

    @Override
    public boolean addUserRole(int idUsr) {
        int id = getNextIDUserRole();

        String sql = "INSERT INTO USER_ROLES "
                + "(USER_ROLE_ID, ID_USER, ROLE) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{id, idUsr, "ROLE_USER"});
        return true;
    }

    @Override
    public int getNextIDUserRole() {
        String sql = "SELECT USER_ROLE_ID FROM USER_ROLES ORDER BY USER_ROLE_ID DESC LIMIT 1";
        int tempID = jdbcTemplate.queryForObject(sql, Integer.class);
        return tempID + 1;
    }

    @Override
    public int getIDByUsername(String name) {
        String sql = "SELECT KORISNIK.ID_KORISNIK FROM KORISNIK JOIN USERS ON KORISNIK.ID_KORISNIK = USERS.ID_KORISNIK WHERE USERNAME = ?";
        int id = jdbcTemplate.queryForObject(sql,  new Object[]{name} ,Integer.class);
        return id;
    }

}
