package com.ty.accessmodifier;

import static com.ty.statiic.nonstatic.Student.attendance;

import com.ty.statiic.nonstatic.*;

public class Modifiers extends Student {
	public static void main(String[] args) {
		attendance();
		
		login();
		
//		sign(); can be accesed within package
//		
//		salary(); can be accesed within class

		
	}

}
