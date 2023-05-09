package com.oops;

public class RepeatedWords {

	public static void mains(String[] args) {

		String str = "Race the Race with racing car";
		String[] words = str.split(" ");
		String s = null;
//		int temp = 0;

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(words[i]);
				// temp = count;
				// s = words[i];
			}
		}

		// System.out.println(s);
		// System.out.println(temp);
	}
}
