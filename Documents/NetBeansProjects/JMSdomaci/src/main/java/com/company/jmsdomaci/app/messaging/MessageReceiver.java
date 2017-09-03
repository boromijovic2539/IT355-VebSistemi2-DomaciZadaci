/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.jmsdomaci.app.messaging;

/**
 *
 * @author vesna.lazarevic
 */
import com.company.jmsdomaci.app.model.PekaraResponse;
import com.company.jmsdomaci.app.service.PecivoService;
import javax.jms.JMSException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);
    private static final String ORDER_RESPONSE_QUEUE  = "order-response-queue";
    @Autowired
    PecivoService pecivoService;

    @JmsListener(destination = ORDER_RESPONSE_QUEUE)
    public void receiveMessage(final Message<PekaraResponse> message) throws JMSException {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        MessageHeaders headers = message.getHeaders();
        LOG.info("Application : headers received : {}", headers);
        PekaraResponse response = message.getPayload();
        LOG.info("Application : response received : {}", response);
        pecivoService.updatePecivo(response);
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
