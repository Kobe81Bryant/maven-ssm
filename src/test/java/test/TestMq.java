package test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;


public class TestMq {

    @Test
    public void test1() throws Exception {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置RabbitMQ相关信息
        //factory.setHost("12.1.92.200");
        factory.setHost("127.0.0.1");
        factory.setUsername("test");
        factory.setPassword("test");
        factory.setPort(5672);
        //创建一个新的连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //  声明一个队列
        channel.queueDeclare("test1", false, false, false, null);
        String message = "第"  + "条" + "Hello RabbitMQ";
        //发送消息到队列中
        channel.basicPublish("", "test1", null, message.getBytes("UTF-8"));
        //System.out.println("Producer Send +'" + message + "'");
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
