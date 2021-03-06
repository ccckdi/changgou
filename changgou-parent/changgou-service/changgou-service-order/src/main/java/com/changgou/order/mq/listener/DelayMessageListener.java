package com.changgou.order.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chx
 * @version 1.0
 * @description: 过期消息监听
 * @date 2020/11/30 0030 20:21
 */
@Component
@RabbitListener(queues = "orderListenerQueue")
public class DelayMessageListener {

    /***
     * 延时队列监听
     * @param message
     */
    @RabbitHandler
    public void getDelayMessage(String message){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("监听消息的时间:"+(simpleDateFormat.format(new Date())));

        System.out.println("监听到的消息:"+message);
    }
}