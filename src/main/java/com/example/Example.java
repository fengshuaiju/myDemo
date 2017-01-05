package com.example;

import org.springframework.stereotype.Component;

@Component
public class Example {

	public Example(){
		System.out.println("Example 被初始化了！！！！！！！！！！");
	}
	
	public void say(){
		System.out.println("调用了 Example 的方法 say");
	}
	
}
