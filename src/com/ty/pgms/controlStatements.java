package com.ty.pgms;

public class controlStatements {
	public static void main(String[] args) {
		boolean isLogged=true;
		boolean isRegister=true;
		boolean isPaid=true;
		
		if(isLogged && isRegister && isPaid)
		{
			System.out.println("Can Acces Everything");
		}
		else if(isLogged && isRegister && !isPaid)
		{
			System.out.println("Can view the page");
		}
		else
		{
			System.out.println("Please reigster and login");
		}
		
		
		int z=10;
		switch (z) {
		case 1:
			System.out.println("1 is selected");
			break;
		case 2:
			System.out.println("2 is selected");
			break;
		case 3:
			System.out.println("1 is selected");
			break;

		default: System.out.println("Default is selected");
			break;
		}
		
	}

}
