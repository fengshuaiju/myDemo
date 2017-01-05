package com.feng.liu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelCopyTest {
	
	public void copy() throws Exception{
		
		String path = ExcelCopyTest.class.getClassLoader().getResource("").getPath() + "file/";
		System.out.println(path);
		
		File doc = new File(path,"短信通短信接口.doc");
		
		File newDoc = new File(path,"copy"+doc.getName());
		if(!newDoc.exists()){
			newDoc.createNewFile();
		}
		
		int hasread = 0;
		byte[] reads = new byte[1024];
		FileInputStream fin = null;
		FileOutputStream fou = null;
		try {
			fin = new FileInputStream(doc);
			fou = new FileOutputStream(newDoc);
			while((hasread = fin.read(reads)) > 0){
				fou.write(reads);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fin.close();
			fou.close();
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		new ExcelCopyTest().copy();
	}

}
