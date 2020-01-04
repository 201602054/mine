package day06.pm;

import java.util.Arrays;
import java.util.Random;

public class Work2 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int max=arr[0];
		for(int i=0;i<5;i++) {
			arr[i]=new Random().nextInt(20);//产生随机数赋值给数组
			if (arr[i]>max) {//找最大值
				max=arr[i];
			}
			System.out.print(arr[i]+",");//输出产生的随机数
		}
		System.out.println("\n"+max);
		
		int[] nums=Arrays.copyOf(arr,arr.length+1);//扩容
		nums[nums.length-1]=max;//最大值赋值给扩容的数组的最后一位
		Arrays.sort(nums);//数组升序
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		
		
		System.out.println();
		for (int i = nums.length -1; i >=0; i--) {//降序输出
			System.out.print(nums[i]+",");
		}
		System.out.println(""+'a'+2+2.2);
	}
	
}
