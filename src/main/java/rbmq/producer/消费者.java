package rbmq.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class 消费者 {
    private static final String name = "f_log";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new com.rabbitmq.client.ConnectionFactory();
        factory.setHost("192.168.239.128");
        factory.setPort(50001);
        Connection c = factory.newConnection();// 链接
        Channel channel = c.createChannel();// 信道
        // channel.exchangeDeclare(name,
        // com.rabbitmq.client.BuiltinExchangeType.DIRECT);//设置交换器类型
        String queue = channel.queueDeclare().getQueue();// 随机队列
        String[] aaa = { "error" };

        for (int i = 0; i < aaa.length; i++) {
            String a = aaa[i];
            channel.queueBind(queue, name, a);// 队列绑定 fout的交换器无视路由键
        }
        System.out.println("wait");
        com.rabbitmq.client.Consumer ca = new com.rabbitmq.client.DefaultConsumer(channel) {

            @Override
            public void handleDelivery(String consumerTag, com.rabbitmq.client.Envelope envelope,
                    com.rabbitmq.client.AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println(new String(body, "utf-8") + ":" + envelope.getRoutingKey());
            };
        };

        channel.basicConsume(queue, true, ca);

    }
}
