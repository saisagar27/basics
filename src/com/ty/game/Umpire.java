package com.ty.game;

public class Umpire {
	int guesserValue;
	int player1Value;
	int player2Value;
	int player3Value;
	
	void collectPlayerValue() {
		Guesser g=new Guesser();
		guesserValue=g.guessNum();
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		player1Value=p1.playerNum();
		player2Value=p2.playerNum();
		player3Value=p3.playerNum();
		
		if(guesserValue==player1Value) {
			System.out.println("Player 1 is the Winner!!!!");
		}
		else if(guesserValue==player2Value) {
			System.out.println("Player 2 is the Winner!!!!");
		}
	
		else if(guesserValue==player3Value) {
			System.out.println("Player 3 is the Winner!!!!");
		}
		else {
			System.out.println("Try Again..");
		}
		
		
	}
	

}
