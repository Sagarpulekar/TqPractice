package com.oops;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 6, 7, 9, 1 };
		int[] arr2 = { 10, 20, 30 };

		int[] merge = new int[arr1.length + arr2.length];

		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			merge[temp++] = arr1[i];
			if (i % 2 == 0 && i < arr1.length - 1) {
				merge[temp++] = arr2[i / 2];
			}
		}

		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + " ");
		}
	}
}
