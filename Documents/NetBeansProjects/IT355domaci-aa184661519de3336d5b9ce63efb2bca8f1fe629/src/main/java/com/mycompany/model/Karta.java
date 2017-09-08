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
public class Karta implements Serializable {

    Integer id_karta;
    Integer id_utakmica;
    String vreme_utakmice;
    String gostujuci_tim;
    Double cena_karte;
    int broj_karata;
    String slika;

    public int getBroj_karata() {
        return broj_karata;
    }

    public void setBroj_karata(int broj_karata) {
        this.broj_karata = broj_karata;
    }

    public Integer getId_utakmica() {
        return id_utakmica;
    }

    public void setId_utakmica(Integer id_utakmica) {
        this.id_utakmica = id_utakmica;
    }

    public String getVreme_utakmice() {
        return vreme_utakmice;
    }

    public void setVreme_utakmice(String vreme_utakmice) {
        this.vreme_utakmice = vreme_utakmice;
    }

    public String getGostujuci_tim() {
        return gostujuci_tim;
    }

    public void setGostujuci_tim(String gostujuci_tim) {
        this.gostujuci_tim = gostujuci_tim;
    }

    public Integer getId_karta() {
        return id_karta;
    }

    public void setId_karta(Integer id_karta) {
        this.id_karta = id_karta;
    }

    public Double getCena_karte() {
        return cena_karte;
    }

    public void setCena_karte(Double cena_karte) {
        this.cena_karte = cena_karte;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    @Override
    public String toString() {
        return "Karta{" + "id_karta=" + id_karta + ", cena_karte=" + cena_karte + ", slika=" + slika + '}';
    }

}
