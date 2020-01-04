package day06.pm;

import java.util.Arrays;

public class Work1 {
	public static void main(String[] args) {
		int[] nums = { 7, 6, 5, 4, 3, 2, 1 };
		int[] arr = Arrays.copyOf(nums, nums.length + 1);
		int[] arr1 = Arrays.copyOf(nums, nums.length - 2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\n" + arr[i]);
		}

	}
}
