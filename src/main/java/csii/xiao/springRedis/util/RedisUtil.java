package csii.xiao.springRedis.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

	 @Autowired
	 private RedisTemplate redisTemplate;
	 
	 public void setRedisStringKey(String key,String value)
	 {
		    redisTemplate.opsForValue().set(key, value);
	 }
	 public String getStringValue(String key)
	 {
		 return (String) redisTemplate.opsForValue().get(key);
	 }
	 public void setRedisHashKey(String key,Map map)
	 {
		    redisTemplate.opsForHash().putAll(key, map);
	 }
	 public Map getHashValue(String key)
	 {
		 return redisTemplate.opsForHash().entries(key);
	 }
	 
}
