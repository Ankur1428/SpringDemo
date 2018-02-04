package com.demo.BufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("wx.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("abc");
		bw.newLine();
		char[] ch ={'a','b','f','g'};
		bw.write(ch);
		bw.newLine();
		bw.write(100);
		bw.flush();
		bw.close();
		
		
		
	}

}
