package moke;

import java.util.ArrayList;

import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import redis.clients.jedis.Jedis;

public class Redis {

    public static void main(String[] args) {
        String key = "ACTIVITY_NEW_MONEY_513_dev";
        Jedis jedis = new Jedis("112.124.116.31", 6378);
        jedis.auth("Dy20520999");
        String s=   jedis.get(key);//向key-->name中放入了value-->xinxin  
        System.out.println(s);
        GenericJackson2JsonRedisSerializer  ser=new GenericJackson2JsonRedisSerializer();
        
        ArrayList list=    ser.deserialize(s.getBytes(), java.util.ArrayList.class);
        System.out.println(list);
    }
}
