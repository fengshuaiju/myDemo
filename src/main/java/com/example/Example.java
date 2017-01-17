package com.example;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	public Example(){
		System.out.println("Example 被初始化了！！！！！！！！！！");
	}
	
	@GetMapping("/test")
	public void say(){
		System.out.println("调用了 Example 的方法 say");
		
		
		String getenv2 = System.getenv("spring.profiles.default");
		System.out.println(getenv2);
		
		
		String getenv3 = System.getenv("spring.profiles.active");
		System.out.println(getenv3);
		
//		Map<String, String> getenv = System.getenv();
//		Set<Entry<String, String>> entrySets = getenv.entrySet();
//		
//		for (Entry<String, String> entrySet : entrySets) {
//			String key = entrySet.getKey();
//			String value = entrySet.getValue();
//			
//			System.out.println(key + "------" + value);
//		}
		
		
	}
	
}
