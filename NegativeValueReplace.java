package com.oops;

import java.util.Arrays;

//wap ro replace negative with its immediate 
//left elements square input=arr[]=[12,3,-19,29,5,-61,44,7,-9]
public class NegativeValueReplace {

	public static void negativereplace(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i - 1] * arr[i - 1];
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		negativereplace(arr);
		System.out.println(Arrays.toString(arr));
	}
}
