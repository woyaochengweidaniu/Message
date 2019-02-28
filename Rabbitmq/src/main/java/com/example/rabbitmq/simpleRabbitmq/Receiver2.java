package com.example.rabbitmq.simpleRabbitmq;

import com.example.rabbitmq.data.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * queues是监听哪个队列的名字
 */
@Component
@RabbitListener(queues = "hello2")
public class Receiver2 {

    /**
     * @RabbitHandler  处理器，监听到队列里有消息，处理的方法
     * @param object
     */
    @RabbitHandler
    public void poccess(Integer object){
        System.out.println("receive2："+ object);
    }
}
