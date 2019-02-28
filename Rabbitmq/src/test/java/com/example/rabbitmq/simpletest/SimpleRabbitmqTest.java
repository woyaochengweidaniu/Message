package com.example.rabbitmq.simpletest;

import com.example.rabbitmq.data.User;
import com.example.rabbitmq.simpleRabbitmq.HelloSender1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRabbitmqTest {

    @Autowired
    private HelloSender1 helloSender;

    /**
     * 经过测试，不管是一对多还是多对多，消息都是均分的，一个消息只能被一个消费者消费
     * @throws Exception
     */
    @Test
     public void test() throws Exception{
        for (int i = 0;i <20;i++){
            helloSender.sendHello(i);
            //helloSender.sendHello(i);
        }
    }


}
