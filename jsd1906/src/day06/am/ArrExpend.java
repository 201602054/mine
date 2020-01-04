package day06.am;

import java.util.Arrays;

public class ArrExpend {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[] arr1=Arrays.copyOf(arr, 5);//数组扩容
		int[] arr2=Arrays.copyOf(arr, 2);//数组缩容
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
}
