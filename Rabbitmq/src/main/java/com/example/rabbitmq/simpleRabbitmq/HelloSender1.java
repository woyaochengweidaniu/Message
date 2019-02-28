package com.example.rabbitmq.simpleRabbitmq;


import com.example.rabbitmq.data.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender1 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendHello(Integer integer){
        String hello = "hello";
        System.out.println("发送者发送消息："+hello);
        rabbitTemplate.convertAndSend("hello2",integer);
    }

    public void sendUser(User user){
        rabbitTemplate.convertAndSend("hello2",user);
    }
}
