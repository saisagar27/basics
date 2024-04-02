package com.ty.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		String path1="E:\\IO\\demo.txt";
		
		FileReader fr=new FileReader(path1);
		int i;
		
		while((i=fr.read())!=-1)  //fr.read() will return ascii value 
			System.out.print((char)i);
			fr.close();
		
	}

}
