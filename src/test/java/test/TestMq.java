package test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import org.junit.Test;


public class TestMq {

    private static String QUEUE_NAME = "test1";
    private static String SERVER_IP = "180.76.107.32";

    @Test
    public void test1() throws Exception {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置RabbitMQ相关信息
        //factory.setHost("12.1.92.200");
        factory.setHost(SERVER_IP);
        factory.setUsername("admin");
        factory.setPassword("admin");
        factory.setPort(5672);
        //创建一个新的连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //  声明一个队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "第" +System.currentTimeMillis()+ "条" + "Hello RabbitMQ";
        //发送消息到队列中
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        //System.out.println("Producer Send +'" + message + "'");
        //关闭通道和连接
        channel.close();
        connection.close();
    }


    @Test
    public void test2() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(SERVER_IP);
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, false, consumer);

        while (true) {
            System.out.println("==========================");
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println("Received '" + message + "'");
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
        }
    }

}
