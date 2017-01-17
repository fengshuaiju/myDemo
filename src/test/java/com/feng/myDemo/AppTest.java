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
import com.feng.liu.SysoTest;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})  
public class AppTest extends TestCase {
	
	@Autowired
	private Example example;
	
	
	@Test
	public void letTest(){
		//example.say();
		
		
		String getenv2 = System.getenv("spring.profile.default");
		System.out.println(getenv2);
		
		Map<String, String> getenv = System.getenv();
		Set<Entry<String, String>> entrySets = getenv.entrySet();
		
		for (Entry<String, String> entrySet : entrySets) {
			String key = entrySet.getKey();
			String value = entrySet.getValue();
			
			System.out.println(key + "------" + value);
		}
		
	}
	
	
}
