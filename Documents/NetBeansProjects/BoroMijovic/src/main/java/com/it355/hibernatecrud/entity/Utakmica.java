/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vesna.lazarevic
 */
@Entity
@Table(name = "utakmica")
public class Utakmica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utakmica")
    private Integer id_utakmica;

    @ManyToOne
    @JoinColumn(name = "id_klub", referencedColumnName = "id_klub")
    private Klub klub;

    @Column(name = "vreme_utakmice")
    private String vreme_utakmice;

    @Column(name = "gostujuci_tim")
    private String gostujuci_tim;

    public Integer getId_utakmica() {
        return id_utakmica;
    }

    public void setId_utakmica(Integer id_utakmica) {
        this.id_utakmica = id_utakmica;
    }

    public Klub getKlub() {
        return klub;
    }

    public void setKlub(Klub klub) {
        this.klub = klub;
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

    @Override
    public String toString() {
        return "Utakmica{" + "id_utakmica=" + id_utakmica + ", klub=" + klub + ", vreme_utakmice=" + vreme_utakmice + ", gostujuci_tim=" + gostujuci_tim + '}';
    }

    

}
