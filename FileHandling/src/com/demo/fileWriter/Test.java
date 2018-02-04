package com.demo.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//FileWriter fw = new FileWriter("abc.txt");
		FileWriter fw  =  new FileWriter("abc.txt", true);
		fw.write('a');
		fw.write("ankkur\nasdsda");
		fw.write('\n');
		char ch[] = {'a','b','d','s'};
		fw.write(ch);
		fw.flush();
		fw.close();
	} 

}
