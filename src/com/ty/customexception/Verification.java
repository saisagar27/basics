package com.ty.customexception;

public class Verification {
	int agereq=18;
	void verify(int age) throws EligibleForLicense  {
		if(age<agereq) {
			throw new EligibleForLicense("Not eligible for license");
		}
		else if(age>60){
			throw new EligibleForLicense("Over age not allowed");
		}
		else {
			System.out.println("Eligible for License");
		}
	}

}
