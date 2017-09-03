/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.jmsdomaci.app.model;

/**
 *
 * @author vesna.lazarevic
 */
import java.io.Serializable;

public class Pecivo implements Serializable {

    private String pecivoId;
    private String naziv;
    private int kolicina;
    private PecivoStatus status;

    public String getPecivoId() {
        return pecivoId;
    }

    public void setPecivoId(String pecivoId) {
        this.pecivoId = pecivoId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public PecivoStatus getStatus() {
        return status;
    }

    public void setStatus(PecivoStatus status) {
        this.status = status;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pecivoId == null) ? 0
                : pecivoId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pecivo other = (Pecivo) obj;
        if (pecivoId == null) {
            if (other.pecivoId != null) {
                return false;
            }
        } else if (!pecivoId.equals(other.pecivoId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pecivo{" + "pecivoId=" + pecivoId + ", naziv=" + naziv + ", kolicina=" + kolicina + ", status=" + status + '}';
    }


}
