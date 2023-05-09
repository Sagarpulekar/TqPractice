package com.oops;

public class ReverseString {
	public static String reverseString(String str) {
		char[] Ch = str.toCharArray();
		int left = 0;
		int right = Ch.length - 1;

		while (left < right) {
			char temp = Ch[left];
			Ch[left] = Ch[right];
			Ch[right] = temp;
			left++;
			right--;
		}

		return new String(Ch);
	}

	public static void mains(String[] args) {
		String original = "hello world";
		String reversed = reverseString(original);
		System.out.println(reversed);
	}
}
