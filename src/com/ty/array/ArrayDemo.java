package com.ty.array;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" element");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The elements in the array are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Sum of Array
		System.out.println("The sum of the array is =");
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		//Largest in array
		int largest=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("The largest num is "+largest);
		
		//Sorting
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println("The elements in the array are:");
			for(int ii=0;ii<arr.length;ii++) {
				System.out.print(arr[ii]+" ");

			
		}
	}

}
