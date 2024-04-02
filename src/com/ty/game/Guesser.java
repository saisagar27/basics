package com.ty.game;

import java.util.Scanner;

public class Guesser {
	int gnum;
	
	int guessNum()
	{
		System.out.println("Guesser, Kindly guess the number!!!!");
		Scanner sc=new Scanner(System.in);
		int gnum=sc.nextInt();
		return gnum;
	}

}
