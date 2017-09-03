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
public enum PecivoStatus {

    CREATED("Created"),
    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    FAILED("Failed");
    private String status;

    private PecivoStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.status;
    }

    public String getName() {
        return this.name();
    }
}
