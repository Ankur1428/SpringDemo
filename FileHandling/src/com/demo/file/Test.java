package com.demo.file;

import java.io.File;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/******* file creation ********/
		File file =new File("abc.txt");//no physical file creation
		System.out.println(file.exists());
		try {
			file.createNewFile();//physical file creation
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		
		
		
		/*********** to represent directory **********/
		
		File f = new File("def");;
		f.mkdirs();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		File f3 = new File("abc.txt");
		System.out.println(f3.createNewFile()+ "print");
		System.out.println(f.list());
		
		/************ contructors***/
		
		File f1 = new File("def","bef.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.length()+ "count");
		
		File f2 = new File(f1,"dfabef.txt");
		f1.createNewFile();
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		
		
	
	}

	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
