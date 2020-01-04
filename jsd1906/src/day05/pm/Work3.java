package day05.pm;

public class Work3 {
	public static void main(String[] args) {
		//使用continue实现一个1~100以内奇数的和
		int sum=0;
		for (int i = 1; i <=100 ; i++) {
			if (i%2==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}
}
