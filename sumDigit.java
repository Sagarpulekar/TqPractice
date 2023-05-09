package com.oops;

public class sumDigit {

	public static void main(String[] args) {
		String s = "hello1234";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(+sum);
	}

}
