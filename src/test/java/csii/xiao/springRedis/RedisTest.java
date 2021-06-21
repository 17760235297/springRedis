package csii.xiao.springRedis;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes =App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {

	 @Autowired
	 private RedisTemplate redisTemplate;
	 
	 
	  @Test
	  public void testRedis() {
	    String key = "hello";
	    redisTemplate.opsForValue().set("hello", "你好");
	 
	    String res = (String) redisTemplate.opsForValue().get(key);
	    System.out.println(res);
	  }
	  @Test
	  public void testHashOps() {
	    String key = "xiaokey";
	    // 单次往hash中存放一个数据
	    redisTemplate.opsForHash().put(key, "name", "xp");
	   
	    Map<String, Object> map = new HashMap<>();
	    map.put("age", "32");
	    map.put("sex", "man");
	   
	    // 一次性向hash中存放一个map
	    redisTemplate.opsForHash().putAll(key, map);
	    redisTemplate.expire(key, 600, TimeUnit.SECONDS);
	    // 获取hash下的所有key和value
	    Map<String, Object> resultMap = redisTemplate.opsForHash().entries(key);
	    for (String hashKey : resultMap.keySet()) {
	      System.out.println(hashKey + ": " + resultMap.get(hashKey));
	    }
	  }
}
