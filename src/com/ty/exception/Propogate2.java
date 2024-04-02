package com.ty.exception;

public class Propogate2 {
	static void add() {
		System.out.println(5/0);
	}
	void m1() {
		add();
	}

}
