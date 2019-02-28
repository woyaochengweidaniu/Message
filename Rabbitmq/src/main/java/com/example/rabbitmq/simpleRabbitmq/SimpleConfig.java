package com.example.rabbitmq.simpleRabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 简单使用rabbitmq
 * 一对一，一个发送者对应一个消费者
 */

@Configuration
public class SimpleConfig {

    @Bean
    public Queue queue(){
        //参数是队列的名字
        return new Queue("hello2");
    }




}
