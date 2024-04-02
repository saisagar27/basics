package com.ty.exception;

import java.io.FileOutputStream;
import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		try(Scanner sc=new Scanner(System.in)){
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException aa){
			aa.printStackTrace();
			System.out.println(aa);
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(a[2]);
		System.out.println(a[3]);

		
	}

}
