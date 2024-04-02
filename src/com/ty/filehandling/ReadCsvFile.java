package com.ty.filehandling;
import java.util.*;
import java.io.*;

public class ReadCsvFile {
	public static void main(String[] args) throws IOException {
		FileReader f =new FileReader("C:\\Users\\Sai sagar\\eclipse-workspace\\Basics\\src\\com\\ty\\filehandling\\config.csv");
		Scanner sc=new Scanner(f);
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
		
	}

}
