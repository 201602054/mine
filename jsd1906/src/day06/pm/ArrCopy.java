package day06.pm;

public class ArrCopy {
	public static void main(String[] args) {
		int[] nums= {1,35,85,5,4,8,57};
		//定义一个新数组
		int[] arr=new int[nums.length];
		/*
			1 源数组
			2源数组起始位置
			3目标数组
			4目标数组起始位置
			5复制的元素个数
		*/
		System.arraycopy(nums, 1, arr, 0, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
}
