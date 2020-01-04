package ArrayPractice;

public class Array7_1 {

	public static void main(String[] args) {
		// 定义一个数组int[] nums={8,7,3,9,5,4,1}
//		输出数组中的最大值和最大值所在的下标
		int max=0;
		int index=0;
		int[] nums={8,7,3,9,5,4,1};
		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>max) {
				max=nums[i];
				index=i;
			}
			
		}
		System.out.println("最大值是"+max);
		System.out.println("最大值下标是"+index);
	}

}
