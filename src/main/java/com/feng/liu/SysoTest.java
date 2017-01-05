package com.feng.liu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Syso的输入输出改变
 * @author Administrator
 *
 */
public class SysoTest {

	public static String path = "";
	public static final String name = "";
	
	public void test() throws Exception{
		
		path = SysoTest.class.getClassLoader().getResource("").getPath() + "file/";
		
		File syso = new File(path, "syso");
		
		if(!syso.exists()){
			boolean createNewFile = syso.createNewFile();
			if(createNewFile){
				System.out.println("创建新文件！！！");
			}
			
		}
		
		FileOutputStream fop = new FileOutputStream(syso);
		
		PrintStream ps = new PrintStream(fop);
		
		System.setOut(ps);
		
		try {
			int a = 1/0;
		} catch (Exception e) {
			e.printStackTrace(ps);
		}finally {
			ps.close();
			fop.close();
		}
		
	}
	
	
	public static void main(String[] args) throws Exception{
		new SysoTest().test();
		System.out.println("woshi坏蛋！！！！！！！！！");
	}
	
}
