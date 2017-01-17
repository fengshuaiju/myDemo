package com.feng.lamp;

public class Test {
	
	
	public void letTest(TestInterface testInterface){
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		
		test.letTest(new TestInterface() {
			
			@Override
			public int say(int a, int b) {
				return a+b;
			}
		});
		
		test.letTest((x,y) -> {return x+y;});
	}

}
