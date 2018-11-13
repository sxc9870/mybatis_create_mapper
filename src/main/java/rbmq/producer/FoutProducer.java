package rbmq.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class FoutProducer {
    private static final String name="f_log";
    
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory=new com.rabbitmq.client.ConnectionFactory();
        factory.setHost("192.168.239.128");
        factory.setPort(50001);
        Connection c=factory.newConnection();//链接
        Channel  channel=c.createChannel();//信道
      //channel.exchangeDeclare(name, com.rabbitmq.client.BuiltinExchangeType.FANOUT);//设置交换器类型
        
        
        //消息-->>交换器--->>队列-->消费者
        String []aaa={"error","info","warm"};
        for (int i = 0; i < aaa.length; i++) {
           String a= aaa[i];
           String message="消息:"+a;
           channel.basicPublish(name, a, null, message.getBytes());//交换器,路由建,费否持久化;2
        }
        channel.close();
        c.close();
        
        
    }
    
}
