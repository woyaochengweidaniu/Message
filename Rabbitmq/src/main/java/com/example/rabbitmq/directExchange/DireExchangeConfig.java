package com.example.rabbitmq.directExchange;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DireExchangeConfig {

    @Bean
    public Queue Queue(){
        return new Queue("dire");
    }

    @Bean
    DirectExchange directExchange(){
        return new DirectExchange("direExchange");
    }

    @Bean
    Binding bindingExchange(Queue queueMessage,DirectExchange directExchange){
        return BindingBuilder.bind(queueMessage).to(directExchange).with("direroutkey");
    }

}
