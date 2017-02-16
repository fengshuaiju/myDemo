package com.feng.myDemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.Example;
import com.example.RedisClock;
import com.feng.liu.SysoTest;

import junit.framework.TestCase;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})  
public class AppTest extends TestCase {
	
	@Autowired
	private Example example;
	
	@Autowired
	private JedisPool jedisPool;
	
	@Test
	public void letTest(){
		//example.say();
		
//		String getenv2 = System.getenv("spring.profile.default");
//		System.out.println(getenv2);
//		
//		Map<String, String> getenv = System.getenv();
//		Set<Entry<String, String>> entrySets = getenv.entrySet();
//		
//		for (Entry<String, String> entrySet : entrySets) {
//			String key = entrySet.getKey();
//			String value = entrySet.getValue();
//			
//			System.out.println(key + "------" + value);
//		}
		
		
		Jedis resource = jedisPool.getResource();
		Jedis resource1 = jedisPool.getResource();
		
		resource.del("name");
		resource1.del("name");
		
		Thread thread1 = new Thread(new RedisClock(resource),"第一一个");
		Thread thread2 = new Thread(new RedisClock(resource),"第二二个");
		
		
		thread1.start();
		thread2.start();
		
		
		
		try {
			Thread.sleep(15000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
