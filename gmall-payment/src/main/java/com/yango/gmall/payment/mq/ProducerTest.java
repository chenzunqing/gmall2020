package com.yango.gmall.payment.mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMessage;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;

/**
 * @author 陈尊清
 * @create 2020-04-22-18:30
 */
public class ProducerTest {

    public static void main(String[] args) throws JMSException {
        /*
         1.创建连接工厂
         2.创建连接
         3.打开连接
         4.创建session
         5.创建队列
         6.创建消息提供者
         7.创建消息对象
         8.发送消息
         9.关闭
         */
        //1.创建连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://192.168.58.135:61616");
        //2.创建连接
        Connection connection = activeMQConnectionFactory.createConnection();
        //3.打开连接
        connection.start();
        //4.创建session
        Session session = connection.createSession(true,Session.SESSION_TRANSACTED);
        //5.创建队列
        Queue queue = session.createQueue("yango-false");
        //6.创建消息提供者
        MessageProducer producer = session.createProducer(queue);
        //7.创建消息对象
        ActiveMQTextMessage activeMQTextMessage = new ActiveMQTextMessage();
        activeMQTextMessage.setText("陈尊清！你要好好努力！-true，有钱了养佳佳");
        //8.发送消息
        producer.send(activeMQTextMessage);

        session.commit();

        producer.close();
        session.close();
        connection.close();

    }
}
