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
import com.company.jmsdomaci.app.service.PecivoRepository;
import com.company.jmsdomaci.app.model.Pecivo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

@Service("pecivoRepository")
public class PecivoRepositoryImpl implements PecivoRepository {

    private final Map<String, Pecivo> peciva = new ConcurrentHashMap<String, Pecivo>();

    @Override
    public void putPecivo(Pecivo pecivo) {
        peciva.put(pecivo.getPecivoId(), pecivo);
    }

    @Override
    public Pecivo getPecivo(String pecivoId) {
        return peciva.get(pecivoId);
    }

    public Map<String, Pecivo> getAllPecivo() {
        return peciva;
    }
}
