package com.ty.filehandling;
import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("C:\\Users\\Sai sagar\\eclipse-workspace\\Basics\\src\\com\\ty\\filehandling\\config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fr);
		
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));
		System.out.println(pr.getProperty("name"));
		
		
	}

}
