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
public class Korisnik implements Serializable {

    Integer id_korisnik;
    String ime_korisnik;
    String prezime_korisnik;
    String email_korisnik;
    String adresa_korisnik;
    String telefon_korisnik;
    String grad_korisnik;
    String drzava_korisnik;
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId_korisnik() {
        return id_korisnik;
    }

    public void setId_korisnik(Integer id_korisnik) {
        this.id_korisnik = id_korisnik;
    }

    public String getIme_korisnik() {
        return ime_korisnik;
    }

    public void setIme_korisnik(String ime_korisnik) {
        this.ime_korisnik = ime_korisnik;
    }

    public String getPrezime_korisnik() {
        return prezime_korisnik;
    }

    public void setPrezime_korisnik(String prezime_korisnik) {
        this.prezime_korisnik = prezime_korisnik;
    }

    public String getEmail_korisnik() {
        return email_korisnik;
    }

    public void setEmail_korisnik(String email_korisnik) {
        this.email_korisnik = email_korisnik;
    }

    public String getAdresa_korisnik() {
        return adresa_korisnik;
    }

    public void setAdresa_korisnik(String adresa_korisnik) {
        this.adresa_korisnik = adresa_korisnik;
    }

    public String getTelefon_korisnik() {
        return telefon_korisnik;
    }

    public void setTelefon_korisnik(String telefon_korisnik) {
        this.telefon_korisnik = telefon_korisnik;
    }

    public String getGrad_korisnik() {
        return grad_korisnik;
    }

    public void setGrad_korisnik(String grad_korisnik) {
        this.grad_korisnik = grad_korisnik;
    }

    public String getDrzava_korisnik() {
        return drzava_korisnik;
    }

    public void setDrzava_korisnik(String drzava_korisnik) {
        this.drzava_korisnik = drzava_korisnik;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "id_korisnik=" + id_korisnik + ", ime_korisnik=" + ime_korisnik + ", prezime_korisnik=" + prezime_korisnik + ", email_korisnik=" + email_korisnik + ", adresa_korisnik=" + adresa_korisnik + ", telefon_korisnik=" + telefon_korisnik + ", grad_korisnik=" + grad_korisnik + ", drzava_korisnik=" + drzava_korisnik + '}';
    }

}
