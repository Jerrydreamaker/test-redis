import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestRedisZset {
    private static JedisPool pool=new JedisPool("192.168.1.149");
    public static void main(String[] args) {
        Jedis jedis=pool.getResource();
        System.out.println(jedis.zrank("test1","mysql1"));
        jedis.zadd("test1",1,"mysql");
    }
}
