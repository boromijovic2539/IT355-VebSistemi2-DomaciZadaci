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
public class Zaposleni  implements Serializable{
    
    Integer id_zaposleni;
    String ime_zaposleni;
    String prezime_zaposleni;
    String adresa_zaposleni;
    String telefon_zaposleni;
    String zanimanje;

    public Integer getId_zaposleni() {
        return id_zaposleni;
    }

    public void setId_zaposleni(Integer id_zaposleni) {
        this.id_zaposleni = id_zaposleni;
    }

    public String getIme_zaposleni() {
        return ime_zaposleni;
    }

    public void setIme_zaposleni(String ime_zaposleni) {
        this.ime_zaposleni = ime_zaposleni;
    }

    public String getPrezime_zaposleni() {
        return prezime_zaposleni;
    }

    public void setPrezime_zaposleni(String prezime_zaposleni) {
        this.prezime_zaposleni = prezime_zaposleni;
    }

    public String getAdresa_zaposleni() {
        return adresa_zaposleni;
    }

    public void setAdresa_zaposleni(String adresa_zaposleni) {
        this.adresa_zaposleni = adresa_zaposleni;
    }

    public String getTelefon_zaposleni() {
        return telefon_zaposleni;
    }

    public void setTelefon_zaposleni(String telefon_zaposleni) {
        this.telefon_zaposleni = telefon_zaposleni;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "id_zaposleni=" + id_zaposleni + ", ime_zaposleni=" + ime_zaposleni + ", prezime_zaposleni=" + prezime_zaposleni + ", adresa_zaposleni=" + adresa_zaposleni + ", telefon_zaposleni=" + telefon_zaposleni + ", zanimanje=" + zanimanje + '}';
    }
    
    
    
}
