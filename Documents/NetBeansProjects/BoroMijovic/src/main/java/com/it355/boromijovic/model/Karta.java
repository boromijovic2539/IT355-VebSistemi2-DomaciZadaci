/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.model;

/**
 *
 * @author vesna.lazarevic
 */
public class Karta {

    int id;
    String domacin;
    String gost;
    String vreme_utakmice;
    String cena_karte;
    String sektor;
    String broj_sedista;

    public Karta() {
    }

    public Karta(int id, String domacin, String gost, String vremeUtakmice, String cenaKarte, String sektor, String brojSedista) {
        this.id = id;
        this.domacin = domacin;
        this.gost = gost;
        this.vreme_utakmice = vremeUtakmice;
        this.cena_karte = cenaKarte;
        this.sektor = sektor;
        this.broj_sedista = brojSedista;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomacin() {
        return domacin;
    }

    public void setDomacin(String domacin) {
        this.domacin = domacin;
    }

    public String getGost() {
        return gost;
    }

    public void setGost(String gost) {
        this.gost = gost;
    }

    public String getVreme_utakmice() {
        return vreme_utakmice;
    }

    public void setVreme_utakmice(String vremeUtakmice) {
        this.vreme_utakmice = vremeUtakmice;
    }

    public String getCena_karte() {
        return cena_karte;
    }

    public void setCena_karte(String cena_karte) {
        this.cena_karte = cena_karte;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getBroj_sedista() {
        return broj_sedista;
    }

    public void setBroj_sedista(String broj_sedista) {
        this.broj_sedista = broj_sedista;
    }

    @Override
    public String toString() {
        return "Karta{" + "id=" + id + ", domacin=" + domacin + ", gost=" + gost + ", vremeUtakmice=" + vreme_utakmice + ", cenaKarte=" + cena_karte + ", sektor=" + sektor + ", brojSedista=" + broj_sedista + '}';
    }

}
