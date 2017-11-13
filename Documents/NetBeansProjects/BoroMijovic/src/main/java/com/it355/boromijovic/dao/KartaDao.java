/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic.dao;

/**
 *
 * @author vesna.lazarevic
 */
public interface KartaDao {

    public void addKarta();

    public String addKartaReturn();

    public void addKartaThrowException() throws Exception;

    public void addKartaAround(String domacin, String gost);

}
