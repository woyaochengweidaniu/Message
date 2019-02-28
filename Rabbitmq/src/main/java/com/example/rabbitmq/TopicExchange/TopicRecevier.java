package com.example.rabbitmq.TopicExchange;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"topic.message","topic.messages"})
public class TopicRecevier {

    @RabbitHandler
    private void process(String object){
        System.out.println("接收者接收："+ object);
    }
}
