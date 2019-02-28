package com.example.rabbitmq.TopicExchange;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文章来源：http://www.ityouknow.com/springboot/2016/11/30/spring-boot-rabbitMQ.html
 *
 * topic 是RabbitMQ中最灵活的一种方式，可以根据路由键routing_key自由的绑定不同的队列
 *
 * Topic Exchange 转发消息主要是根据通配符。 在这种交换机下，队列和交换机的绑定会定义一种路由模式，那么，通配符就要在这种路由模式和路由键之间匹配后交换机才能转发消息。
 *
 * 在这种交换机模式下：
 *
 * 路由键必须是一串字符，用句号（.） 隔开，比如说 agreements.us，或者 agreements.eu.stockholm 等。
 * 路由模式必须包含一个 星号（*），主要用于匹配路由键指定位置的一个单词，比如说，一个路由模式是这样子：
 * agreements..b.*，那么就只能匹配路由键是这样子的：第一个单词是 agreements，第四个单词是 b。
 * 井号（#）就表示相当于一个或者多个单词，例如一个匹配模式是agreements.eu.berlin.#，那么，以agreements.eu.berlin开头的路由键都是可以的。
 */

@Configuration
public class TopicRabbitConfig {

    final static String message = "topic.message";
    final static String messages = "topic.messages";

    /**
     * 声明一个队列 名字叫 topic.message
     * @return
     */
    @Bean
    public Queue queueMessage() {
        return new Queue(TopicRabbitConfig.message);
    }

    /**
     * 声明一个队列  名字叫 topic.messages
     * @return
     */
    @Bean
    public Queue queueMessages() {
        return new Queue(TopicRabbitConfig.messages);
    }

    /**
     * 声明一个交换机  名字叫exchang
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    /**
     * 将队列  queueMessage 和交换机进行绑定   路由健是topic.message
     * @param queueMessage
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    /**
     * 将队列  queueMessages 和交换机进行绑定   路由健是topic.#   那么到时候匹配队列的时候只要前面是topic都能匹配到
     * @param queueMessages
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
