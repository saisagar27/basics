package com.ty.customexception;

public class LicenseMain {
	public static void main(String[] args) throws EligibleForLicense  {
		Verification v=new Verification();
		v.verify(85);
	}
		

}
