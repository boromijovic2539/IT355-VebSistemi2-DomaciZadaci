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

public class PekaraResponse implements Serializable {

    private String pecivoId;
    private int returnCode;
    private String comment;

    public String getPecivoId() {
        return pecivoId;
    }

    public void setPecivoId(String pecivoId) {
        this.pecivoId = pecivoId;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        PekaraResponse other = (PekaraResponse) obj;
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
        return "PekaraResponse [pecivoId=" + pecivoId + ",returnCode = " + returnCode + ", comment = " + comment + "]";
    }
}
