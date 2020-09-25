package com.jaden.rabbitmqconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMessageListener {
    private static final Logger log = LoggerFactory.getLogger(RabbitMessageListener.class);

    @RabbitListener(queues = RabbitConfiguration.queueName)
    public void receiveMessage(final RabbitMessage message) {
        log.info(message.toString());
    }
}
