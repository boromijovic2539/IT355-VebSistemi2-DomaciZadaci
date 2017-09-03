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

import com.company.jmsdomaci.app.messaging.MessageSender;
import com.company.jmsdomaci.app.model.Pecivo;
import com.company.jmsdomaci.app.model.PecivoStatus;
import com.company.jmsdomaci.app.model.PekaraResponse;
import com.company.jmsdomaci.app.util.BasicUtil;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pecivoService")
public class PecivoServiceImpl implements PecivoService {

    static final Logger LOG
            = LoggerFactory.getLogger(PecivoServiceImpl.class);
    @Autowired
    MessageSender messageSender;
    @Autowired
    PecivoRepository pecivoRepository;

    @Override
    public void sendPecivo(Pecivo pecivo) {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        pecivo.setPecivoId(BasicUtil.getUniqueId());
        pecivo.setStatus(PecivoStatus.CREATED);
        pecivoRepository.putPecivo(pecivo);
        LOG.info("Application : sending pecivo request {}",
                pecivo);
        messageSender.sendMessage(pecivo);
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void updatePecivo(PekaraResponse response) {
        Pecivo pecivo
                = pecivoRepository.getPecivo(response.getPecivoId());
        if (response.getReturnCode() == 200) {
            pecivo.setStatus(PecivoStatus.CONFIRMED);
        } else if (response.getReturnCode() == 300) {
            pecivo.setStatus(PecivoStatus.FAILED);
        } else {
            pecivo.setStatus(PecivoStatus.PENDING);
        }
        pecivoRepository.putPecivo(pecivo);
    }

    public Map<String, Pecivo> getAllPecivo() {
        return pecivoRepository.getAllPecivo();
    }

}
