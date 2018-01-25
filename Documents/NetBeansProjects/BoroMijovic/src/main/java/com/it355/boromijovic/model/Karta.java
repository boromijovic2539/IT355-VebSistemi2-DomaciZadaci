/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.model;

import java.io.Serializable;

/**
 *
 * @author vesna.lazarevic
 */
@SuppressWarnings("serial")
public class Karta implements Serializable {

    int id_karta;
    String domacin;
    String gost;
    String vreme_utakmice;
    String cena_karte;
    String sektor;
    String broj_sedista;
    int kolicina;

    public Karta() {
    }

    public Karta(int id_karta, String domacin, String gost, String vreme_utakmice, String cena_karte, String sektor, String broj_sedista, int kolicina) {
        this.id_karta = id_karta;
        this.domacin = domacin;
        this.gost = gost;
        this.vreme_utakmice = vreme_utakmice;
        this.cena_karte = cena_karte;
        this.sektor = sektor;
        this.broj_sedista = broj_sedista;
        this.kolicina = kolicina;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public int getId_karta() {
        return id_karta;
    }

    public void setId_karta(int id_karta) {
        this.id_karta = id_karta;
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
        return "Karta{" + "id_karta=" + id_karta + ", domacin=" + domacin + ", gost=" + gost + ", vreme_utakmice=" + vreme_utakmice + ", cena_karte=" + cena_karte + ", sektor=" + sektor + ", broj_sedista=" + broj_sedista + ", kolicina=" + kolicina + '}';
    }

}
