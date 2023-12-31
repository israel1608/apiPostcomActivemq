package com.bridgingcode.springbootactivemqdemo.publisher.controller;

import com.bridgingcode.springbootactivemqdemo.model.SystemMessage;
import org.apache.activemq.ActiveMQConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@RestController
public class PublishController {
     
    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/veiculo")
    public ResponseEntity<String> publishMessage(@RequestBody SystemMessage systemMessage) {
      
        try {
            jmsTemplate.convertAndSend("VEICULO", systemMessage);

            return new ResponseEntity<>("Sent: "+systemMessage, HttpStatus.OK);
            

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
