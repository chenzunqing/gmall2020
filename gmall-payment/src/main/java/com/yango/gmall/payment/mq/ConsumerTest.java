package com.yango.gmall.payment.mq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author 陈尊清
 * @create 2020-04-22-18:47
 */
public class ConsumerTest {
    public static void main(String[] args) throws JMSException {
        /*
            1.  创建连接工厂
            2.  创建连接
            3.  打开连接
            4.  创建session
            5.  创建队列
            6.  创建消息消费者
            7.  消费消息
         */
        //1.创建连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "tcp://192.168.58.135:61616");
        //2.创建连接
        Connection connection = activeMQConnectionFactory.createConnection();
        //3.打开连接
        connection.start();
        //4.创建session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5.创建队列
        Queue queue = session.createQueue("yango-false");
        //6.创建消息消费者
        MessageConsumer consumer = session.createConsumer(queue);
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if(message instanceof TextMessage){
                    try {
                        String text = ((TextMessage) message).getText();
                        System.out.println("获得的消息是："+text);
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
