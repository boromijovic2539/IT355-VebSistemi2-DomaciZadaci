/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vesna.lazarevic
 */
@SuppressWarnings("unused")
@Entity
@Table(name = "klub")
public class Klub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klub")
    private Integer id_klub;

    @Column(name = "naziv_klub")
    private String naziv_klub;

    @Column(name = "adresa_klub")
    private String adresa_klub;

    @Column(name = "kontakt_telefon")
    private String kontakt_telefon;

    @Column(name = "naziv_stadion")
    private String naziv_stadion;

    public Klub() {
    }

    public Integer getId_klub() {
        return id_klub;
    }

    public void setId_klub(Integer id_klub) {
        this.id_klub = id_klub;
    }

    public String getNaziv_klub() {
        return naziv_klub;
    }

    public void setNaziv_klub(String naziv_klub) {
        this.naziv_klub = naziv_klub;
    }

    public String getAdresa_klub() {
        return adresa_klub;
    }

    public void setAdresa_klub(String adresa_klub) {
        this.adresa_klub = adresa_klub;
    }

    public String getKontakt_telefon() {
        return kontakt_telefon;
    }

    public void setKontakt_telefon(String kontakt_telefon) {
        this.kontakt_telefon = kontakt_telefon;
    }

    public String getNaziv_stadion() {
        return naziv_stadion;
    }

    public void setNaziv_stadion(String naziv_stadion) {
        this.naziv_stadion = naziv_stadion;
    }

    @Override
    public String toString() {
        return naziv_klub;
    }

}
