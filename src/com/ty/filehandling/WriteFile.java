package com.ty.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String path1="E:\\IO\\demo.txt";
		
		FileWriter fw=new FileWriter(path1);
		fw.write("Hi this is Demo file ");
		fw.write("Byee");
		fw.close();
		
	}

}
