package com.type.customuncheckedexception;

public class CheckPercentage {
	
	double reqper=60;
	double maxvalue=100;
	
	void checkPercentage(double per) {
		if(per<reqper) {
			throw new PercentageEligibility("Not eligible");
		}
		else if(per>reqper && per<=maxvalue){
			System.out.println("Eligible");
	
		}
		else {
			throw new PercentageEligibility("Invalid Data");
		}
	}
	
	
	
	
	

}
