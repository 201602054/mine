package day06.am;

import java.util.Arrays;

public class CharArrDemo {
	public static void main(String[] args) {
		char[] arr= {'o','d','b','c','a'};//
		Arrays.sort(arr);//升序排序
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}	
