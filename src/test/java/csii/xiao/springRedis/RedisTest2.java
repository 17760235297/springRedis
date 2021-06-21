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

import csii.xiao.springRedis.util.RedisUtil;

@SpringBootTest(classes =App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest2 {

	 @Autowired
	 private RedisUtil redisUtil;
	 
	 
	  @Test
	  public void testRedis() {
	    String key = "hello";
	    redisUtil.setRedisStringKey("hello1", "你好");
	 
	    String res = (String) redisUtil.getStringValue(key);
	    System.out.println(res);
	  }
	  @Test
	  public void testHashOps() {
	    String key = "xiaokey1";
	   
	    Map<String, Object> map = new HashMap<>();
	    map.put("age", "32");
	    map.put("sex", "man");
	   
	    // 一次性向hash中存放一个map
	    redisUtil.setRedisHashKey(key, map);
	    // 获取hash下的所有key和value
	    Map<String, Object> resultMap = redisUtil.getHashValue(key);
	    for (String hashKey : resultMap.keySet()) {
	      System.out.println(hashKey + ": " + resultMap.get(hashKey));
	    }
	  }
}
