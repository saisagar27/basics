package com.ty.pgms;

public class Panagram {

	public static void main(String[] args) {
		String s="qwertyuioplkjhgfdsazxcvbnm";
		char[] ch=s.toCharArray();
		
		boolean[] b=new boolean[26];
		int index=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' || ch[i]<='z') {
				index=ch[i]-'a';
				b[index]=true;
			}
			else if(ch[i]>='A' || ch[i]<='Z'){
				index=ch[i]-'A';
				b[index]=true;
				
			}
					
				}
		boolean flag=false;
		for(int i=0;i<b.length;i++) {
			if(b[i]==true) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("It is a Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}

	}

}
