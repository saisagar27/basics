package com.ty.statiic.nonstatic;

public class Student {
	
	int id;
	String name;
	int marks;
	static String school;
	
	static {
		System.out.println("Inside Static Block");
		school="st.josephs";
	}
        public static void attendance() {
		System.out.println("Everyone is present");
	}
        protected static void login() {
        	System.out.println("Everyone is logged in");
        }
       static void sign() {
        	System.out.println("Everyone is signned out");
        }
        private static void salary() {
        	System.out.println("Everyone is paid");
        }
        
//        public static void main(String[] args) {
//        	salary();
//			
//		}

}
