package com.example.rabbitmq.directExchange;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"dire"})
public class DireExchangeReceiver {

    @RabbitHandler
    private void process(String object){
        System.out.println("接收者接收:"+object);
    }
}
