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
import com.company.jmsdomaci.app.model.PekaraResponse;
import com.company.jmsdomaci.app.model.Pecivo;
import java.util.Map;

public interface PecivoService {

    public void sendPecivo(Pecivo pecivo);

    public void updatePecivo(PekaraResponse response);

    public Map<String, Pecivo> getAllPecivo();
}
