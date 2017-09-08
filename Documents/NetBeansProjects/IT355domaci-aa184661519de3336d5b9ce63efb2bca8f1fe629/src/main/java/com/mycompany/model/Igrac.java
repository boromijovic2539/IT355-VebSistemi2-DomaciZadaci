/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;

/**
 *
 * @author vesna.lazarevic
 */
@SuppressWarnings("serial")
public class Igrac implements Serializable {

    Integer id_igrac;
    String ime_igrac;
    String prezime_igrac;
    String pozicija;
    String mesto_rodjenja;
    String nacionalnost;

    public Integer getId_igrac() {
        return id_igrac;
    }

    public void setId_igrac(Integer id_igrac) {
        this.id_igrac = id_igrac;
    }

    public String getIme_igrac() {
        return ime_igrac;
    }

    public void setIme_igrac(String ime_igrac) {
        this.ime_igrac = ime_igrac;
    }

    public String getPrezime_igrac() {
        return prezime_igrac;
    }

    public void setPrezime_igrac(String prezime_igrac) {
        this.prezime_igrac = prezime_igrac;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getMesto_rodjenja() {
        return mesto_rodjenja;
    }

    public void setMesto_rodjenja(String mesto_rodjenja) {
        this.mesto_rodjenja = mesto_rodjenja;
    }

    public String getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(String nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    @Override
    public String toString() {
        return "Igrac{" + "id_igrac=" + id_igrac + ", ime_igrac=" + ime_igrac + ", prezime_igrac=" + prezime_igrac + ", pozicija=" + pozicija + ", mesto_rodjenja=" + mesto_rodjenja + ", nacionalnost=" + nacionalnost + '}';
    }

}
