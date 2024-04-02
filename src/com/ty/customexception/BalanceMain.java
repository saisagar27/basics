package com.ty.customexception;

public class BalanceMain {
	public static void main(String[] args) throws InsufficientBalance {
		Withdraw w=new Withdraw();
		w.withdraw(10);
		
	}

}
