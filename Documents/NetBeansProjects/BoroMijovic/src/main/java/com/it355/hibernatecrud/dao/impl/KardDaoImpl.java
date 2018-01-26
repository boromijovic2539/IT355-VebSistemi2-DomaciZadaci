/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.dao.impl;

import com.it355.hibernatecrud.dao.KardDao;
import com.it355.hibernatecrud.entity.Karta;
import com.it355.hibernatecrud.entity.Klub;
import com.it355.hibernatecrud.entity.Utakmica;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vesna.lazarevic
 */
@Repository("kartaDao")
@Service
public class KardDaoImpl implements KardDao {

    @SuppressWarnings("unused")
    private final Log logger = LogFactory.getLog(getClass());

    //Instanciramo sesiju
    @Autowired
    private SessionFactory sessionFactory;

    //kreiramo seter za sesiju
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //kreiramo geter za sesiju
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    //potrebno je da sve metode koje pozivaju sesiju i rade nešto nad bazom imaju anotaciju @Transactional
    //to hibernate-u stavlja do znanja da treba da 'gleda' te metode i da one kreiraju transakciju neke vrste
    @Transactional
    public List<Utakmica> getUtakmice() {
        List<Utakmica> results = (List<Utakmica>) getSession().createCriteria(Utakmica.class).list();
        return results;
    }

    @Override
    @Transactional
    public Utakmica getUtakmicaById(int id) {
        /*getSession().createCriteria(Product.class).add(Restrictions.eq("id", id))
         .uniqueResult() je metoda koju omogucava Hibernate
         Ovo je vrsta SQL querry-ja pri cemu je tabela iz koje citamo podatke definisana kao
         atribut metode createCriteria, dok su parametri po kojima pretrazujemo atributi metode
         Restrictions.eq(naziv parametra u bazi, naziv parametra u entitetu). Za svaki parametar dodaje se
         posebna restrikcija.
         Ovaj kod bi mogao da se prevede u sql kao: 
         SELECT * FROM PRODUCT WHERE ID=?
         */
        Utakmica product = (Utakmica) getSession().createCriteria(Utakmica.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return product;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Klub> getKlubovi() {
        List<Klub> results = (List<Klub>) getSession().createCriteria(Klub.class).list();
        return results;
    }

    @Override
    @Transactional
    public Klub getKlubById(int id) {
        Klub klub = (Klub) getSession().createCriteria(Klub.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return klub;
    }

    @Override
    @Transactional
    public void saveCart(Karta cart) {
        cart.setCena_karte(cart.getCena_karte());
        //getSession().saveOrUpdate(cart) kreira novi cart u tabeli SHOPPING_CART ili ako vec postoji
        //unosi izmene poredjenjem
        getSession().saveOrUpdate(cart);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Utakmica> getUtakmiceByKlub(Klub klub) {
        return (List<Utakmica>) getSession().createCriteria(Utakmica.class).add(Restrictions.eq("klub", klub))
                .list();
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Karta> getAllKarte() {
        List<Karta> karte = (List<Karta>) getSession().createCriteria(Karta.class).list();
        return karte;
    }

    @Override
    @Transactional
    public void editKlub(Klub klub) {
        getSession().saveOrUpdate(klub);
    }

    @Override
    @Transactional
    public Klub addKlub(Klub klub) {
        return (Klub) getSession().merge(klub);
    }

    @Override
    @Transactional
    public void editUtakmica(Utakmica utakmica) {
        getSession().saveOrUpdate(utakmica);
    }

    @Override
    @Transactional
    public Utakmica addUtakmica(Utakmica utakmica) {
        return (Utakmica) getSession().merge(utakmica);
    }

    @Transactional
    @Override
    public void editKarta(Karta karta) {
        getSession().saveOrUpdate(karta);
    }

    @Transactional
    @Override
    public Karta getKartaById(Integer id) {
        Karta karta = (Karta) getSession().createCriteria(Karta.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        return karta;
    }

    @Transactional
    @Override
    public int getCountUtakmiceInKlub(int klubId) {
        String hql = "select count(*) from utakmica where id_klub = :id";
        Number result = (Number) getSession().createSQLQuery(hql).setInteger("id", klubId).uniqueResult();
        return Integer.parseInt(result.toString());
    }

    @Transactional
    @Override
    public int getCountUtakmice() {
        Number result = (Number) getSession().createSQLQuery("select count(*) from utakmica").uniqueResult();
        return Integer.parseInt(result.toString());
    }

    @Transactional
    @Override
    public void deleteUtakmica(Utakmica utakmica) {
        getSession().delete(utakmica);
    }

    @Transactional
    @Override
    public void deleteKlub(Klub klub) {
        getSession().delete(klub);
    }

    @Override
    public void deleteKarta(Karta karta) {
        getSession().delete(karta);
    }

}
