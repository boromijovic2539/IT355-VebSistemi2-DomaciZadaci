/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.entity;

/**
 *
 * @author vesna.lazarevic
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "karta")
public class Karta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_karta")
    private Integer id_karta;

    @ManyToOne
    @JoinColumn(name = "id_utakmica", referencedColumnName = "id_utakmica")
    private Utakmica utakmica;

    @Column(name = "cena_karte")
    private String cena_karte;

    public Karta() {
    }

    public Integer getId_karta() {
        return id_karta;
    }

    public void setId_karta(Integer id_karta) {
        this.id_karta = id_karta;
    }

    public Utakmica getUtakmica() {
        return utakmica;
    }

    public void setUtakmica(Utakmica utakmica) {
        this.utakmica = utakmica;
    }

    public String getCena_karte() {
        return cena_karte;
    }

    public void setCena_karte(String cena_karte) {
        this.cena_karte = cena_karte;
    }

    @Override
    public String toString() {
        return "Karta{" + "id_karta=" + id_karta + ", utakmica=" + utakmica + ", cena_karte=" + cena_karte + '}';
    }

}
