package day06.pm;

import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {
		int[] arr= {7,3,9,6,2,1};
		Arrays.sort(arr);//升序
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//降序输出
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
