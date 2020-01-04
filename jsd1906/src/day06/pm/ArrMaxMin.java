package day06.pm;

public class ArrMaxMin {
	public static void main(String[] args) {
		int[] arr= {1,2,3,8,9,-12,7,39};
		int temp=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<temp){
				temp=arr[i];
			}
		}
		System.out.println("最小值是"+temp);
	}
}
