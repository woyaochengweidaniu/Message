package com.example.rabbitmq.directExchange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectExchangeTest {
    @Autowired
    private RabbitTemplate  rabbitTemplate;

    @Test
    public void test(){
        String kk = "wo shi dire";
        System.out.println("发送者发送："+kk);
        this.rabbitTemplate.convertAndSend("direExchange","direroutkey",kk);
    }
}
