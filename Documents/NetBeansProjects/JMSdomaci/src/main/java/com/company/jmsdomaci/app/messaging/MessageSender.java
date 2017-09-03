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
import com.company.jmsdomaci.app.model.Pecivo;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final Pecivo pecivo) {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws
                    JMSException {
                ObjectMessage objectMessage
                        = session.createObjectMessage(pecivo);
                return objectMessage;
            }
        });
    }
}
