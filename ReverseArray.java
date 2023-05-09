package com.oops;

//wap to reverse array itself dont print array in reverse i want 
//curent array reverse means eg:-arr[]=[3,90,45,29,37,78]
//so your same array must be [78,37,,45,90,3]without using temporary array
public class ReverseArray {

	public static void ReverseArray(int arr[]) {

		int array[] = new int[arr.length];
		int count = 0;
		for (int i = (arr.length - 1); i >= 0; i--) {
			array[count++] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 90, 45, 29, 37, 78 };
		ReverseArray(arr);
		System.out.println("Reverse array:-");
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}

}
