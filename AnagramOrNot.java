package com.oops;

public class AnagramOrNot {

	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		if (s1.length() != s2.length()) {
			System.out.println("String is not anagram");
			return;
		}
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch != ' ') {
				count++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch != ' ') {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("String is not anagram");
		}
		count++;
		System.out.println("String is anagram");
	}
}
