package com.ty.game;

import java.util.Scanner;

public class Player {
	int pnum;
	
	int playerNum() {
		System.out.println("Player , Guess The number!!!!!1");
		Scanner sc=new Scanner(System.in);
		int pnum=sc.nextInt();
		return pnum;
		
	}

}
