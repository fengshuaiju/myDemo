package com.feng.liu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 读取classpath下的文件，并写入到新文件中
 * @author Administrator
 *
 */
public class FieldReadTest {

	// 读取classpath下的文件
	public void readFile() throws Exception {

		String path = FieldReadTest.class.getClassLoader().getResource("").getPath() + "file/";

		File filein = new File(path, "news");
		
		File fileout = new File(path, "lala");
		if(!fileout.exists()){
			boolean createNewFile = fileout.createNewFile();
			if(createNewFile){
				System.out.println("创建新文件");
			}
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		if (filein.exists()) {

			try {
				fr = new FileReader(filein);

				br = new BufferedReader(fr);

				fw = new FileWriter(fileout);
				bw = new BufferedWriter(fw);
				
				String readLine = null;
				while ((readLine = br.readLine()) != null) {

					readLine = br.readLine();
					System.out.println(readLine);
					
					fw.write(readLine);
					fw.append("\n");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				if(fr!=null){
					fr.close();
				}
				
				if(br!= null){
					br.close();
				}
				
				if(fw!=null){
					fw.close();
				}
				
				if(bw!= null){
					bw.close();
				}
			}

		}

	}

	public static void main(String[] args) throws Exception {
		new FieldReadTest().readFile();
	}
}
