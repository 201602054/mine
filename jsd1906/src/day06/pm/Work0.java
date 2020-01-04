package day06.pm;


import java.util.Arrays;

public class Work0 {
	public static void main(String[] args) {
		int[] nums= {6,3,9,7,5,4,8,1};//得到{0,0,0,9,7,5,4,8,1}    9
		int[] arr=new int[9];
		System.arraycopy(nums, 2, arr, 3, 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");

		}
		Arrays.sort(arr);//升序
		System.out.println("\n"+Arrays.toString(arr));//元素连接成字符串

		int[] a=Arrays.copyOf(arr, 5);//数组缩容
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
	}
}
