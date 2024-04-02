package com.ty.customexception;

public class Withdraw {
	double balance=10000;
	void withdraw(double amount) throws InsufficientBalance {
		if(amount<balance) {
			System.out.println("Withdrawn successfully!!");
			balance-=amount;
			System.out.println("New Balance is = "+balance);
		}
		else if(amount>balance){
			throw new InsufficientBalance("Amount is greater than the balance");
		}
		else {
			throw new InsufficientBalance("Less amount is not allowed!!");
		}
		
	}

}
