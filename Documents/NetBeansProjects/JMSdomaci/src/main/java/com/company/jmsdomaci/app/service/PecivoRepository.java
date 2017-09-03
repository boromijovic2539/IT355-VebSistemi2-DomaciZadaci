/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.jmsdomaci.app.service;

/**
 *
 * @author vesna.lazarevic
 */
import com.company.jmsdomaci.app.model.Pecivo;
import java.util.Map;

public interface PecivoRepository {

    public void putPecivo(Pecivo pecivo);

    public Pecivo getPecivo(String pecivoId);

    public Map<String, Pecivo> getAllPecivo();
}
