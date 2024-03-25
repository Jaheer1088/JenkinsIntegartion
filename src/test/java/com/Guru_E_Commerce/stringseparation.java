package com.Guru_E_Commerce;

public class stringseparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$5";
		
	String n =	s.replaceAll("\\$", "");
	
double d=	Double.parseDouble(n);
	System.out.println(d);

	}

}
