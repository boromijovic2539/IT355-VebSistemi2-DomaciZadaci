/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author vesna.lazarevic
 */
public class Soba {

    private Integer brojKreveta;
    private Integer velicina;
    private boolean klima;
    private boolean kupatilo;
    private boolean tv;
    Integer cenaPoDanu;

    public Soba() {
    }

    public Soba(Integer brojKreveta, Integer velicina, boolean klima, boolean kupatilo, boolean tv, Integer cenaPoDanu) {
        this.brojKreveta = brojKreveta;
        this.velicina = velicina;
        this.klima = klima;
        this.kupatilo = kupatilo;
        this.tv = tv;
        this.cenaPoDanu = cenaPoDanu;
    }

    public Integer getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(Integer brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public Integer getVelicina() {
        return velicina;
    }

    public void setVelicina(Integer velicina) {
        this.velicina = velicina;
    }

    public boolean getKlima() {
        return klima;
    }

    public void setKlima(boolean klima) {
        this.klima = klima;
    }

    public boolean getKupatilo() {
        return kupatilo;
    }

    public void setKupatilo(boolean kupatilo) {
        this.kupatilo = kupatilo;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public Integer getCenaPoDanu() {
        return cenaPoDanu;
    }

    public void setCenaPoDanu(Integer cenaPoDanu) {
        this.cenaPoDanu = cenaPoDanu;
    }

    
}